package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.UtilityVehicle;
import com.accenture.applicationlocationvehicule.service.dto.UtilityVehicleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.UtilityVehicleResponseDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UtilityVehicleMapper {


    UtilityVehicle toUtilityVehicle(UtilityVehicleRequestDto utilityVehicleRequestDto);

    UtilityVehicleResponseDto toUtilityVehicleResponseDto(UtilityVehicle utilityVehicle);
}

