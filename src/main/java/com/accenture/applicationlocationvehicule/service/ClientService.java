package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClientService {

    ClientResponseDto addClient(ClientRequestDto clientRequestDto);


    ClientResponseDto findByClient(String email, String password);

    List<ClientResponseDto> findAllClient();

    ClientResponseDto deleteByClient(String email ,String password);

    ClientResponseDto updateClient(String email , String password , ClientRequestDto clientRequestDto);
}
