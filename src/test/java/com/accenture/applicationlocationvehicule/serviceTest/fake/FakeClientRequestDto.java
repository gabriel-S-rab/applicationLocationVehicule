package com.accenture.applicationlocationvehicule.serviceTest.fake;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;


import java.util.List;

public record FakeClientRequestDto( Long id,
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
