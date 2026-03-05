package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected String name;


    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
