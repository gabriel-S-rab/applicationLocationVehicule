package com.accenture.applicationlocationvehicule.service;

import org.apache.tomcat.websocket.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public interface AuthService {


   UserDetails authentification(String email , String password) throws AuthenticationException;
}
