package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Adminstrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorDao extends JpaRepository<Adminstrator , Integer> {
}
