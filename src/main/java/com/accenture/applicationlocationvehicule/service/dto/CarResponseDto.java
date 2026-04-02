package com.accenture.applicationlocationvehicule.service.dto;

import java.util.UUID;

public record CarResponseDto(
     UUID id,
     int NumberOfDoors,
     int DailyBaseRentalRate,
     String model,
     String brand,
     boolean removedFromTheFleet,
     boolean active,
     String color,
     int numberOfSeat,
     String typeOfFuel,
     boolean airConditionning,
     int numberOfLuggage,
     String type,
     String licenserequired,
     int mileage
)
{}
