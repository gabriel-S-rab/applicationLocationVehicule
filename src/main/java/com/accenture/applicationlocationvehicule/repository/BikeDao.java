package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeDao extends JpaRepository<Bike , Long> {

    List<Bike> findByRemovedFromThePark(boolean findByRemovedFromThePark);
}
