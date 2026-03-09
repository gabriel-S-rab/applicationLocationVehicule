package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import com.accenture.applicationlocationvehicule.service.VehicleService;
import com.accenture.applicationlocationvehicule.service.dto.BoiteGenericDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.VehicleResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return ResponseEntity.ok("véhicule ajouter "+HttpStatus.CREATED);
    }

    @Operation(summary = "Récupération des véhicules", description = "récupération de la liste des véhicules")
    @GetMapping
    public ResponseEntity<List<BoiteGenericDto>> findAll(){
        List<BoiteGenericDto>  listeVehicle = vehicleService.findAll();
        return ResponseEntity.ok(listeVehicle);
    }

}
