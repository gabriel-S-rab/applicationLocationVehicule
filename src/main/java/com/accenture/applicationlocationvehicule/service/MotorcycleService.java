package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.MotorHomeResponseDto;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleResponseDto;

import java.util.List;

public interface MotorcycleService {

    MotorcycleResponseDto addMotorcycle(MotorcycleRequestDto motorcycleRequestDto);

    MotorcycleResponseDto findByIdMotorcycle(MotorcycleRequestDto motorcycleRequestDto);

    List<MotorcycleResponseDto> findAllMotorcycle();

    MotorHomeResponseDto deleteById(MotorcycleRequestDto motorcycleRequestDto);
}
