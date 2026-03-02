package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adminstrator;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AdministratorMapper {

    @Mapping(source = "id", target="Administratot.id")// verif si majuscul ou minuscul
    @Mapping(source = "lastName" , target="Administrateur.lastName")
    @Mapping(source = "firstName" , target ="Administrator.firstName")
    @Mapping(source = "function" , target="Administrator.function")
    @Mapping(source = "email" , target="Administrator.email")
    @Mapping(source = "password" , target="Administrator.password")
    Adminstrator toAdministrator(AdministratorRequestDto administratorRequestDto);
}

