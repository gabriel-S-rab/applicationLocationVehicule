package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.*;


public record VehicleRequestDto(
    String typeVehicleChoice,
    BikeRequestDto bike,
    MotorcycleRequestDto motorcycle,
    MotorHomeRequestDto motorhome,
    CarRequestDto car,
    UtilityVehicleRequestDto utilityVehicle
)
{}

