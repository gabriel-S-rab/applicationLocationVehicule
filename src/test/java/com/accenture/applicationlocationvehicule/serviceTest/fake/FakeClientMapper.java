package com.accenture.applicationlocationvehicule.serviceTest.fake;

import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdressMapper;
import com.accenture.applicationlocationvehicule.service.mapper.ClientMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class FakeClientMapper implements ClientMapper {



    private ClientMapper clientMapper = Mappers.getMapper(ClientMapper.class);
    private AdressMapper adressMapper = Mappers.getMapper(AdressMapper.class);



    public FakeClientMapper() {
    }


    @Override
    public Client toClient(ClientRequestDto clientRequestDto) {
        return null;
    }


    @Override
    public Client toClient(ClientResponseDto clientResponseDto){
        Client client = new Client();
        client.setDateOfBirth(clientResponseDto.dateOfBirth());
        client.setDesactivated(clientResponseDto.desactivated());
        client.setListOfLicenses(clientResponseDto.listOfLicenses());
        client.setRegistrationDate(clientResponseDto.registrationDate());
        client.setPassword(clientResponseDto.password());
        client.setEmail(clientResponseDto.email());
        client.setAdress(clientResponseDto.adress());
        client.setFirstName(clientResponseDto.firstName());
        client.setLastName(clientResponseDto.lastName());
        return client;
    }


    @Override
    public ClientResponseDto toClientResponseDto(Client client) {
        return new ClientResponseDto(client.getId(),client.getDateOfBirth(),client.getDesactivated(),client.getListOfLicenses(),client.getRegistrationDate(),client.getPassword(),
                client.getEmail(),client.getAdress(),client.getFirstName(),client.getLastName());
    }



    public ClientRequestDto toClientRequestDto(FakeClientRequestDto fakeClientRequestDto) {
      return new ClientRequestDto(fakeClientRequestDto.dateOfBirth(),fakeClientRequestDto.listOfLicenses(),fakeClientRequestDto.password(),fakeClientRequestDto.email(),adressMapper.toAdressRequestDto(fakeClientRequestDto.adress()),fakeClientRequestDto.firstName(),fakeClientRequestDto.lastName());
    }

    public Client toClient(FakeClientRequestDto fakeClientRequestDto) {
        Client client = new Client();
        client.setId(fakeClientRequestDto.id());
        client.setDateOfBirth(fakeClientRequestDto.dateOfBirth());
        client.setDesactivated(fakeClientRequestDto.desactivated());
        client.setListOfLicenses(fakeClientRequestDto.listOfLicenses());
        client.setRegistrationDate(fakeClientRequestDto.registrationDate());
        client.setPassword(fakeClientRequestDto.password());
        client.setEmail(fakeClientRequestDto.email());
        client.setAdress(fakeClientRequestDto.adress());
        client.setFirstName(fakeClientRequestDto.firstName());
        client.setLastName(fakeClientRequestDto.lastName());
        return client;
    }


}
