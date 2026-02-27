package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public record RentalResponseDto(
     int id,
     int NumberOfKilometersTraveled,
     int TotalAmount,
     String validationDate,
     String rentalStatus,
     Client client,
     Vehicle vehicule,
//   Accessory accessory;
     String startDate,
     String endDate
)
{}
