package com.accenture.applicationlocationvehicule.service.dto;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

import java.util.List;

public class ClientResponseDto {

    private int id;
    private String DateOfBirth;
    private String desactivated;
    private List<String> listOfPermis;
    private String RegistrationDate;
    private String password;
    private String email;
    private Adress adress;
    private String firstName;
    private String lastName;

    public ClientResponseDto(int id, String dateOfBirth, String desactivated, List<String> listOfPermis, String registrationDate, String password, String email, Adress adress, String firstName, String lastName) {
        this.id = id;
        DateOfBirth = dateOfBirth;
        this.desactivated = desactivated;
        this.listOfPermis = listOfPermis;
        RegistrationDate = registrationDate;
        this.password = password;
        this.email = email;
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
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
        return RegistrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        RegistrationDate = registrationDate;
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
