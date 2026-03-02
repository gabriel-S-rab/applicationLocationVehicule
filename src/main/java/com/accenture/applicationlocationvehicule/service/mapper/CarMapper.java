package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Car;
import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import jakarta.xml.bind.SchemaOutputResolver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper {

    Car toCar(CarRequestDto carRequestDto);
}

