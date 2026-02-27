package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Car;
import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper {

    @Mapping()
    Car toCar(CarRequestDto carRequestDto);
}
