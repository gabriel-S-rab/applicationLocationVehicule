package com.accenture.applicationlocationvehicule.service.dto;

public record CarResponseDto(
     int id,
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
