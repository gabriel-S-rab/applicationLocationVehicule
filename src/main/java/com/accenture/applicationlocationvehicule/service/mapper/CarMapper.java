package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Car;
import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import jakarta.xml.bind.SchemaOutputResolver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper {

    @Mapping(source = "id" , target = "Car.id")
    @Mapping(source = "numberOfDoors" , target = "Car.numberOfDoors")
    @Mapping(source = "dailyBaseRentalRat" , target = "Car.dailyBaseRentalRat")
    @Mapping(source = "model" , target = "Car.model")
    @Mapping(source = "brand" , target = "Car.target")
    @Mapping(source = "removedFromTheFleet" , target = "Car.removedFromTheFleet")
    @Mapping(source = "active" , target = "Car.active")
    @Mapping(source = "color" , target = "Car.color")
    @Mapping(source = "numberOfSeat" , target = "Car.numberOfSeat")
    @Mapping(source = "typeOfFuel" , target = "Car.typeOfFuel")
    @Mapping(source = "airConditionning" , target = "Car.airConditionning")
    @Mapping(source = "numberOfLuggage" , target = "Car.numberOfLuggage")
    @Mapping(source = "type" , target = "Car.type")
    @Mapping(source = "licenseRequired" , target = "Car.licenseRequired")
    @Mapping(source = "mileage" , target = "Car.mileage")
    Car toCar(CarRequestDto carRequestDto);
}

