package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.CarService;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        return ResponseEntity.ok(listCarResponsedto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarResponseDto> findById(){
        CarResponseDto carResponseDto = carService.findByIdCar(int id)
    }

}
