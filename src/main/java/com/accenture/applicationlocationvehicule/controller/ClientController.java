package com.accenture.applicationlocationvehicule.controller;

import com.accenture.applicationlocationvehicule.service.ClientService;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
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



    @PutMapping("/client")
    public ResponseEntity<String> addClient(@RequestBody ClientRequestDto clientRequestDto){
        ClientResponseDto clientResponseDto = clientService.addClient(clientRequestDto);
        return  new ResponseEntity<>(HttpStatus.CREATED); // a modifier
    }

    @GetMapping("/account")
    public ResponseEntity<ClientResponseDto> findByClient(@RequestHeader(name = "email") String email , @RequestHeader(name = "password") String password){
        ClientResponseDto clientResponseDto = clientService.findByClient(email , password);
        return ResponseEntity.ok(clientResponseDto); // a modifier
    }

    @DeleteMapping
    public ResponseEntity<String> deleteByClient(@RequestHeader(name = "email") String email ,@RequestHeader(name = "password") String password){
        clientService.deleteByClient(email,password);
        return ResponseEntity.ok("ok");
    }

    @PatchMapping
    public  ResponseEntity<String> updateClient(@RequestHeader(name = "email") String email , @RequestHeader(name = "password") String password , @RequestBody ClientRequestDto clientRequestDto){
        clientService.updateClient(email, password , clientRequestDto);
        return ResponseEntity.ok("client modifier "+HttpStatus.ACCEPTED);
    }


}
