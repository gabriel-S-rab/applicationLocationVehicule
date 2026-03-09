package com.accenture.applicationlocationvehicule.serviceTest.fake;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;

import java.util.List;

public record FakeClientRequestDto( int id,
                                    String dateOfBirth,
                                    boolean desactivated,
                                    List<String> listOfLicenses,
                                    String registrationDate,
                                    String password,
                                    String email,
                                    Adress adress,
                                    String firstName,
                                    String lastName) {
}
