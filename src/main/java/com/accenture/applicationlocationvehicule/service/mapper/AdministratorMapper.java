package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Adminstrator;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AdministratorMapper {


    Adminstrator toAdministrator(AdministratorRequestDto administratorRequestDto);
}

