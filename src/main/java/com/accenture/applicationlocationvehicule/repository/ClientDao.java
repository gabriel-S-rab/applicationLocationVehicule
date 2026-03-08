package com.accenture.applicationlocationvehicule.repository;


import com.accenture.applicationlocationvehicule.repository.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientDao extends JpaRepository<Client , Long> {

    Optional<Client> findByEmail(String email);


}
