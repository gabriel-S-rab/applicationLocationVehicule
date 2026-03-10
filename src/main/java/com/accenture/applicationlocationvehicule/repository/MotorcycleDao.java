package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotorcycleDao extends JpaRepository<Motorcycle , UUID> {
}
