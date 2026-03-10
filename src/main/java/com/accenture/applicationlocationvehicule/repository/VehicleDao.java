package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle , UUID> {
}
