package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorResponseDto;

import java.util.List;
import java.util.UUID;

public interface Administratorservice {

AdministratorResponseDto addAdministrator(AdministratorRequestDto administratorRequestDto);

AdministratorResponseDto findByIdAdministrator(AdministratorRequestDto administratorRequestDto);

  List<AdministratorResponseDto> findAllAdministrator();

AdministratorResponseDto deleteByIdAdministrator(UUID id);
}
