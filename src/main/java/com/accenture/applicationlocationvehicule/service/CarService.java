package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;

import java.util.List;

public interface CarService {

    CarResponseDto addCar(CarRequestDto carRequestDto);

    CarResponseDto findByIdCar(CarRequestDto carRequestDto);

    List<CarResponseDto> findAllCar();

    CarResponseDto deleteByIdCar(CarRequestDto carRequestDto);
}
