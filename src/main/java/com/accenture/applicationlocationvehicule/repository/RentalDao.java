package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalDao extends JpaRepository<Rental , Integer> {
}
