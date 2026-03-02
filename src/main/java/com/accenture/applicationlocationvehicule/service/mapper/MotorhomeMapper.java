package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Motorhome;
import com.accenture.applicationlocationvehicule.service.dto.MotorHomeRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MotorhomeMapper {

    @Mapping(source = "id" , target = "Motorhome.id")
    @Mapping(source = "airConditionning" , target = "Motohome.airConditionning")
    @Mapping(source = "refrigerator" , target = "Motorhome.refrigeratorEquipement")
    @Mapping(source = "brand" , target = "Motorhome.brand")
    @Mapping(source = "model" , target = "Motohome.model")
    @Mapping(source = "color" , target = "Motorhome.color")
    @Mapping(source = "numberOfSeats" , target = "Motorhome.numberOfSeats")
    @Mapping(source = "fuelType" , target = "Motorhome.fuelType")
    @Mapping(source = "transmission" , target = "Motorhome.transmission")
    @Mapping(source = "weight" , target = "Motorhome.weight")
    @Mapping(source = "requiredLicense" , target = "Motorhome.requiredLicense")
    @Mapping(source = "type" , target = "Motorhome.type")
    @Mapping(source = "showerEquipement" , target = "Motorhome.showerEquipement")
    @Mapping(source = "bedlinen" , target = "Motorhome.bedlinen")
    @Mapping(source = "height" , target = "Motorhome.height")
    @Mapping(source = "numberOfBed" , target = "Motorhome.numberOfBed")
    @Mapping(source = "kitchenEquipement" , target = "Motohome.kitchenEquipement")
    @Mapping(source = "mileage" , target = "Motorhome.mileage")
    Motorhome toMotohome(MotorHomeRequestDto motorHomeRequestDto);
}

