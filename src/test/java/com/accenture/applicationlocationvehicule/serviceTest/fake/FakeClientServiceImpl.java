package com.accenture.applicationlocationvehicule.serviceTest.fake;

import com.accenture.applicationlocationvehicule.exception.AdressException;
import com.accenture.applicationlocationvehicule.exception.ClientException;
import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.ClientService;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;



@Service
public class FakeClientServiceImpl implements ClientService {


    private final FakeClientMapper fakeClientMapper = new FakeClientMapper();
    private final FakeClientDao fakeClientDao = new FakeClientDao();
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public FakeClientServiceImpl() {

    }



    @Transactional
    public ClientResponseDto addClient(FakeClientRequestDto fakeClientRequestDto){
        if(fakeClientRequestDto.dateOfBirth() == null || fakeClientRequestDto.dateOfBirth().isBlank()
                || fakeClientRequestDto.adress() == null
                || fakeClientRequestDto.email() == null || fakeClientRequestDto.email().isBlank()
                || fakeClientRequestDto.password()== null || fakeClientRequestDto.password().isBlank()
                || fakeClientRequestDto.firstName() == null || fakeClientRequestDto.firstName().isBlank()
                || fakeClientRequestDto.lastName() == null || fakeClientRequestDto.lastName().isBlank())
            throw new ClientException("erreur lors de l'ajout du client"+HttpStatus.BAD_REQUEST);
        Client client = fakeClientMapper.toClient(fakeClientRequestDto);
        Date dateToday = new Date();
        SimpleDateFormat dateForma = new SimpleDateFormat("EEE dd MMM yyyy HH:mm:ss");
        String stringDateFormat = dateForma.format(dateToday);
        client.setRegistrationDate(stringDateFormat);   // pb
        client.setDesactivated(false);
        client.setPassword(passwordEncoder.encode(fakeClientRequestDto.password()));
        Client saved  =  fakeClientDao.save(client);
        if(saved == null)
            throw new ClientException("erreur lors de l'ajout du client"+HttpStatus.BAD_REQUEST);
        ClientResponseDto clientResponseDto = fakeClientMapper.toClientResponseDto(client);
        return clientResponseDto;
    }


    @Override
    public ClientResponseDto addClient(ClientRequestDto clientRequestDto) {
        return null;
    }



    @Override
    public ClientResponseDto findByClient(String email, String password){  // gerer retour password (dto spécifique / gestion controller ?)
        Optional<Client> optClient =  fakeClientDao.findByEmail(email);
        if(optClient.isPresent()){
            Client client = optClient.get();
            if(passwordEncoder.matches(password, client.getPassword())) {
                return fakeClientMapper.toClientResponseDto(client);
            }
        }
            throw new ClientException("error");
    }



    @Override
    public List<ClientResponseDto> findAllClient() {
        return List.of();
    }



    @Override
    @Transactional
    public ClientResponseDto deleteByClient(String email , String password){
        ClientResponseDto clientResponseDto = findByClient(email,password);
        Client client = fakeClientMapper.toClient(clientResponseDto);
        if(client != null) {
            fakeClientDao.delete(client);
            return clientResponseDto;
        }else{
            throw new ClientException("erreur lors de la suppression du client");
        }
    }


    @Transactional
    public ClientResponseDto updateClient(String email , String password , ClientRequestDto clientRequestDto) {
        ClientResponseDto clientResponseDto = findByClient(email, password);
        if (passwordEncoder.matches(password,clientResponseDto.password())) {
            Client newInfoClient = fakeClientMapper.toClient(clientRequestDto);
            Client clientExist = fakeClientMapper.toClient(clientResponseDto);
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
            } else {
                throw new AdressException("tout les champs doivent étre saisi");
            }
            if (!clientExist.getEmail().equals(clientRequestDto.email()) && clientRequestDto.email() != null && !clientRequestDto.email().equals("string") && !clientRequestDto.email().isBlank())
                clientExist.setEmail(clientRequestDto.email());
            if (!clientExist.getFirstName().equals(clientRequestDto.firstName()) && clientRequestDto.firstName() != null && !clientRequestDto.firstName().equals("string") && !clientRequestDto.firstName().isBlank())
                clientExist.setFirstName(clientRequestDto.firstName());
            if (!clientExist.getLastName().equals(clientRequestDto.lastName()) && clientRequestDto.lastName() != null && !clientRequestDto.lastName().equals("string") && !clientRequestDto.lastName().isBlank())
                clientExist.setLastName(clientRequestDto.lastName());
            if (!clientExist.getDateOfBirth().equals(clientRequestDto.dateOfBirth()) && clientRequestDto.dateOfBirth() != null && !clientRequestDto.dateOfBirth().equals("string") && !clientRequestDto.dateOfBirth().isBlank())
                clientExist.setDateOfBirth(clientRequestDto.dateOfBirth());
            if (!clientExist.getListOfLicenses().equals(clientRequestDto.listOfLicenses()))
                clientExist.setListOfLicenses(clientRequestDto.listOfLicenses());
            Client saved = fakeClientDao.saveAndFlush(clientExist);
            ClientResponseDto clientResponseDto1 = fakeClientMapper.toClientResponseDto(saved);
            if (saved == null)
                throw new ClientException("erruer lors de la modification du client");
            else
                return clientResponseDto1;
        }
        throw new ClientException("erreur");
    }



}
