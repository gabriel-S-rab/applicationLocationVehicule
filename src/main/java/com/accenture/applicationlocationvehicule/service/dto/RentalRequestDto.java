package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;

public record RentalRequestDto(
     int id,
     int NumberOfKilometersTraveled,
     int TotalAmount,
     String validationDate,
     String rentalStatus,
     Client client,
     Vehicle vehicule,
//  private Accessory accessory;
     String startDate,
     String endDate
)
{}
