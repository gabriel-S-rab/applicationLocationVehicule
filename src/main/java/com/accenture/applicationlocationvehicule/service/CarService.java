package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.repository.entity.Car;
import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;

import java.util.List;

public interface CarService {

    CarResponseDto addCar(CarRequestDto carRequestDto);

    CarResponseDto findByIdCar(Long id);

    List<CarResponseDto> findAllCar();

    List<CarResponseDto> findByRemovedFleet(boolean removedFleet);

    CarResponseDto deleteByIdCar(CarRequestDto carRequestDto);

    CarResponseDto updateCar(Long id , CarRequestDto carRequestDto);
}

