package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.Administratorservice;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/Administrators")
public class AdministratorController {



    private final Administratorservice administratorservice;




    public AdministratorController(Administratorservice administratorservice) {
        this.administratorservice = administratorservice;
    }




    @Operation(summary = "Ajout d’un nouvel administrateur" , description = "Ajout d’un nouvel administrateur")
    @PostMapping("/Administrator")
    public ResponseEntity<String> addAdministrator(@RequestBody AdministratorRequestDto administratorRequestDto){
        administratorservice.addAdministrator(administratorRequestDto);
        return  ResponseEntity.status(HttpStatus.CREATED).body("L'administrateur a bien été créé.");
    }




    @Operation(summary = "suppression d'un administrateur", description = "suppression d'un administrateur")
    @DeleteMapping("/Administrator")
    public ResponseEntity<String> deleteAdministrator(@RequestHeader(name = "id") UUID id) {
        administratorservice.deleteByIdAdministrator(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("L'administrateur a bien été supprimé.");
    }

}
