package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

import java.util.List;

public record ClientResponseDto(
     Long id,
     String DateOfBirth,
     String desactivated,
     List<String> listOfPermis,
     String RegistrationDate,
     String password,
     String email,
     Adress adress,
     String firstName,
     String lastName
)
{}
