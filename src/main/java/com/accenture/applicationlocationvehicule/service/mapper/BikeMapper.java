package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface BikeMapper {


    Bike toBike(BikeRequestDto bikeRequestDto);

    List<BikeResponseDto> toBikeResponseDto(List<Bike> listBike);

    BikeResponseDto toBikeResponseDto(Bike bike);

    List<BikeResponseDto> toListBikeResponseDto(List<Bike> listBike);

    Bike ToBike(BikeResponseDto bikeResponseDto);

}

