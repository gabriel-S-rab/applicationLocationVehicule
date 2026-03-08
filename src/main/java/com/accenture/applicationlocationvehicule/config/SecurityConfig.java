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


    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http){
        http
                .csrf(AbstractHttpConfigurer::disable)
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/v3/api-docs/**",
                                "/swagger-ui/**",
                                "/swagger-ui.html").permitAll()
                        .requestMatchers(HttpMethod.POST, "/Administrators/Administrator").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/Administrators/Administrator").permitAll()
                        .requestMatchers(HttpMethod.GET, "/cars").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/cars/{id}").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/cars/onTheFleet").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PATCH, "/cars").hasRole("ADMIN")

                        .requestMatchers(HttpMethod.GET, "/bikes/{id}").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/bikes/ontheFleet").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/bikes/bike").hasRole("ADMIN")

                        .requestMatchers(HttpMethod.PUT, "/vehicles/vehicle").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/vehicles").hasRole("USER")

                        .requestMatchers(HttpMethod.PUT, "/clients/client").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/clients").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PATCH, "/clients").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/clients/account").hasRole("ADMIN")
                       .anyRequest().authenticated()
                ).sessionManagement(sm-> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }


   @Bean
    PasswordEncoder passwordEncoder(){return PasswordEncoderFactories.createDelegatingPasswordEncoder();}




}
