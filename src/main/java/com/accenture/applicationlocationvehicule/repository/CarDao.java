package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CarDao extends JpaRepository<Car, UUID> {

    List<Car> findByremovedFromTheFleet(boolean removed_from_the_fleet);
}
