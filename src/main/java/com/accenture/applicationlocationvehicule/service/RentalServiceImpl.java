package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.RentalRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.RentalResponseDto;

import java.util.List;

public class RentalServiceImpl implements RentalService{
    @Override
    public RentalResponseDto addRental(RentalRequestDto rentalRequestDto) {
        return null;
    }

    @Override
    public RentalResponseDto findByIdRental(RentalRequestDto rentalRequestDto) {
        return null;
    }

    @Override
    public List<RentalResponseDto> findAllRental() {
        return List.of();
    }

    @Override
    public RentalResponseDto deleteByIdRental(RentalRequestDto rentalRequestDto) {
        return null;
    }
}
