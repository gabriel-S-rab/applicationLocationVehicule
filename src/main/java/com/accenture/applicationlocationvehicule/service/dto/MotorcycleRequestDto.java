package com.accenture.applicationlocationvehicule.service.dto;

public class MotorcycleRequestDto {

    private int id;
    private int powerInKw;
    private String Transmission;
    private String requiredLicense;
    private String brand;
    private String model;
    private String color;
    private int numberOfCylinder;
    private int seatHeight;
    private int weight;
    private boolean removedFromFleet;
    private boolean active;
    private int dailyBaseRate;
    private int mileage;
    private String type;
    private int displacement;

    public MotorcycleRequestDto(int id, int powerInKw, String transmission, String requiredLicense, String brand, String model, String color, int numberOfCylinder, int seatHeight, int weight, boolean removedFromFleet, boolean active, int dailyBaseRate, int mileage, String type, int displacement) {
        this.id = id;
        this.powerInKw = powerInKw;
        Transmission = transmission;
        this.requiredLicense = requiredLicense;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numberOfCylinder = numberOfCylinder;
        this.seatHeight = seatHeight;
        this.weight = weight;
        this.removedFromFleet = removedFromFleet;
        this.active = active;
        this.dailyBaseRate = dailyBaseRate;
        this.mileage = mileage;
        this.type = type;
        this.displacement = displacement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPowerInKw() {
        return powerInKw;
    }

    public void setPowerInKw(int powerInKw) {
        this.powerInKw = powerInKw;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    public String getRequiredLicense() {
        return requiredLicense;
    }

    public void setRequiredLicense(String requiredLicense) {
        this.requiredLicense = requiredLicense;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public void setNumberOfCylinder(int numberOfCylinder) {
        this.numberOfCylinder = numberOfCylinder;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isRemovedFromFleet() {
        return removedFromFleet;
    }

    public void setRemovedFromFleet(boolean removedFromFleet) {
        this.removedFromFleet = removedFromFleet;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getDailyBaseRate() {
        return dailyBaseRate;
    }

    public void setDailyBaseRate(int dailyBaseRate) {
        this.dailyBaseRate = dailyBaseRate;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
}
