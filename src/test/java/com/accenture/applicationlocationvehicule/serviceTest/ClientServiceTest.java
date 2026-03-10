package com.accenture.applicationlocationvehicule.serviceTest;



import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import com.accenture.applicationlocationvehicule.serviceTest.fake.FakeAdressMapper;
import com.accenture.applicationlocationvehicule.serviceTest.fake.FakeClientMapper;
import com.accenture.applicationlocationvehicule.serviceTest.fake.FakeClientRequestDto;
import com.accenture.applicationlocationvehicule.serviceTest.fake.FakeClientServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientServiceTest {


    private final FakeClientServiceImpl fakeClientServiceImpl = new FakeClientServiceImpl();
    private final FakeAdressMapper fakeAdressMapper = new FakeAdressMapper();
    private final FakeClientMapper fakeClientMapper = new FakeClientMapper();
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public ClientServiceTest(){
    }


    @Test
    void addClientTest(){
        List<String> listLicense = new ArrayList<>();
        listLicense.add("A");
        listLicense.add("B");
        AdressRequestDto adressRequestDto = new AdressRequestDto("rue de la paix","paris","75000");
        Adress adress = fakeAdressMapper.toAdress(adressRequestDto);
        Date dateToday = new Date();
        SimpleDateFormat dateForma = new SimpleDateFormat("EEE dd MMM yyyy HH:mm:ss");
        String stringDateFormat = dateForma.format(dateToday);
        FakeClientRequestDto fakeClientRequestDto = new FakeClientRequestDto(1L,"10/01/23",false,listLicense,stringDateFormat,"password","test@test.com",adress,"roger","robert");
        ClientResponseDto clientResponseDto = fakeClientServiceImpl.addClient(fakeClientRequestDto);
        Assertions.assertEquals(clientResponseDto.id(), fakeClientRequestDto.id());
         Assertions.assertEquals(clientResponseDto.dateOfBirth(),fakeClientRequestDto.dateOfBirth());
         Assertions.assertEquals(clientResponseDto.email(),fakeClientRequestDto.email());
         Assertions.assertEquals(clientResponseDto.firstName(),fakeClientRequestDto.firstName());
         Assertions.assertEquals(clientResponseDto.lastName(),fakeClientRequestDto.lastName());
         Assertions.assertEquals(clientResponseDto.adress().getCity(),fakeClientRequestDto.adress().getCity());
         Assertions.assertEquals(clientResponseDto.adress().getStreet(),fakeClientRequestDto.adress().getStreet());
         Assertions.assertEquals(clientResponseDto.adress().getPostalCode(),fakeClientRequestDto.adress().getPostalCode());
         Assertions.assertFalse(clientResponseDto.desactivated());
         Assertions.assertEquals(clientResponseDto.registrationDate(),fakeClientRequestDto.registrationDate());
    }


    @Test
    void findByClientTest(){
        String email = "test@test.com";
        String password = "password";
        ClientResponseDto clientResponseDto = fakeClientServiceImpl.findByClient(email ,password);
        Client client = fakeClientMapper.toClient(clientResponseDto);
        Assertions.assertEquals(email, client.getEmail());
        Assertions.assertTrue(passwordEncoder.matches(password,client.getPassword()));
    }

}
