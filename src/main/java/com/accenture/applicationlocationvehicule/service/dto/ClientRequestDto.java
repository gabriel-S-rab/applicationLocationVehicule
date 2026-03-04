package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

import java.util.List;

public record ClientRequestDto(
     String dateOfBirth,
   //  String desactivated,
     List<String> listOfLicenses,
  //   String registrationDate,
     String password,
     String email,
     AdressRequestDto adress,
     String firstName,
     String lastName
)
{}
