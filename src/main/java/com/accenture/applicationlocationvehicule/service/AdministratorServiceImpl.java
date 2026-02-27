package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorResponseDto;

import java.util.List;

public class AdministratorServiceImpl implements Administratorservice {
    @Override
    public AdministratorResponseDto addAdministrator(AdministratorRequestDto administratorRequestDto) {
        return null;
    }

    @Override
    public AdministratorResponseDto findByIdAdministrator(AdministratorRequestDto administratorRequestDto) {
        return null;
    }

    @Override
    public List<AdministratorResponseDto> findAllAdministrator() {
        return List.of();
    }

    @Override
    public AdministratorResponseDto deleteByIdAdministrator(AdministratorRequestDto administratorRequestDto) {
        return null;
    }
}
