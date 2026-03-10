package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdressDao extends JpaRepository<Adress , UUID> {
}
