package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mybatis.spring.mapper.*;

@Mapper(componentModel = "spring")
public interface AdressMaper {

//    @Mapping(source = "id",target = "adress.id")
//    @Mapping(source = "street",target="adress.street")
//    @Mapping(source = "city",target = "adress.city")
//    @Mapping(source = "postalCode" , target = "adress.postalCode")
    Adress toAdress(AdressRequestDto adressRequestDto);
}

