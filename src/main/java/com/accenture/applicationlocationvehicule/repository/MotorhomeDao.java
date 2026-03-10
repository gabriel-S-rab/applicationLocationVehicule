package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Motorhome;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotorhomeDao extends JpaRepository<Motorhome, UUID> {
}
