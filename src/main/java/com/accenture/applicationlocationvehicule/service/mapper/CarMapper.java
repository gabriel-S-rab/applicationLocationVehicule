package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Car;
import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;
import jakarta.xml.bind.SchemaOutputResolver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    Car toCar(CarRequestDto carRequestDto);

    CarResponseDto toCarResponseDto(Car car); // a voir

    List<CarResponseDto> toCarResponseDto(List<Car> listCar);
}

