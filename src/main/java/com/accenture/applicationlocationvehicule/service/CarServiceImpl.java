package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.exception.CarException;
import com.accenture.applicationlocationvehicule.repository.CarDao;
import com.accenture.applicationlocationvehicule.repository.entity.Car;
import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.CarMapper;
import org.springframework.stereotype.Service;

import javax.smartcardio.CardException;
import java.util.List;
import java.util.Locale;


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
    public CarResponseDto findByIdCar(Long id) {
    Car car = carDao.getReferenceById(id);
        return carMapper.toCarResponseDto(car);
    }



    @Override
    public List<CarResponseDto> findAllCar() {
        List<Car> listCar = carDao.findAll();
        return carMapper.toCarResponseDto(listCar);
    }

    @Override
    public List<CarResponseDto> findByRemovedFleet(boolean removedFromTheFleet) {
        List<Car> car = carDao.findByremovedFromTheFleet(removedFromTheFleet);
        return carMapper.toCarResponseDto(car);
    }



    @Override
    public CarResponseDto deleteByIdCar(CarRequestDto carRequestDto) {
        return null;
    }

    @Override
    public CarResponseDto updateCar(Long id ,CarRequestDto carRequestDto) {
        if(carRequestDto == null || carRequestDto.numberOfDoors() < 0
                || carRequestDto.dailyBaseRentalRate() < 0
                || carRequestDto.model() == null || carRequestDto.model().isBlank()
                || carRequestDto.brand() == null || carRequestDto.brand().isBlank()
                || carRequestDto.color() == null || carRequestDto.color().isBlank()
                || carRequestDto.numberOfSeat() < 0
                || carRequestDto.typeOfFuel() == null || carRequestDto.typeOfFuel().isBlank()
                || carRequestDto.numberOfLuggage() < 0
                || carRequestDto.type() == null || carRequestDto.type().isBlank()
                || carRequestDto.licenseRequired() == null || carRequestDto.licenseRequired().isBlank()
                || carRequestDto.mileage() < 0)
            throw new CarException("erreur");
        Car oldCar = carDao.getReferenceById(id);
        if(oldCar.isActive() != carRequestDto.active())
            oldCar.setActive(carRequestDto.active());
        if (oldCar.isAirConditionning() != carRequestDto.airConditionning())
            oldCar.setAirConditionning(carRequestDto.airConditionning());
        if(oldCar.isRemovedFromTheFleet() != carRequestDto.removedFromTheFleet())
            oldCar.setRemovedFromTheFleet(carRequestDto.removedFromTheFleet());
        if(!oldCar.getBrand().equals(carRequestDto.brand()))
            oldCar.setBrand(carRequestDto.brand());
        if(!oldCar.getColor().equals(carRequestDto.color()))
            oldCar.setColor(carRequestDto.color());
        if(oldCar.getDailyBaseRentalRate() != carRequestDto.dailyBaseRentalRate())
            oldCar.setDailyBaseRentalRate(carRequestDto.dailyBaseRentalRate());
        if(!oldCar.getModel().equals(carRequestDto.model()))
            oldCar.setModel(carRequestDto.model());
//        if(!oldCar.getLicenserequired().equals(carRequestDto.licenseRequired()))
//            oldCar.setLicenserequired(carRequestDto.licenseRequired());
        if(oldCar.getMileage() != carRequestDto.mileage())
            oldCar.setMileage(carRequestDto.mileage());
        if(oldCar.getNumberOfDoors() != carRequestDto.numberOfDoors())
            oldCar.setNumberOfDoors(carRequestDto.numberOfDoors());
        if(oldCar.getNumberOfLuggage() != carRequestDto.numberOfLuggage())
            oldCar.setNumberOfLuggage(carRequestDto.numberOfLuggage());
        if(oldCar.getNumberOfSeat() != carRequestDto.numberOfSeat())
            oldCar.setNumberOfSeat(carRequestDto.numberOfSeat());
        if(!oldCar.getType().equals(carRequestDto.type()))
            oldCar.setType(carRequestDto.type());
        if (!oldCar.getTypeOfFuel().equals(carRequestDto.typeOfFuel()))
            oldCar.setTypeOfFuel(carRequestDto.typeOfFuel());
        Car saved = carDao.saveAndFlush(oldCar);
        return carMapper.toCarResponseDto(saved);
    }
}
