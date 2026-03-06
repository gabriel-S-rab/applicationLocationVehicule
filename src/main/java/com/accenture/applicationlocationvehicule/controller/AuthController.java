package com.accenture.applicationlocationvehicule.controller;


import com.accenture.applicationlocationvehicule.config.SecurityConfig;
import com.accenture.applicationlocationvehicule.repository.ClientDao;
import com.accenture.applicationlocationvehicule.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {


    private final AuthService authService;


    public AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping
    public void authentification(@RequestHeader(name = "email") String email , @RequestHeader(name = "password") String password){
         authService.authentification(email , password);
    }
}
