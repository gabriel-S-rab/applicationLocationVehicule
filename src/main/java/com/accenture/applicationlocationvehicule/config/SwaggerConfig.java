package com.accenture.applicationlocationvehicule.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import javax.swing.*;

@Configuration
public class SwaggerConfig {



    @Bean
    public OpenAPI customOpneapi(){

        Components components = new Components()
                .addSecuritySchemes("BasicAuth" ,
                        new io.swagger.v3.oas.models.security.SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("basic"));

        return new OpenAPI()
                .components(components)
                .info(new Info()
                .title("API REST application de gestion de location de vehicule")
                .version("1.0.0")
                .description("API REST pour gestion de l'application"));
    }
}
