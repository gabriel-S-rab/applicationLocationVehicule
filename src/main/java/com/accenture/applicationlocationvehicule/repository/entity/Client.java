package com.accenture.applicationlocationvehicule.repository.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dateOfBirth;
    private String desactivated;
    private List<String> listOfPermis;
    private String registrationDate;
    private String password;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id")
    private Adress adress;
    private String firstName;
    private String lastName;

    public Client(String dateOfBirth, String desactivated, List<String> listOfPermis, String registrationDate, String password, String email, Adress adress, String firstName, String lastName) {
        this.dateOfBirth = dateOfBirth;
        this.desactivated = desactivated;
        this.listOfPermis = listOfPermis;
        this.registrationDate = registrationDate;
        this.password = password;
        this.email = email;
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
    } // asupprimer ultérieurement

    public Client(long id, String dateOfBirth, String desactivated, List<String> listOfPermis, String registrationDate, String password, String email, Adress adress, String firstName, String lastName) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.desactivated = desactivated;
        this.listOfPermis = listOfPermis;
        this.registrationDate = registrationDate;
        this.password = password;
        this.email = email;
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        dateOfBirth = dateOfBirth;
    }

    public String getDesactivated() {
        return desactivated;
    }

    public void setDesactivated(String desactivated) {
        this.desactivated = desactivated;
    }

    public List<String> getListOfPermis() {
        return listOfPermis;
    }

    public void setListOfPermis(List<String> listOfPermis) {
        this.listOfPermis = listOfPermis;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        registrationDate = registrationDate;
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
