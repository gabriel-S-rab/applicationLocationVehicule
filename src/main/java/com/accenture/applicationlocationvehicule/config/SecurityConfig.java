package com.accenture.applicationlocationvehicule.config;


import com.accenture.applicationlocationvehicule.service.dto.AuthDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import jakarta.annotation.sql.DataSourceDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {


    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http){
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/v3/api-docs/**",
                                "/swagger-ui/**",
                                "/swagger-ui.html").permitAll()
                        .requestMatchers(HttpMethod.GET, "/cars").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/cars/{id}").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/cars/onTheFleet").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PATCH, "/cars").hasRole("ADMIN")

                        .requestMatchers(HttpMethod.GET, "/bikes/{id}").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/bikes/ontheFleet").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/bikes/bike").hasRole("ADMIN")

                        .requestMatchers(HttpMethod.PUT, "/vehicles/vehicle").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/vehicles").hasRole("ADMIN")

                        .requestMatchers(HttpMethod.PUT, "/clients/client").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/clients").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PATCH, "/clients").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "clients/account").hasRole("ADMIN")
                        .anyRequest().authenticated()
                ).sessionManagement(sm-> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }


    @Bean
   public PasswordEncoder passwordEncoder(){return PasswordEncoderFactories.createDelegatingPasswordEncoder();}

//
//    @Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource){  // verif bonne class datasource
//        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
//        jdbcUserDetailsManager.setUsersByUsernameQuery("select email , password , 1 from administrator where email = ?");
//        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("ADMIN");
//        return jdbcUserDetailsManager;
//    }



    @Bean
   public UserDetailsManager inMemoryUserDetailManager(AuthDto authDto){

        if("USER".equals(authDto.getRole())) {
            UserDetails user = org.springframework.security.core.userdetails.User
                    .withUsername(authDto.getEmail())
                    .password(passwordEncoder().encode(authDto.getPassword()))
                    .roles("USER")
                    .build();
        }
        if("ADMIN".equals(authDto.getRole())) {
            UserDetails admin = org.springframework.security.core.userdetails.User
                    .withUsername(authDto.getEmail())
                    .password(passwordEncoder().encode(authDto.getPassword()))
                    .roles("ADMIN")
                    .build();

        }

        return inMemoryUserDetailManager(authDto);
    }



}
