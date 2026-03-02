package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Motorhome;
import com.accenture.applicationlocationvehicule.service.dto.MotorHomeRequestDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface MotorhomeMapper {

    Motorhome toMotohome(MotorHomeRequestDto motorHomeRequestDto);
}

