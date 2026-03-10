package com.accenture.applicationlocationvehicule.service.dto;



import java.util.List;

public record ClientRequestDto(
     String dateOfBirth,
     List<String> listOfLicenses,
     String password,
     String email,
     AdressRequestDto adress,
     String firstName,
     String lastName
)
{}
