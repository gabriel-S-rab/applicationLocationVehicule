package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.*;


import java.util.List;
import java.util.UUID;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String dateOfBirth;
    private boolean desactivated;

    @ElementCollection
    @JoinTable(name = "client_list_of_licenses")
    private List<String> listOfLicenses;

    private String registrationDate;
    private String password;

    @Column(unique = true)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id")
    private Adress adress;

    private String firstName;
    private String lastName;

    public Client() {
    }

    public Client(String dateOfBirth, boolean desactivated, List<String> listOfLicenses, String registrationDate, String password, String email, Adress adress, String firstName, String lastName) {
        this.dateOfBirth = dateOfBirth;
        this.desactivated = desactivated;
        this.listOfLicenses = listOfLicenses;
        this.registrationDate = registrationDate;
        this.password = password;
        this.email = email;
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getDesactivated() {
        return desactivated;
    }

    public void setDesactivated(boolean desactivated) {
        this.desactivated = desactivated;
    }

    public List<String> getListOfLicenses() {
        return listOfLicenses;
    }

    public void setListOfLicenses(List<String> listOfLicenses) {
        this.listOfLicenses = listOfLicenses;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
