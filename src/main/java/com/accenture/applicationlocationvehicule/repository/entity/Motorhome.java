package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Motorhome extends Vehicle{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    private boolean airConditionning;
    private boolean refrigeratorEquipement;
    private String brand;
    private String model;
    private String color;
    private int numberOfSeats;
    private String fuelType;
    private String transmission;
    private int weight;
    private String requiredLicense;
    private String type;
    private boolean showerEquipement;
    private boolean bedlinen;
    private int height;
    private int numberOfBed;
    private boolean kitchenEquipement;
    private int mileage;

    public Motorhome() {
    }

    public Motorhome(String name , boolean airConditionning, boolean refrigeratorEquipement, String brand, String model, String color, int numberOfSeats, String fuelType, String transmission, int weight, String requiredLicense, String type, boolean showerEquipement, boolean bedlinen, int height, int numberOfBed, boolean kitchenEquipement, int mileage) {
        super(name);
        this.airConditionning = airConditionning;
        this.refrigeratorEquipement = refrigeratorEquipement;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.weight = weight;
        this.requiredLicense = requiredLicense;
        this.type = type;
        this.showerEquipement = showerEquipement;
        this.bedlinen = bedlinen;
        this.height = height;
        this.numberOfBed = numberOfBed;
        this.kitchenEquipement = kitchenEquipement;
        this.mileage = mileage;
    }


    public boolean isAirConditionning() {
        return airConditionning;
    }

    public void setAirConditionning(boolean airConditionning) {
        this.airConditionning = airConditionning;
    }

    public boolean isRefrigeratorEquipement() {
        return refrigeratorEquipement;
    }

    public void setRefrigeratorEquipement(boolean refrigeratorEquipement) {
        this.refrigeratorEquipement = refrigeratorEquipement;
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

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRequiredLicense() {
        return requiredLicense;
    }

    public void setRequiredLicense(String requiredLicense) {
        this.requiredLicense = requiredLicense;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isShowerEquipement() {
        return showerEquipement;
    }

    public void setShowerEquipement(boolean showerEquipement) {
        this.showerEquipement = showerEquipement;
    }

    public boolean isBedlinen() {
        return bedlinen;
    }

    public void setBedlinen(boolean bedlinen) {
        this.bedlinen = bedlinen;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public boolean isKitchenEquipement() {
        return kitchenEquipement;
    }

    public void setKitchenEquipement(boolean kitchenEquipement) {
        this.kitchenEquipement = kitchenEquipement;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
