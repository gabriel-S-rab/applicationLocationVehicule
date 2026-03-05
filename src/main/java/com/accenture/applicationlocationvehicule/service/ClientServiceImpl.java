package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.exception.AdressException;
import com.accenture.applicationlocationvehicule.exception.ClientException;
import com.accenture.applicationlocationvehicule.repository.ClientDao;
import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdressMapper;
import com.accenture.applicationlocationvehicule.service.mapper.ClientMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;



@Service
public class ClientServiceImpl implements ClientService{


    private final AdressMapper adressMapper;
    private final ClientMapper clientMapper;
    private final ClientDao clientDao;


    public ClientServiceImpl(AdressMapper adressMapper, ClientMapper clientMapper, ClientDao clientDao) {
        this.adressMapper = adressMapper;
        this.clientMapper = clientMapper;
        this.clientDao = clientDao;
    }


   @Override
   @Transactional
   public ClientResponseDto addClient(ClientRequestDto clientRequestDto){
        if(clientRequestDto.dateOfBirth() == null || clientRequestDto.dateOfBirth().isBlank()
           || clientRequestDto.adress() == null
                || clientRequestDto.email() == null || clientRequestDto.email().isBlank()
               || clientRequestDto.password()== null || clientRequestDto.password().isBlank()
        || clientRequestDto.firstName() == null || clientRequestDto.firstName().isBlank()
        || clientRequestDto.lastName() == null || clientRequestDto.lastName().isBlank())
            throw new ClientException("erreur lors de l'ajout du client"+HttpStatus.BAD_REQUEST);
        Client client = clientMapper.toClient(clientRequestDto);
      Date dateToday = new Date();
       SimpleDateFormat dateForma = new SimpleDateFormat("EEE dd MMM yyyy HH:mm:ss");
      String stringDateFormat = dateForma.format(dateToday);
       client.setRegistrationDate(stringDateFormat);
       client.setDesactivated("false");
        Client saved  =  clientDao.save(client);
      if(saved == null)
          throw new ClientException("erreur lors de l'ajout du client"+HttpStatus.BAD_REQUEST);
         ClientResponseDto clientResponseDto = clientMapper.toClientResponseDto(client);
        return clientResponseDto;
       }



    @Override
    public ClientResponseDto findByClient(String email, String password){  // gerer retour password (dto spécifique / gestion controller ?)
     Optional<Client> optClient =  clientDao.findByEmail(email);
      if(optClient.isPresent() && optClient.get().getPassword().equals(password)){
           Client client = optClient.get();
          // client.setPassword("**********");
       //    client.setDesactivated(null);
         ClientResponseDto clientResponseDto = clientMapper.toClientResponseDto(client);
         return clientResponseDto;
    } else if(optClient.isEmpty() || !optClient.get().getPassword().equals(password)){
          throw new ClientException("erreur lors de la recuperation des informations du client"+HttpStatus.BAD_REQUEST);
      }
    return null;
    }



    @Override
    public List<ClientResponseDto> findAllClient() {
        return List.of();
    }



    @Override
    @Transactional
    public ClientResponseDto deleteByClient(String email , String password){
        ClientResponseDto clientResponseDto = findByClient(email,password);
        Client client = clientMapper.toClient(clientResponseDto);
        if(client != null) {
            clientDao.delete(client);
            return clientResponseDto;
        }else{
            throw new ClientException("erreur lors de la suppression du client");
        }
    }


    @Transactional
    public ClientResponseDto updateClient(String email , String password , ClientRequestDto clientRequestDto){
      ClientResponseDto clientResponseDto = findByClient(email,password);
                 Client newInfoClient = clientMapper.toClient(clientRequestDto);
                 Client clientExist = clientMapper.toClient(clientResponseDto);
            if (!clientExist.getPassword().equals(clientResponseDto.password()) && clientRequestDto.password() != null && !clientRequestDto.password().equals("string") && !clientRequestDto.password().isBlank())
                clientExist.setPassword(clientResponseDto.password());
                if (!clientExist.getAdress().getCity().equals(newInfoClient.getAdress().getCity()) && clientRequestDto.adress().city() != null && !clientRequestDto.adress().city().equals("string") && !clientRequestDto.adress().city().isBlank()) {
                    if (!clientExist.getAdress().getStreet().equals(newInfoClient.getAdress().getStreet()) && clientRequestDto.adress().street() != null && !clientRequestDto.adress().street().equals("string") && !clientRequestDto.adress().street().isBlank()) {
                        if (!clientExist.getAdress().getPostalCode().equals(newInfoClient.getAdress().getPostalCode()) && clientRequestDto.adress().postalCode() != null && !clientRequestDto.adress().postalCode().equals("string") && !clientRequestDto.adress().postalCode().isBlank()) {
                            Adress adress = new Adress(clientRequestDto.adress().street(), clientRequestDto.adress().city(), clientRequestDto.adress().postalCode());
                            clientExist.setAdress(adress);
                        } else {
                            throw new AdressException("tout les éléments de l'adresse doivent étre saisi");
                        }
                    } else {
                        throw new AdressException("tout les éléménts de l'adresse doivent étre saisi");
                    }
                }else {
                    throw new AdressException("tout les champs doivent étre saisi");
                }
                if(!clientExist.getEmail().equals(clientRequestDto.email()) && clientRequestDto.email() != null && !clientRequestDto.email().equals("string") && !clientRequestDto.email().isBlank())
                    clientExist.setEmail(clientRequestDto.email());
               if(!clientExist.getFirstName().equals(clientRequestDto.firstName()) && clientRequestDto.firstName() != null && !clientRequestDto.firstName().equals("string") && !clientRequestDto.firstName().isBlank())
                   clientExist.setFirstName(clientRequestDto.firstName());
               if(!clientExist.getLastName().equals(clientRequestDto.lastName()) && clientRequestDto.lastName() != null && !clientRequestDto.lastName().equals("string") && !clientRequestDto.lastName().isBlank())
                   clientExist.setLastName(clientRequestDto.lastName());
               if(!clientExist.getDateOfBirth().equals(clientRequestDto.dateOfBirth()) && clientRequestDto.dateOfBirth() != null && !clientRequestDto.dateOfBirth().equals("string") && !clientRequestDto.dateOfBirth().isBlank())
                   clientExist.setDateOfBirth(clientRequestDto.dateOfBirth());
               if(!clientExist.getListOfLicenses().equals(clientRequestDto.listOfLicenses()))
                   clientExist.setListOfLicenses(clientRequestDto.listOfLicenses());
               Client saved = clientDao.saveAndFlush(clientExist);
               ClientResponseDto clientResponseDto1 = clientMapper.toClientResponseDto(saved);
               if(saved == null)
                   throw new ClientException("erruer lors de la modification du client");
               else
                   return clientResponseDto1;
    }




        }








