package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.Administratorservice;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Administrators")
public class AdministratorController {

    private final Administratorservice administratorservice;


    public AdministratorController(Administratorservice administratorservice) {
        this.administratorservice = administratorservice;
    }


    @PostMapping("/Administrator")
    public ResponseEntity<String> addAdministrator(@RequestBody AdministratorRequestDto administratorRequestDto){
        administratorservice.addAdministrator(administratorRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @DeleteMapping("/Administrator")
    public ResponseEntity<String> deleteAdministrator(@RequestHeader(name = "id") int id) {
        administratorservice.deleteByIdAdministrator(id);
        return ResponseEntity.ok("l'administrateur a bien était supprimer "+HttpStatus.ACCEPTED);
    }

}
