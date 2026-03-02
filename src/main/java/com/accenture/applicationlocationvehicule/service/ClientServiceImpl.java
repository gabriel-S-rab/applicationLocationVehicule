package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.repository.ClientDao;
import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdressMaper;
import com.accenture.applicationlocationvehicule.service.mapper.ClientMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private final AdressMaper adressMaper;
    private final ClientMapper clientMapper;
    private final ClientDao clientDao;

    public ClientServiceImpl(AdressMaper adressMaper, ClientMapper clientMapper, ClientDao clientDao) {
        this.adressMaper = adressMaper;
        this.clientMapper = clientMapper;
        this.clientDao = clientDao;
    }


    @Override
    public ClientResponseDto addClient(ClientRequestDto clientRequestDto) {
//        AdressRequestDto adressRequestDto = new AdressRequestDto(clientRequestDto.adress().id(),clientRequestDto.adress().street(),clientRequestDto.adress().city(),clientRequestDto.adress().postalCode());
//        Adress adress = new Adress(adressRequestDto.street(),adressRequestDto.city(),adressRequestDto.postalCode());
//        Client client = new Client(clientRequestDto.dateOfBirth(),clientRequestDto.desactivated(),clientRequestDto.listOfPermis(),clientRequestDto.registrationDate(),clientRequestDto.password(),clientRequestDto.email(),adress,clientRequestDto.firstName(),clientRequestDto.lastName());
//        Adress adress = adressMaper.toAdress(clientRequestDto.adress());

        AdressRequestDto adressRequestDto = clientRequestDto.adress();
        Adress adress = adressMaper.toAdress(adressRequestDto);
        Client client = clientMapper.toClient(clientRequestDto);
        client.setAdress(adress);
        clientDao.save(client);
        return null;
    }


    @Override
    public ClientResponseDto findByIdClient(ClientRequestDto clientRequestDto) {
        return null;
    }

    @Override
    public List<ClientResponseDto> findAllClient() {
        return List.of();
    }

    @Override
    public ClientResponseDto deleteByIdClient(ClientRequestDto clientRequestDto) {
        return null;
    }
}
