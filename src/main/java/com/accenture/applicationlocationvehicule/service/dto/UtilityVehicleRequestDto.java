package com.accenture.applicationlocationvehicule.service.dto;

public record UtilityVehicleRequestDto(
     int id,
     int baseRate,
     String brand,
     String model,
     String color,
     String numberOfSeats,
     String fuelType,
     String transmission,
     boolean airConditionning,
     int maximumLoad,
     int weight,
     int capacity,
     String type,
     String license,
     int mileage,
     boolean removedFromFleet,
     boolean active
)
{}
