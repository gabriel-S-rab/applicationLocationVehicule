package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.UtilityVehicle;
import com.accenture.applicationlocationvehicule.service.dto.UtilityVehicleRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UtilityVehicleMapper {

    @Mapping()
    UtilityVehicle toUtilityVehicle(UtilityVehicleRequestDto utilityVehicleRequestDto);
}
