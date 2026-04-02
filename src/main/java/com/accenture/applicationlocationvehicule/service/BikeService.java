package com.accenture.applicationlocationvehicule.service;


import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;

import java.util.List;
import java.util.UUID;

public interface BikeService {



    BikeResponseDto findByIdBike(UUID id);

    List<BikeResponseDto> findAllBike();

    BikeResponseDto updateBike(UUID id , BikeRequestDto bikeRequestDto);

    List<BikeResponseDto> findByRemovedFromThePark(boolean removedOnTheFleet);


}
