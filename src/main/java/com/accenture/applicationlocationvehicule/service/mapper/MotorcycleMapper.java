package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Motorcycle;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MotorcycleMapper {

    @Mapping(source = "id" , target = "Motorcycle.id")
    @Mapping(source = "powerInKw" , target = "Motorcycle.powerInKw")
    @Mapping(source = "transmission" , target = "Motorcycle.transmission")
    @Mapping(source = "requiredLicense" , target = "Motorcycle.requiredLicense")
    @Mapping(source = "brand" , target = "Motorcycle.brand")
    @Mapping(source = "model" , target = "Motorcycle.model")
    @Mapping(source = "color" , target = "Motorcycle.color")
    @Mapping(source = "numerOfCylinder" , target = "Motorcycle.numberOfCylinder")
    @Mapping(source = "seatHeight" , target = "Motorcycle.seatHeight")
    @Mapping(source = "weight" , target = "Motorcycle.weight")
    @Mapping(source = "removedFromFleet" , target = "Motorcycle.removedFromFleet")
    @Mapping(source = "active" , target = "Motorcycle.active")
    @Mapping(source = "dailyBaseRate" , target = "Motorcycle.dailyBaseRate")
    @Mapping(source = "mileage" , target = "Motorcycle.mileage")
    @Mapping(source = "type" , target = "Motorcycle.type")
    @Mapping(source = "displacement" , target = "Motorcycle.displacement")
    Motorcycle toMotorcycle(MotorcycleRequestDto motorcycleRequestDto);
}

