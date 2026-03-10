package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.exception.BikeException;
import com.accenture.applicationlocationvehicule.repository.BikeDao;
import com.accenture.applicationlocationvehicule.repository.VehicleDao;
import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.BikeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BikeServiceImpl implements  BikeService{

    private final BikeDao bikeDao;
    private final BikeMapper bikeMapper;
    private final VehicleDao vehicleDao;



    public BikeServiceImpl(BikeDao bikeDao, BikeMapper bikeMapper, VehicleService vehicleService, VehicleDao vehicleDao) {
        this.bikeDao = bikeDao;
        this.bikeMapper = bikeMapper;
        this.vehicleDao =  vehicleDao;
    }




    @Override
    public BikeResponseDto findByIdBike(UUID id) {
        Bike bike = bikeDao.getReferenceById(id);
        return bikeMapper.toBikeResponseDto(bike);
    }



    @Override
    public List<BikeResponseDto> findAllBike() {
        List<Bike> listBike = bikeDao.findAll();
        return bikeMapper.toListBikeResponseDto(listBike);
    }


    @Override
    public BikeResponseDto updateBike(UUID id, BikeRequestDto bikeRequestDto) {
           BikeResponseDto bikeResponseDto = findByIdBike(id);
           Vehicle vehicle = vehicleDao.getReferenceById(id);
           if(bikeResponseDto == null)
               throw new BikeException("erreur");
           Bike oldBike = bikeMapper.ToBike(bikeResponseDto);
           if(oldBike.isActive() != bikeRequestDto.active())
               oldBike.setActive(bikeRequestDto.active());
           if(oldBike.isDiscBrake() != bikeRequestDto.discBrake())
               oldBike.setDiscBrake(bikeRequestDto.discBrake());
           oldBike.setDiscBrake(bikeRequestDto.discBrake());
           if(oldBike.isElectric() != bikeRequestDto.electric())
               oldBike.setElectric(bikeRequestDto.electric());
           if(oldBike.isRemovedFromThePark() != bikeRequestDto.removedFromThePark())
               oldBike.setRemovedFromThePark(bikeRequestDto.removedFromThePark());
           if(!oldBike.getBrand().equals(bikeRequestDto.brand()))
               oldBike.setBrand(bikeRequestDto.brand());
           if(!oldBike.getColor().equals(bikeRequestDto.color()))
               oldBike.setColor(bikeRequestDto.color());
           if(oldBike.getDailyBaseRate() != bikeRequestDto.dailyBaseRate())
               oldBike.setDailyBaseRate(bikeRequestDto.dailyBaseRate());
           if(oldBike.getFramSize() != bikeRequestDto.framSize())
               oldBike.setFramSize(bikeRequestDto.framSize());
           if(oldBike.getMileage() != bikeRequestDto.mileage())
               oldBike.setMileage(bikeRequestDto.mileage());
           if(!oldBike.getType().equals(bikeRequestDto.type()))
               oldBike.setType(bikeRequestDto.type());
           if(oldBike.getWeight() != bikeRequestDto.weight())
               oldBike.setWeight(bikeRequestDto.weight());
           Bike saved  = bikeDao.saveAndFlush(oldBike);
           vehicle.setName("bike");
           vehicleDao.saveAndFlush(vehicle);
           return bikeMapper.toBikeResponseDto(saved);
    }

    @Override
    public List<BikeResponseDto> findByRemovedFromThePark(boolean removedFromThePark) {
        List<Bike> bike = bikeDao.findByRemovedFromThePark(removedFromThePark);
        return bikeMapper.toBikeResponseDto(bike);
    }


}
