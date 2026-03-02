package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface AdressMapper {


    Adress toAdress(AdressRequestDto adressRequestDto);
}

