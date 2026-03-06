package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;

import java.util.List;

public interface BikeService {



    BikeResponseDto findByIdBike(Long id);

    List<BikeResponseDto> findAllBike();

    BikeResponseDto updateBike(Long id , BikeRequestDto bikeRequestDto);

    List<BikeResponseDto> findByRemovedFromThePark(boolean removedOnTheFleet);


}
