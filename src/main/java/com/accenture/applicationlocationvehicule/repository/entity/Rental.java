package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.*;

import java.util.UUID;


@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int numberOfKilometersTraveled;
    private int totalAmount;
    private String validationDate;
    private String rentalStatus;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicle vehicule;
//    @ManyToOne
//    @JoinColumn(name = "accessory_id")
//  private Accessory accessory;
    private String startDate;
    private String endDate;

    public Rental(UUID id, int numberOfKilometersTraveled, int totalAmount, String validationDate, String rentalStatus, Client client , Vehicle vehicule /* , Accessory accessory */, String startDate, String endDate) {
        this.id = id;
        this.numberOfKilometersTraveled = numberOfKilometersTraveled;
        this.totalAmount = totalAmount;
        this.validationDate = validationDate;
        this.rentalStatus = rentalStatus;
        this.client = client;
        this.vehicule = vehicule;
    //    this.accessory = accessory;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getNumberOfKilometersTraveled() {
        return numberOfKilometersTraveled;
    }

    public void setNumberOfKilometersTraveled(int numberOfKilometersTraveled) {
        numberOfKilometersTraveled = numberOfKilometersTraveled;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        totalAmount = totalAmount;
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
