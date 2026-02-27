package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;


public record VehicleRequestDto(
     int id,
     Vehicle vehicle
)
{}

