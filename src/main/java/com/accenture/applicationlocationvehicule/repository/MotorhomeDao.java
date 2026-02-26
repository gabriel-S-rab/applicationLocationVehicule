package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.MotorHome;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotorhomeDao extends JpaRepository<MotorHome , UUID> {
}
