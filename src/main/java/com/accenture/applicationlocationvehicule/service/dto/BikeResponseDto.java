package com.accenture.applicationlocationvehicule.service.dto;

import java.util.UUID;

public record BikeResponseDto(
     UUID id,
     int framSize,
     String brand,
     String color,
     boolean removedFromThePark,
     boolean active,
     int mileage,
     int weight,
     boolean electric,
     boolean discBrake,
     String type,
     String requiredLicense,
     int dailyBaseRate
)
{}
