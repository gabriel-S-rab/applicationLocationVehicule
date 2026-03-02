package com.accenture.applicationlocationvehicule;

import com.accenture.applicationlocationvehicule.repository.entity.Rental;
import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.accenture.applicationlocationvehicule.service.mapper")
public class ApplicationLocationVehiculeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationLocationVehiculeApplication.class, args);
    }

}
