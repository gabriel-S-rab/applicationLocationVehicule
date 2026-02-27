package com.accenture.applicationlocationvehicule.service.dto;

public record AdministratorResponseDto(
        int id,
    String lastName,
    String firstName,
    String function,
    String email,
    String password
)
{}
