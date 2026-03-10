package com.accenture.applicationlocationvehicule.service.dto;


import org.springframework.stereotype.Component;

@Component
public class BoiteGenericDto <T>{


    private T boite;


    public BoiteGenericDto() {
    }


    public BoiteGenericDto(T boite) {
        this.boite = boite;
    }

    public T getBoite() {
        return boite;
    }

    public void setBoite(T boite) {
        this.boite = boite;
    }
}
