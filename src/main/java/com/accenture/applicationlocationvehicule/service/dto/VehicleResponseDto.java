package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;

import java.util.UUID;


public record VehicleResponseDto(
     UUID id,
     Vehicle vehicle
)
{}

