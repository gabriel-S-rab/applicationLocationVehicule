package com.accenture.applicationlocationvehicule.repository;

import com.accenture.applicationlocationvehicule.repository.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AdministratorDao extends JpaRepository<Administrator, UUID> {

    Optional<Administrator> findByEmail(String email);

}
