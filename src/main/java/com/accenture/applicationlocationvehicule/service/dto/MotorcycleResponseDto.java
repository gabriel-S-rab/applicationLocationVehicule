package com.accenture.applicationlocationvehicule.service.dto;

import java.util.UUID;

public record MotorcycleResponseDto(
     UUID id,
     int powerInKw,
     String Transmission,
     String requiredLicense,
     String brand,
     String model,
     String color,
     int numberOfCylinder,
     int seatHeight,
     int weight,
     boolean removedFromFleet,
     boolean active,
     int dailyBaseRate,
     int mileage,
     String type,
     int displacement
)
{}
