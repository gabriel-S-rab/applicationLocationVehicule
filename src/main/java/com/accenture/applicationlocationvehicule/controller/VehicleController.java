package com.accenture.applicationlocationvehicule.controller;


import com.accenture.applicationlocationvehicule.service.VehicleService;
import com.accenture.applicationlocationvehicule.service.dto.BoiteGenericDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {


    private final VehicleService vehicleService;


    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    @Operation(summary = "ajout d'un véhicule", description = "Ajout d’un véhicule : saisir un choix et compléter la partie en rapport avec ce type.")
    @PutMapping("/vehicle")
    public ResponseEntity<String> addVehicle(@RequestBody VehicleRequestDto vehicleRequestDto){
      VehicleResponseDto vehicleResponseDto =  vehicleService.addVehicle(vehicleRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("véhicule ajouter");
    }


    @Operation(summary = "Récupération des véhicules", description = "récupération de la liste des véhicules")
    @GetMapping("/vehicle")
    public ResponseEntity<List<BoiteGenericDto>> findAll(){
        List<BoiteGenericDto>  listeVehicle = vehicleService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listeVehicle);
    }



    @Operation(summary = "Récupération d'un véhicule" , description = "Récupération d'un véhicule par son id")
    @GetMapping
    public ResponseEntity<VehicleResponseDto> findById(UUID id){
        VehicleResponseDto vehicleResponseDto = vehicleService.findByIdVehicle(id);
        return ResponseEntity.status(HttpStatus.OK).body(vehicleResponseDto);
    }



    @Operation(summary = "Suppression d'un véhicule" , description = "Suppression d'un vehicule par son id")
    @DeleteMapping
    public ResponseEntity<String> deleById(@RequestHeader(name = "id") UUID id){
        vehicleService.deleteByIdVehicle(id);
        return ResponseEntity.status(HttpStatus.OK).body("le vehicule a bien étais supprimer");
    }


}
