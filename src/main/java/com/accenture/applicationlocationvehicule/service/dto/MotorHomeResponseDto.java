package com.accenture.applicationlocationvehicule.service.dto;

public record MotorHomeResponseDto(
     int id,
     boolean airConditionning,
     boolean refrigeratorEquipement,
     String brand,
     String model,
     String color,
     int numberOfSeats,
     String fuelType,
     String transmission,
     int weight,
     String requiredLicense,
     String type,
     boolean showerEquipement,
     boolean bedlinen,
     int height,
     int numberOfBed,
     boolean kitchenEquipement,
     int mileage
)
    {}
