package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.UtilityVehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UtilityVehicleDao extends JpaRepository<UtilityVehicle , UUID> {
}
