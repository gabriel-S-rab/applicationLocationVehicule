package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.repository.entity.Rental;
import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import com.accenture.applicationlocationvehicule.service.dto.RentalRequestDto;
import jakarta.persistence.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RentalMapper {

    @Mapping(source = "id" , target = "Rental.id")
    @Mapping(source = "numberOfKilometersTraveled" , target = "Rental.numberOfKilometersTraveled")
    @Mapping(source = "totalAmount" , target = "Rental.totalAmount")
    @Mapping(source = "validationDate" , target = "Rental.validationDate")
    @Mapping(source = "rentalStatus" , target = "Rental.rentalStatus")
    @Mapping(source = "client" , target = "Rental.Client")
    @Mapping(source = "Vehicle" , target = "Rental.Vehicle")
    @Mapping(source = "startDate" , target = "Rental.stratDate")
    @Mapping(source = "endDate" , target = "Rental.endDate")
    Rental toRental(RentalRequestDto rentalRequestDto);
}

