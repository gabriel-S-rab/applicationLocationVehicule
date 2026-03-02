package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.UtilityVehicle;
import com.accenture.applicationlocationvehicule.service.dto.UtilityVehicleRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UtilityVehicleMapper {

    @Mapping(source = "id" , target = "UtilityVehicle.id")
    @Mapping(source = "baseRate" , target = "UtilityVehicle.baseRate")
    @Mapping(source = "brand" , target = "UtilityVehicle.brand")
    @Mapping(source = "model" , target = "UtilityVehicle.model")
    @Mapping(source = "color" , target = "UtilityVehicle.color")
    @Mapping(source = "numberOfSeats" , target = "UtilityVehicle.numberOfSeats")
    @Mapping(source = "fuelType" , target = "UtilityVehicle.fuelType")
    @Mapping(source = "transmission" , target = "UtilityVehicle.transmission")
    @Mapping(source = "airConditionning" , target = "UtilityVehicle.airConditionning")
    @Mapping(source = "maximumLoad" , target = "UtilityVehicle.maximumLoad")
    @Mapping(source = "weight" , target = "UtilityVehicle.weight")
    @Mapping(source = "capacity" , target = "UtilityVehicle.capacity")
    @Mapping(source = "type" , target = "UtilityVehicle.type")
    @Mapping(source = "license" , target = "UtilityVehicle.license")
    @Mapping(source = "mileage" , target = "UtilityVehicle.mileage")
    @Mapping(source = "removedFromFleet" , target = "UtilityVehicle.removedFromFleet")
    @Mapping(source = "active" , target = "UtilityVehicle.active")
    UtilityVehicle toUtilityVehicle(UtilityVehicleRequestDto utilityVehicleRequestDto);
}

