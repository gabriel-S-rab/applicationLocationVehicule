package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BikeMapper {

    @Mapping(source = "id",target = "Bike.id")
    @Mapping(source = "framSize" , target = "Bike.framSize")
    @Mapping(source = "brand" , target = "Bike.brand")
    @Mapping(source = "color" , target = "Bike.color")
    @Mapping(source = "removedFromThePark" , target = "Bike.removedFromThePark")
    @Mapping(source = "active" , target = "Bike.active")
    @Mapping(source = "mileage", target = "Bike.mileage")
    @Mapping(source = "weight" , target = "Bike.weight")
    @Mapping(source = "electric", target = "Bike.electric")
    @Mapping(source = "discBrake" , target = "Bike.discBrake")
    @Mapping(source = "type" , target = "Bike.type")
    @Mapping(source = "requiredLicense", target = "Bike.requiredLicense")
    @Mapping(source = "dailyBaseRate" , target = "Bike.dailyBaseRate")
    Bike toBike(BikeRequestDto bikeRequestDto);
}

