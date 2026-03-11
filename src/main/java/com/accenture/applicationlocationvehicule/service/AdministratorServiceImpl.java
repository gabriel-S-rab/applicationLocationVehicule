package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.exception.AdministratorException;
import com.accenture.applicationlocationvehicule.exception.AuthException;
import com.accenture.applicationlocationvehicule.repository.AdministratorDao;
import com.accenture.applicationlocationvehicule.repository.entity.Administrator;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdministratorResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdministratorMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class AdministratorServiceImpl implements Administratorservice {

    private final AdministratorDao administratorDao;
    private final AdministratorMapper administratorMapper;
    private final PasswordEncoder passwordEncoder;


    public AdministratorServiceImpl(AdministratorDao administratorDao, AdministratorMapper administratorMapper, PasswordEncoder passwordEncoder) {
        this.administratorDao = administratorDao;
        this.administratorMapper = administratorMapper;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    @Transactional
    public AdministratorResponseDto addAdministrator(AdministratorRequestDto administratorRequestDto){
        if(administratorRequestDto.email() == null || administratorRequestDto.email().isBlank()
        || administratorRequestDto.firstName() == null || administratorRequestDto.firstName().isBlank()
        || administratorRequestDto.lastName() == null || administratorRequestDto.lastName().isBlank()
        || administratorRequestDto.password() == null || administratorRequestDto.password().isBlank()
        || administratorRequestDto.function() == null || administratorRequestDto.function().isBlank())
            throw new AdministratorException("erreur lors de l'ajout de l'administrateur"+ HttpStatus.BAD_REQUEST);
        Administrator administrator = administratorMapper.toAdministrator(administratorRequestDto);
        administrator.setPassword(passwordEncoder.encode(administratorRequestDto.password()));
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
        List<Administrator> listAdminisrator = administratorDao.findAll();
        return administratorMapper.toAdministratorResponseDto(listAdminisrator);
    }


    @Override
    @Transactional
    public AdministratorResponseDto deleteByIdAdministrator(UUID id){
        List<AdministratorResponseDto>  listAdministratorResponseDto = findAllAdministrator();
        if(listAdministratorResponseDto.size() > 1) {
            try {

                Administrator administratorExist = administratorDao.getReferenceById(id);
                administratorExist.getId();
                administratorDao.delete(administratorExist);
                return administratorMapper.toAdministratorResponseDto(administratorExist);
            } catch (EntityNotFoundException e) {
                throw new AdministratorException("erreur");
            }
        }
        throw new AuthException("erreur");
    }
}
