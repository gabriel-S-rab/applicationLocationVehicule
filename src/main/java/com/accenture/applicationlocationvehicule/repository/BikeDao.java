package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BikeDao extends JpaRepository<Bike , UUID> {
}
