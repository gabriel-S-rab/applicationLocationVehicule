package com.accenture.applicationlocationvehicule.service.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthDto {

    private String email;
    private String Password;
    private String  role;

    public AuthDto() {
    }

    public AuthDto(String email, String password, String role) {
        this.email = email;
        Password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
