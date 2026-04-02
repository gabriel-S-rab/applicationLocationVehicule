package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.MotorHomeResponseDto;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleResponseDto;

import java.util.List;

public class MotorcycleServiceImpl implements MotorcycleService{
    @Override
    public MotorcycleResponseDto addMotorcycle(MotorcycleRequestDto motorcycleRequestDto) {
        return null;
    }

    @Override
    public MotorcycleResponseDto findByIdMotorcycle(MotorcycleRequestDto motorcycleRequestDto) {
        return null;
    }

    @Override
    public List<MotorcycleResponseDto> findAllMotorcycle() {
        return List.of();
    }

    @Override
    public MotorHomeResponseDto deleteById(MotorcycleRequestDto motorcycleRequestDto) {
        return null;
    }
}
