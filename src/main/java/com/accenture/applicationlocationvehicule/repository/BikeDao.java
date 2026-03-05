package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeDao extends JpaRepository<Bike , Long> {
}
