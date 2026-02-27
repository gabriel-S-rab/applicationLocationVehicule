package com.accenture.applicationlocationvehicule.service.dto;

public class UtilityResponseDto {

    private int id;
    private int baseRate;
    private String brand;
    private String model;
    private String color;
    private String numberOfSeats;
    private String fuelType;
    private String Transmission;
    private boolean airConditionning;
    private int maximumLoad;
    private int weight;
    private int capacity;
    private String type;
    private String license;
    private int mileage;
    private boolean removedFromFleet;
    private boolean active;

    public UtilityResponseDto(int id, int baseRate, String brand, String model, String color, String numberOfSeats, String fuelType, String transmission, boolean airConditionning, int maximumLoad, int weight, int capacity, String type, String license, int mileage, boolean removedFromFleet, boolean active) {
        this.id = id;
        this.baseRate = baseRate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
        Transmission = transmission;
        this.airConditionning = airConditionning;
        this.maximumLoad = maximumLoad;
        this.weight = weight;
        this.capacity = capacity;
        this.type = type;
        this.license = license;
        this.mileage = mileage;
        this.removedFromFleet = removedFromFleet;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
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

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    public boolean isAirConditionning() {
        return airConditionning;
    }

    public void setAirConditionning(boolean airConditionning) {
        this.airConditionning = airConditionning;
    }

    public int getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(int maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
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
}
