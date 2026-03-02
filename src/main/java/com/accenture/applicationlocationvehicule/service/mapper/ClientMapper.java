package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
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
    @Mapping(source = "adress" , target = "Adress") // verifier lien avec un object
    @Mapping(source = "firstName" , target = "Client.firstName")
    @Mapping(source = "lastName" , target = "Client.lastName")
    Client toClient(ClientRequestDto clientRequestDto);
}

