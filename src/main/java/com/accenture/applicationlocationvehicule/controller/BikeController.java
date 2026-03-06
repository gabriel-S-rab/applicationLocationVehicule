package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.BikeService;
import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;
import com.accenture.applicationlocationvehicule.service.dto.CarResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bikes")
public class BikeController{

    private final BikeService bikeService;


    public BikeController(BikeService bikeService) {
        this.bikeService = bikeService;
    }



    @GetMapping("/bike")
    public ResponseEntity<List<BikeResponseDto>> findAllBike(){
      List<BikeResponseDto> listBikeResponseDtos =  bikeService.findAllBike();
      return ResponseEntity.ok(listBikeResponseDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BikeResponseDto> findById(@RequestHeader(name = "id") Long id){
        BikeResponseDto bikeResponseDtos =  bikeService.findByIdBike(id);
        return ResponseEntity.ok(bikeResponseDtos);
    }


    @PatchMapping
    public ResponseEntity<BikeResponseDto> updateBike(@RequestHeader(name = "id") Long id ,@RequestBody BikeRequestDto bikeRequestDto){
        BikeResponseDto bikeResponseDto = bikeService.updateBike(id , bikeRequestDto);
        return ResponseEntity.ok(bikeResponseDto);
    }

    @GetMapping("/onTheFleet")
    public ResponseEntity<List<BikeResponseDto>> findByRemovedFromThePark(@RequestHeader(name = "removed_from_the_fleet") boolean removedFromThePark){
        List<BikeResponseDto> listBikeResponseDto = bikeService.findByRemovedFromThePark(removedFromThePark);
        return ResponseEntity.ok(listBikeResponseDto);
    }
}