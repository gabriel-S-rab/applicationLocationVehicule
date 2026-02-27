package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
}
