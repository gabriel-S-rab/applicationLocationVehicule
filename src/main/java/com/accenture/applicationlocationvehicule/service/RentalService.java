package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.RentalRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.RentalResponseDto;

import java.util.List;

public interface RentalService {

    RentalResponseDto addRental(RentalRequestDto rentalRequestDto);

    RentalResponseDto findByIdRental(RentalRequestDto rentalRequestDto);

    List<RentalResponseDto> findAllRental();

    RentalResponseDto deleteByIdRental(RentalRequestDto rentalRequestDto);
}
