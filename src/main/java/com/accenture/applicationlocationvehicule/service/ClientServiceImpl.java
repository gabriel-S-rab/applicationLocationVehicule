package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;

import java.util.List;

public class ClientServiceImpl implements ClientService{
    @Override
    public ClientResponseDto addClient(ClientRequestDto clientRequestDto) {
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
