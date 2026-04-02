package com.accenture.applicationlocationvehicule.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    private final String admin = "ADMIN";
    private final String user = "USER";
    private final String pathGetCar = "/cars";
    private  final String pathGetCarId = "/cars/{id}";
    private final String pathGetCarOnFleet = "/cars/onTheFleet";
    private final String pathPatchCar = "/cars";
    private final String pathPostAdministrator = "/Administrators/Administrator";
    private final String pathDeleteAdministrator = "/Administrators/Administrator";
    private final String pathGetBikeId = "/bikes/{id}";
    private final String pathGetBikesOnTheFleet = "/bikes/ontheFleet";
    private final String pathGetBike = "/bikes/bike";
    private  final String pathPutVehicles = "/vehicles/vehicle";
    private final String pathGetVehicle = "/vehicles";
    private final String pathPutClient = "/clients/client";
    private final String pathDeleteClients = "/clients";
    private final String pathPatchclients = "/clients";
    private final String pathGetClient = "/clients/account";

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http){
        http
                .csrf(AbstractHttpConfigurer::disable)
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/v3/api-docs/**",
                                "/swagger-ui/**",
                                "/swagger-ui.html").permitAll()
                        .requestMatchers(HttpMethod.POST, pathPostAdministrator).permitAll()     //hasRole(admin)
                        .requestMatchers(HttpMethod.DELETE, pathDeleteAdministrator).permitAll()             //hasRole(admin)

                        .requestMatchers(HttpMethod.GET, pathGetCar).hasRole(admin)
                        .requestMatchers(HttpMethod.GET,pathGetCarId).hasRole(admin)
                        .requestMatchers(HttpMethod.GET, pathGetCarOnFleet).hasRole(admin)
                        .requestMatchers(HttpMethod.PATCH, pathPatchCar).hasRole(admin)

                        .requestMatchers(HttpMethod.GET, pathGetBikeId).hasRole(admin)
                        .requestMatchers(HttpMethod.GET, pathGetBikesOnTheFleet).hasRole(admin)
                        .requestMatchers(HttpMethod.GET, pathGetBike).hasRole(admin)

                        .requestMatchers(HttpMethod.PUT, pathPutVehicles).hasRole(admin)
                        .requestMatchers(HttpMethod.GET, pathGetVehicle).hasRole(admin)
                        .requestMatchers(HttpMethod.GET, "/vehicles/vehicle").permitAll()
                        .requestMatchers(HttpMethod.GET, "/vehicles").permitAll()

                        .requestMatchers(HttpMethod.PUT, pathPutClient).permitAll()
                        .requestMatchers(HttpMethod.DELETE, pathDeleteClients).hasRole(admin)
                        .requestMatchers(HttpMethod.PATCH, pathPatchclients).hasRole(user)
                        .requestMatchers(HttpMethod.GET, pathGetClient).hasRole(user)
                       .anyRequest().authenticated()
                ).sessionManagement(sm-> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }


   @Bean
    PasswordEncoder passwordEncoder(){return PasswordEncoderFactories.createDelegatingPasswordEncoder();}




}
