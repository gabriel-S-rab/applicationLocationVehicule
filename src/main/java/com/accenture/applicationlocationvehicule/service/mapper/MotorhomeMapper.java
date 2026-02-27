package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.MotorHome;
import com.accenture.applicationlocationvehicule.service.dto.MotorHomeRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MotorhomeMapper {

    @Mapping()
    MotorHome toMotohome(MotorHomeRequestDto motorHomeRequestDto);
}
