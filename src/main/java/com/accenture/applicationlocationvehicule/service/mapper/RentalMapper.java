package com.accenture.applicationlocationvehicule.service.mapper;
import com.accenture.applicationlocationvehicule.repository.entity.Rental;
import com.accenture.applicationlocationvehicule.service.dto.RentalRequestDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface RentalMapper {

    Rental toRental(RentalRequestDto rentalRequestDto);
}

