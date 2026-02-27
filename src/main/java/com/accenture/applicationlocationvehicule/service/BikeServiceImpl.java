package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;

import java.util.List;

public class BikeServiceImpl implements  BikeService{
    @Override
    public BikeResponseDto addBike(BikeRequestDto bikeRequestDto) {
        return null;
    }

    @Override
    public BikeResponseDto findByIdBike(BikeRequestDto bikeRequestDto) {
        return null;
    }

    @Override
    public List<BikeResponseDto> findAllBike() {
        return List.of();
    }

    @Override
    public BikeResponseDto deleteByIdBike(BikeRequestDto bikeRequestDto) {
        return null;
    }
}
