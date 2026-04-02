package com.accenture.applicationlocationvehicule.repository;


import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.sun.security.auth.UnixNumericUserPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientDao extends JpaRepository<Client , UUID> {

    Optional<Client> findByEmail(String email);


}
