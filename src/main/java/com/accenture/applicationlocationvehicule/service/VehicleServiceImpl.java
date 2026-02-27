package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.VehicleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleResponseDto;

import java.util.List;

public class VehicleServiceImpl implements VehicleService{
    @Override
    public VehicleResponseDto addVehicle(VehicleRequestDto vehicleRequestDto) {
        return null;
    }

    @Override
    public VehicleResponseDto findByIdVehicle(VehicleRequestDto vehicleRequestDto) {
        return null;
    }

    @Override
    public List<VehicleResponseDto> findAll() {
        return List.of();
    }

    @Override
    public VehicleResponseDto deleteByIdVehicle(VehicleRequestDto vehicleRequestDto) {
        return null;
    }
}
