package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;

import java.util.List;

public interface BikeService {

    BikeResponseDto addBike(BikeRequestDto bikeRequestDto);

    BikeResponseDto findByIdBike(BikeRequestDto bikeRequestDto);

    List<BikeResponseDto> findAllBike();

    BikeResponseDto deleteByIdBike(BikeRequestDto bikeRequestDto);


}
