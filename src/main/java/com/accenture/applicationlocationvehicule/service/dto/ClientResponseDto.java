package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;


import java.util.List;
import java.util.UUID;

public record ClientResponseDto(
     UUID id,
     String dateOfBirth,
     boolean desactivated,
     List<String> listOfLicenses,
     String registrationDate,
     String password,
     String email,
     Adress adress,
     String firstName,
     String lastName
)
{}
