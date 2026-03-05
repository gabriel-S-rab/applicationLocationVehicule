package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import com.accenture.applicationlocationvehicule.service.dto.*;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface VehicleMapper {


    List<VehicleResponseDto> toListVehicleResponseDto(List<Vehicle> listVehicle);

    CarResponseDto toCarResponseDto(Vehicle vehicle); // test

    BikeResponseDto toBikeResponseDto(Vehicle  vehicle); //

    UtilityVehicleResponseDto  toUtilityVehicleResponseDto(Vehicle vehicle);

    MotorcycleResponseDto toMotorcycleResponseDto(Vehicle vehicle); // test

    MotorHomeResponseDto toMotorhomeResponseDto(Vehicle vehicle);
}
