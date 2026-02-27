package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdressResponseDto;

import java.util.List;

public interface AdressService {

    AdressResponseDto addAdress(AdressRequestDto adressRequestDto);

    AdressResponseDto findByIdAdress(AdressRequestDto adressRequestDto);

   List<AdressResponseDto> findByAll();

    AdressResponseDto deleteByIdAdress(AdressRequestDto adressRequestDto);
}
