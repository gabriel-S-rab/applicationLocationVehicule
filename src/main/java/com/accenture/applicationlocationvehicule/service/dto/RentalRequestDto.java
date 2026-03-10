package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;

import java.util.UUID;

public record RentalRequestDto(
     UUID id,
     int numberOfKilometersTraveled,
     int totalAmount,
     String validationDate,
     String rentalStatus,
     Client client,
     Vehicle vehicule,
     String startDate,
     String endDate
)
{}
