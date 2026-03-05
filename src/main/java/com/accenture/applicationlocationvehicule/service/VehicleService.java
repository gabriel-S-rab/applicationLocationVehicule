package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import com.accenture.applicationlocationvehicule.service.dto.BoiteGenericDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleResponseDto;

import java.util.List;

public interface VehicleService {

    VehicleResponseDto addVehicle(VehicleRequestDto vehicleRequestDto);

    VehicleResponseDto findByIdVehicle(VehicleRequestDto vehicleRequestDto);

    List<BoiteGenericDto> findAll();

    VehicleResponseDto deleteByIdVehicle(VehicleRequestDto vehicleRequestDto);


}
