package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.exception.AdministratorException;
import com.accenture.applicationlocationvehicule.repository.AdministratorDao;
import com.accenture.applicationlocationvehicule.repository.entity.Administrator;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorResponseDto;
import com.accenture.applicationlocationvehicule.service.dto.AdressResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdministratorMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements Administratorservice {

    private final AdministratorDao administratorDao;
    private final AdministratorMapper administratorMapper;


    public AdministratorServiceImpl(AdministratorDao administratorDao, AdministratorMapper administratorMapper) {
        this.administratorDao = administratorDao;
        this.administratorMapper = administratorMapper;
    }


    @Override
    public AdministratorResponseDto addAdministrator(AdministratorRequestDto administratorRequestDto){
        if(administratorRequestDto.email() == null || administratorRequestDto.email().isBlank()
        || administratorRequestDto.firstName() == null || administratorRequestDto.firstName().isBlank()
        || administratorRequestDto.lastName() == null || administratorRequestDto.lastName().isBlank()
        || administratorRequestDto.password() == null || administratorRequestDto.password().isBlank()
        || administratorRequestDto.function() == null || administratorRequestDto.function().isBlank())
            throw new AdministratorException("erreur lors de l'ajout de l'administrateur"+ HttpStatus.BAD_REQUEST);
        Administrator administrator = administratorMapper.toAdministrator(administratorRequestDto);
        Administrator administratorSaved = administratorDao.save(administrator);
        if(administratorSaved == null)
            throw new AdministratorException("erreur lors de l'ajout de l'admministrateur"+HttpStatus.BAD_REQUEST);
       AdministratorResponseDto administratorResponseDto = administratorMapper.toAdministratorResponseDto(administratorSaved);
       return administratorResponseDto;
    }

    @Override
    public AdministratorResponseDto findByIdAdministrator(AdministratorRequestDto administratorRequestDto) {
        return null;
    }

    @Override
    public List<AdministratorResponseDto> findAllAdministrator() {
        return List.of();
    }

    @Override
    public AdministratorResponseDto deleteByIdAdministrator(AdministratorRequestDto administratorRequestDto) {
        return null;
    }
}
