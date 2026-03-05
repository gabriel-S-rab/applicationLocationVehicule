package com.accenture.applicationlocationvehicule.service.dto;

public record BikeRequestDto(
     String name,
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
