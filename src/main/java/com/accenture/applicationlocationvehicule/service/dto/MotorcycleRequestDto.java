package com.accenture.applicationlocationvehicule.service.dto;

public record MotorcycleRequestDto(
        String name,
     int powerInKw,
     String transmission,
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
