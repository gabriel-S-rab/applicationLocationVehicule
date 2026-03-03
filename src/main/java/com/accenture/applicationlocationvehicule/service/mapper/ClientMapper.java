package com.accenture.applicationlocationvehicule.service.mapper;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;

import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = AdressMapper.class)
public interface ClientMapper {

    Client toClient(ClientRequestDto clientRequestDto);


    ClientResponseDto toClientResponseDto(Client client);

}

