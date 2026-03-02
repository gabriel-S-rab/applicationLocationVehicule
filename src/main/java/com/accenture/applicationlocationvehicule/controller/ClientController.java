package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.ClientService;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }



    @PostMapping("/addClient")
    public ResponseEntity<String> addClient(@RequestBody ClientRequestDto clientRequestDto){
        ClientResponseDto clientResponseDto = clientService.addClient(clientRequestDto);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }


}
