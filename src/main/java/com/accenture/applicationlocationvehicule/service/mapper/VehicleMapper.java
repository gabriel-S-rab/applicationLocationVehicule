package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import com.accenture.applicationlocationvehicule.service.dto.VehicleRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    @Mapping(source = "id" , target = "Vehicle.id")
    @Mapping(source = "vehicle" , target = "Vehicle")
    Vehicle toVehicle(VehicleRequestDto vehicleRequestDto);
}
