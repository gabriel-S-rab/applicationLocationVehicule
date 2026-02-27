package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Adminstrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String lastName;
    private String firstName;
    private String function;
    private String email;
    private String password;

    public Adminstrator(int id, String lastName, String firstName, String function, String email, String password) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.function = function;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
