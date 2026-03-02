package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BikeMapper {


    Bike toBike(BikeRequestDto bikeRequestDto);
}

