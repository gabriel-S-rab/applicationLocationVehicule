package com.accenture.applicationlocationvehicule.service.dto;



public record AdministratorRequestDto (
                                       String lastName,
                                       String firstName,
                                       String function,
                                       String email,
                                       String password)
{}
