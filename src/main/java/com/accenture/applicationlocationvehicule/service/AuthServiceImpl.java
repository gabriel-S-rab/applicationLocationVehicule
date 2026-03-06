package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.config.SecurityConfig;
import com.accenture.applicationlocationvehicule.repository.AdministratorDao;
import com.accenture.applicationlocationvehicule.repository.entity.Administrator;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorResponseDto;
import com.accenture.applicationlocationvehicule.service.dto.AuthDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdministratorMapper;
import org.apache.tomcat.websocket.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final AdministratorDao administratorDao;
    private final AdministratorMapper administratorMapper;
    private final SecurityConfig securityConfig;


    public AuthServiceImpl(AdministratorDao administratorDao, AdministratorMapper administratorMapper, SecurityConfig securityConfig) {
        this.administratorDao = administratorDao;
        this.administratorMapper = administratorMapper;
        this.securityConfig = securityConfig;
    }

    public UserDetails authentification(String email, String password) throws AuthenticationException {
        Administrator administrator = administratorDao.findByEmail(email);
        AdministratorResponseDto administratorResponseDto = administratorMapper.toAdministratorResponseDto(administrator);
        // decoder password
        AuthDto authDto = new AuthDto(administratorResponseDto.email(), administratorResponseDto.password(), "ADMIN");
        if (administratorResponseDto.password().equals(password) && authDto.getRole() != null) {
            if ("USER".equals(authDto.getRole())) {
                return org.springframework.security.core.userdetails.User
                        .withUsername(authDto.getEmail())
                        .password(authDto.getPassword())
                        .roles("USER")
                        .build();
            } else {
                throw new AuthenticationException("erreur");
            } // a finir
        }
    }

}
