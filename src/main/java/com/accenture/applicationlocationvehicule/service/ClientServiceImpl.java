package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.repository.ClientDao;
import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdressMapper;
import com.accenture.applicationlocationvehicule.service.mapper.ClientMapper;

import org.springframework.stereotype.Service;

import java.util.List;

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
   public ClientResponseDto addClient(ClientRequestDto clientRequestDto) {
        Client client = clientMapper.toClient(clientRequestDto);
          clientDao.save(client);
          // gérer le retour
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
