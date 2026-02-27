package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;

import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public CarResponseDto addCar(CarRequestDto carRequestDto) {
        return null;
    }

    @Override
    public CarResponseDto findByIdCar(CarRequestDto carRequestDto) {
        return null;
    }

    @Override
    public List<CarResponseDto> findAllCar() {
        return List.of();
    }

    @Override
    public CarResponseDto deleteByIdCar(CarRequestDto carRequestDto) {
        return null;
    }
}
