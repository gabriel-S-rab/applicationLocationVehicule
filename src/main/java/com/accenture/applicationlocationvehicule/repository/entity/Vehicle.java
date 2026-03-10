package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    protected String name;


    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
