package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car extends Vehicle{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    private int numberOfDoors;
    private int dailyBaseRentalRate;
    private String model;
    private String brand;
    private boolean removedFromTheFleet;
    private boolean active;
    private String color;
    private int numberOfSeat;
    private String typeOfFuel;
    private boolean airConditionning;
    private int numberOfLuggage;
    private String type;
    private String licenseRequired;
    private int mileage;

    public Car() {
    }

    public Car(String name , int numberOfDoors, int dailyBaseRentalRate, String model, String brand, boolean removedFromTheFleet, boolean active, String color, int numberOfSeat, String typeOfFuel, boolean airConditionning, int numberOfLuggage, String type, String licenserequired, int mileage) {
        super(name);
        this.numberOfDoors = numberOfDoors;
        this.dailyBaseRentalRate = dailyBaseRentalRate;
        this.model = model;
        this.brand = brand;
        this.removedFromTheFleet = removedFromTheFleet;
        this.active = active;
        this.color = color;
        this.numberOfSeat = numberOfSeat;
        this.typeOfFuel = typeOfFuel;
        this.airConditionning = airConditionning;
        this.numberOfLuggage = numberOfLuggage;
        this.type = type;
        this.licenseRequired = licenserequired;
        this.mileage = mileage;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        numberOfDoors = numberOfDoors;
    }

    public int getDailyBaseRentalRate() {
        return dailyBaseRentalRate;
    }

    public void setDailyBaseRentalRate(int dailyBaseRentalRate) {
        dailyBaseRentalRate = dailyBaseRentalRate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRemovedFromTheFleet() {
        return removedFromTheFleet;
    }

    public void setRemovedFromTheFleet(boolean removedFromTheFleet) {
        this.removedFromTheFleet = removedFromTheFleet;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public boolean isAirConditionning() {
        return airConditionning;
    }

    public void setAirConditionning(boolean airConditionning) {
        this.airConditionning = airConditionning;
    }

    public int getNumberOfLuggage() {
        return numberOfLuggage;
    }

    public void setNumberOfLuggage(int numberOfLuggage) {
        this.numberOfLuggage = numberOfLuggage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLicenserequired() {
        return licenseRequired;
    }

    public void setLicenserequired(String licenserequired) {
        this.licenseRequired = licenserequired;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
