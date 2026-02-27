package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Motorcycle;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MotorcycleMapper {

    @Mapping()
    Motorcycle toMotorcycle(MotorcycleRequestDto motorcycleRequestDto);
}
