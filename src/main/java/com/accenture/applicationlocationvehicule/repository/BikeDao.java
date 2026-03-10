package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BikeDao extends JpaRepository<Bike , UUID> {

    List<Bike> findByRemovedFromThePark(boolean findByRemovedFromThePark);
}
