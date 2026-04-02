package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Administrator;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorResponseDto;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface AdministratorMapper {


    Administrator toAdministrator(AdministratorRequestDto administratorRequestDto);

    AdministratorResponseDto toAdministratorResponseDto(Administrator administrator);

    List<AdministratorResponseDto> toAdministratorResponseDto(List<Administrator> administrateur);
}

