package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.ClientService;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @Operation(description = "Ajout d'un client", summary = "Ajout d'un nouveau client")
    @PutMapping("/client")
    public ResponseEntity<String> addClient(@RequestBody ClientRequestDto clientRequestDto){
        ClientResponseDto clientResponseDto = clientService.addClient(clientRequestDto);
        return  ResponseEntity.status(HttpStatus.CREATED).body("Client ajouté avec succès");
    }


    @Operation(description = "Récupération d'un client" , summary = "Récupération d'un client")
    @GetMapping("/account")
    public ResponseEntity<ClientResponseDto> findByClient(@RequestHeader(name = "email") String email , @RequestHeader(name = "password") String password){
        ClientResponseDto clientResponseDto = clientService.findByClient(email , password);
        return ResponseEntity.status(HttpStatus.OK).body(clientResponseDto);
    }


    @Operation(description = "Suppression d'un client", summary = "Suppression d'un client")
    @DeleteMapping
    public ResponseEntity<String> deleteByClient(@RequestHeader(name = "email") String email ,@RequestHeader(name = "password") String password){
        clientService.deleteByClient(email,password);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Client supprimé avec succès");
    }


    @Operation(description = "Modification d'un client" , summary = "Modification d'un client")
    @PatchMapping
    public  ResponseEntity<String> updateClient(@RequestHeader(name = "email") String email , @RequestHeader(name = "password") String password , @RequestBody ClientRequestDto clientRequestDto){
        clientService.updateClient(email, password , clientRequestDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Client modifié avec succès");
    }


}
