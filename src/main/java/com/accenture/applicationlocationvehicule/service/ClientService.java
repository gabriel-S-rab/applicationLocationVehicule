package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClientService {

    ClientResponseDto addClient(ClientRequestDto clientRequestDto);


    ClientResponseDto findByIdClient(ClientRequestDto clientRequestDto);

    List<ClientResponseDto> findAllClient();

    ClientResponseDto deleteByIdClient(ClientRequestDto clientRequestDto);
}
