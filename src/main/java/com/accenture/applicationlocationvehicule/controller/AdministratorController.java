package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.Administratorservice;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Administrator")
public class AdministratorController {

    private final Administratorservice administratorservice;


    public AdministratorController(Administratorservice administratorservice) {
        this.administratorservice = administratorservice;
    }


    @PostMapping("/addAdministrator")
    public ResponseEntity<String> addAdministrator(@RequestBody AdministratorRequestDto administratorRequestDto){
        administratorservice.addAdministrator(administratorRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
