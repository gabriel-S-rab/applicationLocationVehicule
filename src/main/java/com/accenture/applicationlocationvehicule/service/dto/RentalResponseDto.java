package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class RentalResponseDto {

    private int id;
    private int NumberOfKilometersTraveled;
    private int TotalAmount;
    private String validationDate;
    private String rentalStatus;
    private Client client;
    private Vehicle vehicule;
//  private Accessory accessory;
    private String startDate;
    private String endDate;

    public RentalResponseDto(int id, int numberOfKilometersTraveled, int totalAmount, String validationDate, String rentalStatus, Client client, Vehicle vehicule, String startDate, String endDate) {
        this.id = id;
        NumberOfKilometersTraveled = numberOfKilometersTraveled;
        TotalAmount = totalAmount;
        this.validationDate = validationDate;
        this.rentalStatus = rentalStatus;
        this.client = client;
        this.vehicule = vehicule;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfKilometersTraveled() {
        return NumberOfKilometersTraveled;
    }

    public void setNumberOfKilometersTraveled(int numberOfKilometersTraveled) {
        NumberOfKilometersTraveled = numberOfKilometersTraveled;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public String getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(String validationDate) {
        this.validationDate = validationDate;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicle getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicle vehicule) {
        this.vehicule = vehicule;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
