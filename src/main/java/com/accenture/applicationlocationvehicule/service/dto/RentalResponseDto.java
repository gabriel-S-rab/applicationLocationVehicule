package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;

import java.util.UUID;


public record RentalResponseDto(
     UUID id,
     int NumberOfKilometersTraveled,
     int TotalAmount,
     String validationDate,
     String rentalStatus,
     Client client,
     Vehicle vehicule,
     String startDate,
     String endDate
)
{}
