package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import com.accenture.applicationlocationvehicule.service.dto.BoiteGenericDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleResponseDto;

import java.util.List;
import java.util.UUID;

public interface VehicleService {

    VehicleResponseDto addVehicle(VehicleRequestDto vehicleRequestDto);

    VehicleResponseDto findByIdVehicle(UUID id);

    List<BoiteGenericDto> findAll();

    VehicleResponseDto deleteByIdVehicle(UUID id);


}
