package com.accenture.applicationlocationvehicule.serviceTest.fake;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.AdressResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class FakeAdressMapper implements AdressMapper {

    private  AdressMapper adressMapper = Mappers.getMapper(AdressMapper.class);


    public FakeAdressMapper(){}


    @Override
    public Adress toAdress(AdressRequestDto adressRequestDto) {
        return adressMapper.toAdress(adressRequestDto);
    }

    @Override
    public Adress toAdress(AdressResponseDto adressResponseDto) {
        return null;
    }

    @Override
    public AdressRequestDto toAdressRequestDto(Adress adress) {
        return null;
    }
}
