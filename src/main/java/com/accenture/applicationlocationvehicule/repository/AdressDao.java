package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressDao extends JpaRepository<Adress , Long> {
}
