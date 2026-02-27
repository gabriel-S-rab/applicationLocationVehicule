package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.UtilityVehicleResponseDto;
import com.accenture.applicationlocationvehicule.service.dto.UtilityVehicleRequestDto;

import java.util.List;

public interface UtilityVehicleService {

    UtilityVehicleResponseDto addUtilityVehicle(UtilityVehicleRequestDto utilityVehicleRequestDto);

    UtilityVehicleResponseDto findByIdUtilityVehicle(UtilityVehicleRequestDto utilityVehicleRequestDto);

    List<UtilityVehicleResponseDto> findAll();

    UtilityVehicleResponseDto deleteById(UtilityVehicleRequestDto utilityVehicleRequestDto);
}
