package com.accenture.applicationlocationvehicule.service.dto;

import java.util.UUID;

public record AdressResponseDto(
        UUID id,
    String street,
    String city,
    String postalCode
)
{}
