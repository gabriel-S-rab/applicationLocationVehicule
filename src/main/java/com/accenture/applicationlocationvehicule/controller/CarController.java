package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.CarService;
import com.accenture.applicationlocationvehicule.service.dto.CarRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cars")
public class CarController {



    private final CarService carService;



    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping
    public ResponseEntity<List<CarResponseDto>>  findALL(){
         List<CarResponseDto> listCarResponsedto = carService.findAllCar();
        return ResponseEntity.status(HttpStatus.OK).body(listCarResponsedto);
    }



    @GetMapping("/{id}")
    public ResponseEntity<CarResponseDto> findById(@RequestHeader(name = "id") UUID id){
        CarResponseDto carResponseDto = carService.findByIdCar(id);
        return ResponseEntity.ok(carResponseDto);
    }



    @GetMapping("/onTheFleet")
    public ResponseEntity<List<CarResponseDto>> findByRemovedFleet(@RequestHeader(name = "removed_from_the_fleet") boolean removedFromTheFleet){
        List<CarResponseDto> listCarResponseDto = carService.findByRemovedFleet(removedFromTheFleet);
        return ResponseEntity.ok(listCarResponseDto);
    }



    @PatchMapping
    public ResponseEntity<CarResponseDto>  updateCar(@RequestHeader(name = "id") UUID id , @RequestBody CarRequestDto carRequestDto){
      CarResponseDto carResponseDto =  carService.updateCar(id , carRequestDto);
        return ResponseEntity.ok(carResponseDto);
    }


}
