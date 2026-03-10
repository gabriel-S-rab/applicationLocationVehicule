package com.accenture.applicationlocationvehicule.service.dto;

import java.util.UUID;

public record AdministratorRequestDto (UUID id,
                                       String lastName,
                                       String firstName,
                                       String function,
                                       String email,
                                       String password)
{}
