package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.ApplicationLocationVehiculeApplication;
import com.accenture.applicationlocationvehicule.exception.VehicleException;
import com.accenture.applicationlocationvehicule.repository.VehicleDao;
import com.accenture.applicationlocationvehicule.repository.entity.*;
import com.accenture.applicationlocationvehicule.service.dto.*;
import com.accenture.applicationlocationvehicule.service.mapper.*;
import org.springframework.boot.web.server.Http2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VehicleServiceImpl implements VehicleService{



    private final CarMapper carMapper;
    private final MotorhomeMapper motorhomeMapper;
    private final MotorcycleMapper motorcycleMapper;
    private final BikeMapper bikeMapper;
    private final UtilityVehicleMapper utilityVehicleMapper;
    private final VehicleDao vehicleDao;
    private final VehicleMapper vehicleMapper;




    public VehicleServiceImpl(CarMapper carMapper, MotorhomeMapper motorhomeMapper, MotorcycleMapper motorcycleMapper, BikeMapper bikeMapper, UtilityVehicleMapper utilityVehicleMapper, VehicleDao vehicleDao, VehicleMapper vehicleMapper) {
        this.carMapper = carMapper;
        this.motorhomeMapper = motorhomeMapper;
        this.motorcycleMapper = motorcycleMapper;
        this.bikeMapper = bikeMapper;
        this.utilityVehicleMapper = utilityVehicleMapper;
        this.vehicleDao = vehicleDao;
        this.vehicleMapper = vehicleMapper;
    }


    @Override
    @Transactional
    public VehicleResponseDto addVehicle(VehicleRequestDto vehicleRequestDto){
        switch(vehicleRequestDto.typeVehicleChoice()){
            case "car" -> {
                verifCarDto(vehicleRequestDto.car());
                Car car = carMapper.toCar(vehicleRequestDto.car());
                car.setName("car");
                vehicleDao.save(car);
            }case "bike" -> {
                verifBikeDto(vehicleRequestDto.bike());
                Bike bike = bikeMapper.toBike(vehicleRequestDto.bike());
                bike.setName("bike");
                vehicleDao.save(bike);
            }case "motorhome" -> {
                verifMotorhomeDto(vehicleRequestDto.motorhome());
                Motorhome motorhome = motorhomeMapper.toMotohome(vehicleRequestDto.motorhome());
                motorhome.setName("motorhome");
                vehicleDao.save(motorhome);
            }case "motorcycle" -> {
                verifMotorcycleDto(vehicleRequestDto.motorcycle());
                Motorcycle motorcycle = motorcycleMapper.toMotorcycle(vehicleRequestDto.motorcycle());
                motorcycle.setName("motorcycle");
                vehicleDao.save(motorcycle);
            }case "utilityVehicle" -> {
                verifUtilityVehicleDto(vehicleRequestDto.utilityVehicle());
                UtilityVehicle utilityVehicle = utilityVehicleMapper.toUtilityVehicle(vehicleRequestDto.utilityVehicle());
                utilityVehicle.setName("utilityVehicle");
                vehicleDao.save(utilityVehicle);
            }
        }
        return null;
    }



    @Override
    public VehicleResponseDto findByIdVehicle(UUID id) {
      Vehicle vehicle  =  vehicleDao.getReferenceById(id);
      return vehicleMapper.toVehicleResponseDto(vehicle);
    }



    @Override
    public List<BoiteGenericDto> findAll() {
       List<Vehicle> listVehicle = vehicleDao.findAll();
       if(listVehicle.size() == 0)
           throw  new VehicleException("erreur");
      List<BoiteGenericDto> listeBoite = new ArrayList<>();
      listVehicle.forEach(element -> {
          if(element.getName().equals("car")) {
              Car car = (Car) element;
              CarResponseDto carResponseDto = carMapper.toCarResponseDto(car);
              BoiteGenericDto boiteGenericDto = new BoiteGenericDto(carResponseDto);
              listeBoite.add(boiteGenericDto);
          }
          if(element.getName().equals("bike")){
              Bike bike = (Bike) element;
              BikeResponseDto bikeResponseDto = bikeMapper.toBikeResponseDto(bike);
              BoiteGenericDto boiteGenericDto = new BoiteGenericDto(bikeResponseDto);
              listeBoite.add(boiteGenericDto);
          }
          if(element.getName().equals("utilityVehicle")){
              UtilityVehicle utilityVehicle = (UtilityVehicle) element;
              UtilityVehicleResponseDto utilityVehicleResponseDto = utilityVehicleMapper.toUtilityVehicleResponseDto(utilityVehicle);
              BoiteGenericDto boiteGenericDto = new BoiteGenericDto(utilityVehicleResponseDto);
              listeBoite.add(boiteGenericDto);
          }
          if(element.getName().equals("motorcycle")){
              Motorcycle motorcycle = (Motorcycle) element;
              MotorcycleResponseDto motorcycleResponseDto = motorcycleMapper.toMotorcycleResponseDto(motorcycle);
              BoiteGenericDto boiteGenericDto = new BoiteGenericDto(motorcycleResponseDto);
              listeBoite.add(boiteGenericDto);
          }
          if(element.getName().equals("motorhome")){
              Motorhome motorhome = (Motorhome) element;
              MotorHomeResponseDto motorHomeResponseDto = motorhomeMapper.toMotorhomeResponseDto(motorhome);
              BoiteGenericDto boiteGenericDto = new BoiteGenericDto(motorHomeResponseDto);
              listeBoite.add(boiteGenericDto);
          }
      });
       return listeBoite;
    }

    @Override
    public VehicleResponseDto deleteByIdVehicle(UUID id) {
          VehicleResponseDto vehicleResponseDto = findByIdVehicle(id);
        if(vehicleResponseDto == null)
            throw new VehicleException("error");
        Vehicle vehicle = vehicleResponseDto.vehicle();
        vehicleDao.delete(vehicle);
        return vehicleResponseDto;
    }




    public void  verifCarDto(CarRequestDto carRequestDto){
        if(carRequestDto == null ||
                carRequestDto.numberOfDoors() <= 0 ||
                carRequestDto.brand().isBlank() || carRequestDto.brand() == null ||
                carRequestDto.color().isBlank() || carRequestDto.color() == null ||
                carRequestDto.model().isBlank() || carRequestDto.model() == null ||
                carRequestDto.typeOfFuel() == null || carRequestDto.typeOfFuel().isBlank() ||
                carRequestDto.mileage() <= 0 || carRequestDto.type().isBlank() ||
                carRequestDto.type() == null || carRequestDto.numberOfSeat() <= 0 ||
                carRequestDto.dailyBaseRentalRate() <= 0 ||
                carRequestDto.licenseRequired() == null || carRequestDto.licenseRequired().isBlank()
        )
            throw new VehicleException("error");
    }


    public void  verifMotorcycleDto(MotorcycleRequestDto motorcycleRequestDto){
        if(motorcycleRequestDto == null ||
                motorcycleRequestDto.brand() == null || motorcycleRequestDto.brand().isBlank() ||
                motorcycleRequestDto.color() == null || motorcycleRequestDto.color().isBlank() ||
                motorcycleRequestDto.model() == null || motorcycleRequestDto.model().isBlank() ||
                motorcycleRequestDto.mileage() <= 0 || motorcycleRequestDto.weight() <= 0 ||
                motorcycleRequestDto.powerInKw() <= 0 || motorcycleRequestDto.dailyBaseRate() <= 0 ||
                motorcycleRequestDto.displacement() <= 0 ||  motorcycleRequestDto.numberOfCylinder() <= 0 ||
                motorcycleRequestDto.seatHeight() <= 0 || motorcycleRequestDto.requiredLicense() == null ||
                motorcycleRequestDto.requiredLicense().isBlank() || motorcycleRequestDto.transmission() == null || motorcycleRequestDto.transmission().isBlank()  ||
                motorcycleRequestDto.name() == null
        )
            throw new VehicleException("error");
    }

    public void  verifMotorhomeDto(MotorHomeRequestDto motorHomeRequestDto){
        if(motorHomeRequestDto== null || motorHomeRequestDto.brand() == null ||
        motorHomeRequestDto.brand().isBlank() || motorHomeRequestDto.color() == null ||
        motorHomeRequestDto.color().isBlank() || motorHomeRequestDto.model() == null ||
        motorHomeRequestDto.model().isBlank() || motorHomeRequestDto.fuelType() == null ||
        motorHomeRequestDto.fuelType().isBlank() || motorHomeRequestDto.height() <= 0 ||
        motorHomeRequestDto.mileage() <= 0 || motorHomeRequestDto.numberOfBed() <= 0 ||
        motorHomeRequestDto.numberOfSeats() <= 0 || motorHomeRequestDto.requiredLicense() == null ||
        motorHomeRequestDto.requiredLicense().isBlank() || motorHomeRequestDto.transmission() == null ||
        motorHomeRequestDto.transmission().isBlank() || motorHomeRequestDto.type() == null ||
                motorHomeRequestDto.type().isBlank() || motorHomeRequestDto.weight() <= 0
        )
            throw new VehicleException("error");
    }



    public void verifBikeDto(BikeRequestDto bikeRequestDto){
        if(bikeRequestDto == null ||
        bikeRequestDto.brand() == null || bikeRequestDto.brand().isBlank() ||
                bikeRequestDto.color() == null || bikeRequestDto.color().isBlank() ||
                bikeRequestDto.dailyBaseRate() <= 0 || bikeRequestDto.framSize() <= 0 ||
                bikeRequestDto.mileage() <= 0 || bikeRequestDto.requiredLicense() == null ||
                bikeRequestDto.requiredLicense().isBlank() || bikeRequestDto.type() == null ||
                bikeRequestDto.type().isBlank() || bikeRequestDto.weight() <= 0
        )
            throw new VehicleException("error");
    }



    public void verifUtilityVehicleDto(UtilityVehicleRequestDto utilityVehicleRequestDto){
        if(utilityVehicleRequestDto == null ||
         utilityVehicleRequestDto.capacity() <= 0 || utilityVehicleRequestDto.baseRate() <= 0  ||
                utilityVehicleRequestDto.brand() == null || utilityVehicleRequestDto.brand().isBlank() ||
                utilityVehicleRequestDto.color() == null || utilityVehicleRequestDto.color().isBlank() ||
                utilityVehicleRequestDto.fuelType() == null || utilityVehicleRequestDto.fuelType().isBlank() ||
                utilityVehicleRequestDto.license() == null || utilityVehicleRequestDto.license().isBlank() ||
                utilityVehicleRequestDto.maximumLoad() <= 0 || utilityVehicleRequestDto.mileage()<= 0 ||
                utilityVehicleRequestDto.model() == null || utilityVehicleRequestDto.model().isBlank() ||
                utilityVehicleRequestDto.numberOfSeats() <= 0 || utilityVehicleRequestDto.transmission() == null ||
                utilityVehicleRequestDto.transmission().isBlank() || utilityVehicleRequestDto.type() == null ||
                utilityVehicleRequestDto.type().isBlank() || utilityVehicleRequestDto.weight() <= 0
        )
            throw new VehicleException("error");
    }


}






