package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorResponseDto;

import java.util.List;

public interface Administratorservice {

AdministratorResponseDto addAdministrator(AdministratorRequestDto administratorRequestDto);

AdministratorResponseDto findByIdAdministrator(AdministratorRequestDto administratorRequestDto);

  List<AdministratorResponseDto> findAllAdministrator();

AdministratorResponseDto deleteByIdAdministrator(AdministratorRequestDto administratorRequestDto);
}
