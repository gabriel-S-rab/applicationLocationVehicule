package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import com.accenture.applicationlocationvehicule.service.dto.VehicleRequestDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface VehicleMapper {


    Vehicle toVehicle(VehicleRequestDto vehicleRequestDto);
}
