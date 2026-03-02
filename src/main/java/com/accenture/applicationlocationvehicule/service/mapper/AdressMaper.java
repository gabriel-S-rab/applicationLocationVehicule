package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AdressMaper {

    @Mapping(source = "id",target = "Adress.id")
    @Mapping(source = "street",target="Adress.street")
    @Mapping(source = "city",target = "Adress.city")
    @Mapping(source = "postalCode" , target = "Adress.postalCode")
    Adress toAdress(AdressRequestDto adressRequestDto);
}

