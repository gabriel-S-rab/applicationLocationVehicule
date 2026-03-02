package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(source = "id" , target = "Client.id")
    @Mapping(source = "dateOfBirth" , target = "Client.dateOfBirth")
    @Mapping(source = "desactivated" , target = "Client.desactivated")
    @Mapping(source = "listOfPermis" , target = "Client.listOfPermis") // verifier fonctionnement avec une liste
    @Mapping(source = "ragistrationDate" , target = "Client.registrationDate")
    @Mapping(source = "password" , target = "Client.password")
    @Mapping(source = "email" , target = "Client.email")
    @Mapping(target = "", source = "adress", ignore = true) // verifier lien avec un object
    @Mapping(source = "firstName" , target = "Client.firstName")
    @Mapping(source = "lastName" , target = "Client.lastName")
    Client toClient(ClientRequestDto clientRequestDto);


    // a voir si cela fonctionne
    @Mapping(source = "Client.id" , target = "id")
    @Mapping(source = "Client.dateOfBirth" , target = "dateOfBirth")
    @Mapping(source = "Client.desactivated" , target = "desactivated")
    @Mapping(source = "Client.listOfPermis" , target = "listOfPermis") // verifier fonctionnement avec une liste
    @Mapping(source = "Client.ragistrationDate" , target = "registrationDate")
    @Mapping(source = "Client.password" , target = "password")
    @Mapping(source = "Client.email" , target = "email")
    @Mapping(source = "Adresse" , target = "adress") // verifier lien avec un object
    @Mapping(source = "Client.firstName" , target = "firstName")
    @Mapping(source = "Client.lastName" , target = "lastName")
    ClientResponseDto toClientResponseDto(Client client);
}

