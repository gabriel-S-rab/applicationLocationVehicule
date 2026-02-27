package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client , Integer> {
}
