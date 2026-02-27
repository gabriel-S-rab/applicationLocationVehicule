package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.service.dto.MotorHomeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.MotorHomeResponseDto;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.MotorcycleResponseDto;

import java.util.List;

public interface MotorhomeService {

    MotorHomeResponseDto addMotohome(MotorHomeRequestDto motorhomeRequestDto);

    MotorHomeResponseDto findByIdMotorhome(MotorHomeRequestDto motorhomeRequestDto);

     List<MotorHomeResponseDto> findAll();

     MotorHomeResponseDto deleteByIdMotohome(MotorcycleRequestDto motorhomeRequestDto);
}
