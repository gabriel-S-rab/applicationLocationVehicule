package com.accenture.applicationlocationvehicule.service;

import com.accenture.applicationlocationvehicule.exception.ClientException;
import com.accenture.applicationlocationvehicule.repository.ClientDao;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdressMapper;
import com.accenture.applicationlocationvehicule.service.mapper.ClientMapper;

import org.hibernate.grammars.hql.HqlParser;
import org.hibernate.validator.internal.constraintvalidators.bv.time.futureorpresent.FutureOrPresentValidatorForLocalDateTime;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{


    private final AdressMapper adressMapper;
    private final ClientMapper clientMapper;
    private final ClientDao clientDao;


    public ClientServiceImpl(AdressMapper adressMapper, ClientMapper clientMapper, ClientDao clientDao) {
        this.adressMapper = adressMapper;
        this.clientMapper = clientMapper;
        this.clientDao = clientDao;
    }


   @Override
   public ClientResponseDto addClient(ClientRequestDto clientRequestDto){
        if(clientRequestDto.dateOfBirth() == null || clientRequestDto.dateOfBirth().isBlank()
           || clientRequestDto.registrationDate() == null || clientRequestDto.registrationDate().isBlank()
           || clientRequestDto.adress() == null
                || clientRequestDto.email() == null || clientRequestDto.email().isBlank()
               || clientRequestDto.password()== null || clientRequestDto.password().isBlank()
        || clientRequestDto.firstName() == null || clientRequestDto.firstName().isBlank()
        || clientRequestDto.lastName() == null || clientRequestDto.lastName().isBlank()
        ||clientRequestDto.desactivated() == null)
            throw new ClientException("erreur lors de l'ajout du client"+HttpStatus.BAD_REQUEST);
        Client client = clientMapper.toClient(clientRequestDto);
      Date dateToday = new Date();
       SimpleDateFormat dateForma = new SimpleDateFormat("EEE dd MMM yyyy HH:mm:ss");
      String stringDateFormat = dateForma.format(dateToday);
       client.setRegistrationDate(stringDateFormat);
        Client saved  =  clientDao.save(client);
      if(saved == null)
          throw new ClientException("erreur lors de l'ajout du client"+HttpStatus.BAD_REQUEST);
         ClientResponseDto clientResponseDto = clientMapper.toClientResponseDto(client);
        return clientResponseDto;
       }


    @Override
    public ClientResponseDto findByIdClient(ClientRequestDto clientRequestDto){

       if(clientDao.exists(clientRequestDto.email()) || clientDao.exists(clientRequestDto.password()))
        return null;
    }

    @Override
    public List<ClientResponseDto> findAllClient() {
        return List.of();
    }

    @Override
    public ClientResponseDto deleteByIdClient(ClientRequestDto clientRequestDto) {
        return null;
    }
}
