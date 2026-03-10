package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.BikeService;
import com.accenture.applicationlocationvehicule.service.dto.BikeRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.BikeResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
      return ResponseEntity.status(HttpStatus.OK).body(listBikeResponseDtos);
    }


    @GetMapping("/{id}")
    public ResponseEntity<BikeResponseDto> findById(@RequestHeader(name = "id") UUID id){
        BikeResponseDto bikeResponseDtos =  bikeService.findByIdBike(id);
        return ResponseEntity.status(HttpStatus.OK).body(bikeResponseDtos);
    }


    @PatchMapping
    public ResponseEntity<String> updateBike(@RequestHeader(name = "id") UUID id ,@RequestBody BikeRequestDto bikeRequestDto){
        BikeResponseDto bikeResponseDto = bikeService.updateBike(id , bikeRequestDto);
        return ResponseEntity.status(HttpStatus.OK).body("le vélo a bien était modifier");
    }


    @GetMapping("/onTheFleet")
    public ResponseEntity<List<BikeResponseDto>> findByRemovedFromThePark(@RequestHeader(name = "removed_from_the_fleet") boolean removedFromThePark){
        List<BikeResponseDto> listBikeResponseDto = bikeService.findByRemovedFromThePark(removedFromThePark);
        return ResponseEntity.status(HttpStatus.OK).body(listBikeResponseDto);
    }


}