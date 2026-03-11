package com.accenture.applicationlocationvehicule.service.dto;

import java.util.UUID;

public record AdministratorResponseDto(
        UUID id,
        String lastName,
        String firstName,
        String function,
        String email,
        String password
)
{}
