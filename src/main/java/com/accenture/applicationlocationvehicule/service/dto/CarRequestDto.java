package com.accenture.applicationlocationvehicule.service.dto;

public record CarRequestDto(
     int id,
     int numberOfDoors,
     int dailyBaseRentalRate,
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
     String licenseRequired,
     int mileage
)
{}
