package com.accenture.applicationlocationvehicule.service.mapper;

import com.accenture.applicationlocationvehicule.repository.entity.Rental;
import com.accenture.applicationlocationvehicule.service.dto.RentalRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RentalMapper {

    @Mapping()
    Rental toRental(RentalRequestDto rentalRequestDto);
}
