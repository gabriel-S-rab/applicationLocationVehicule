package com.accenture.applicationlocationvehicule.service.dto;

import java.util.UUID;

public record UtilityVehicleResponseDto(
     UUID id,
     int baseRate,
     String brand,
     String model,
     String color,
     int numberOfSeats,
     String fuelType,
     String Transmission,
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
