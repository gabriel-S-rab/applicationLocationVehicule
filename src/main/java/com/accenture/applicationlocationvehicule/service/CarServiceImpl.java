package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.repository.CarDao;
import com.accenture.applicationlocationvehicule.repository.entity.Car;
import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService{

    private final CarDao carDao;
    private final CarMapper carMapper;

    public CarServiceImpl(CarDao carDao, CarMapper carMapper) {
        this.carDao = carDao;
        this.carMapper = carMapper;
    }


    @Override
    public CarResponseDto addCar(CarRequestDto carRequestDto) {
        return null;
    }



    @Override
    public CarResponseDto findByIdCar(int id) {

    }



    @Override
    public List<CarResponseDto> findAllCar() {
        List<Car> listCar = carDao.findAll();
        List<CarResponseDto> listCarResponseDto = carMapper.toCarResponseDto(listCar);
        return listCarResponseDto;
    }



    @Override
    public CarResponseDto deleteByIdCar(CarRequestDto carRequestDto) {
        return null;
    }
}
