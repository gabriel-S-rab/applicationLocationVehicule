package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BikeMapper {


    Bike toBike(BikeRequestDto bikeRequestDto);

    BikeResponseDto toBikeResponseDto(Bike bike);
}

