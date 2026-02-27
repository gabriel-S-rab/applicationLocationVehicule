package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adminstrator;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AdministratorMapper {

    @Mapping()
    Adminstrator toAdministrator(AdministratorRequestDto administratorRequestDto);
}
