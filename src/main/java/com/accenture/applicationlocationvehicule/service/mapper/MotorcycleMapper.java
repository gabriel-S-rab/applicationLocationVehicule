package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Motorcycle;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleRequestDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface MotorcycleMapper {


    Motorcycle toMotorcycle(MotorcycleRequestDto motorcycleRequestDto);
}

