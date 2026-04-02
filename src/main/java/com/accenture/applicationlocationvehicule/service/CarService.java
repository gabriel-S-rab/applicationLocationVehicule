package com.accenture.applicationlocationvehicule.service;


import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;

import java.util.List;
import java.util.UUID;

public interface CarService {

    CarResponseDto addCar(CarRequestDto carRequestDto);

    CarResponseDto findByIdCar(UUID id);

    List<CarResponseDto> findAllCar();

    List<CarResponseDto> findByRemovedFleet(boolean removedFleet);

    CarResponseDto deleteByIdCar(CarRequestDto carRequestDto);

    CarResponseDto updateCar(UUID id , CarRequestDto carRequestDto);
}

