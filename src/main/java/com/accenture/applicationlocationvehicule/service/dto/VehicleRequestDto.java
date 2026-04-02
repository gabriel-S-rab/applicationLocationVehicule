package com.accenture.applicationlocationvehicule.service.dto;




public record VehicleRequestDto(
    String typeVehicleChoice,
    BikeRequestDto bike,
    MotorcycleRequestDto motorcycle,
    MotorHomeRequestDto motorhome,
    CarRequestDto car,
    UtilityVehicleRequestDto utilityVehicle
)
{}

