package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdressResponseDto;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface AdressMapper {


    Adress toAdress(AdressRequestDto adressRequestDto);

    Adress toAdress(AdressResponseDto adressResponseDto);

    AdressRequestDto toAdressRequestDto(Adress adress);


}

