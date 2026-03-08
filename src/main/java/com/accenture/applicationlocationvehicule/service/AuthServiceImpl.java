package com.accenture.applicationlocationvehicule.service;


import com.accenture.applicationlocationvehicule.exception.AuthException;
import com.accenture.applicationlocationvehicule.repository.AdministratorDao;
import com.accenture.applicationlocationvehicule.repository.ClientDao;
import com.accenture.applicationlocationvehicule.repository.entity.Administrator;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements UserDetailsService {

    private final AdministratorDao administratorDao;
    private final ClientDao clientDao;


    public AuthServiceImpl(AdministratorDao administratorDao, ClientDao clientDao) {
        this.administratorDao = administratorDao;
        this.clientDao = clientDao;
    }




    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

         Optional<Administrator> optAdmin = administratorDao.findByEmail(email);
        Optional<Client> optClient = clientDao.findByEmail(email);

        if(optClient.isPresent()){
            Client client = optClient.get();

            return User.builder()
                    .username(client.getEmail())
                    .password(client.getPassword())
                    .roles("USER")
                    .build();
        }

        if(optAdmin.isPresent()) {
           Administrator administrator = optAdmin.get();

            return User.builder()
                    .username(administrator.getEmail())
                    .password(administrator.getPassword())
                    .roles("ADMIN")
                    .build();
        }
        throw  new AuthException("erreur");
    }
}
