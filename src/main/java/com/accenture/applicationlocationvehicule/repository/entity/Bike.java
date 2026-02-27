package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int framSize;
    private String brand;
    private String color;
    private boolean removedFromThePark;
    private boolean active;
    private int mileage;
    private int weight;
    private boolean electric;
    private boolean discBrake;
    private String type;
    private String requiredLicense;
    private int dailyBaseRate;

    public Bike(int id, int framSize, String brand, String color, boolean removedFromThePark, boolean active, int mileage, int weight, boolean electric, boolean discBrake, String type, String requiredLicense, int dailyBaseRate) {
        this.id = id;
        this.framSize = framSize;
        this.brand = brand;
        this.color = color;
        this.removedFromThePark = removedFromThePark;
        this.active = active;
        this.mileage = mileage;
        this.weight = weight;
        this.electric = electric;
        this.discBrake = discBrake;
        this.type = type;
        this.requiredLicense = requiredLicense;
        this.dailyBaseRate = dailyBaseRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFramSize() {
        return framSize;
    }

    public void setFramSize(int framSize) {
        this.framSize = framSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRemovedFromThePark() {
        return removedFromThePark;
    }

    public void setRemovedFromThePark(boolean removedFromThePark) {
        this.removedFromThePark = removedFromThePark;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public boolean isDiscBrake() {
        return discBrake;
    }

    public void setDiscBrake(boolean discBrake) {
        this.discBrake = discBrake;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequiredLicense() {
        return requiredLicense;
    }

    public void setRequiredLicense(String requiredLicense) {
        this.requiredLicense = requiredLicense;
    }

    public int getDailyBaseRate() {
        return dailyBaseRate;
    }

    public void setDailyBaseRate(int dailyBaseRate) {
        this.dailyBaseRate = dailyBaseRate;
    }
}
