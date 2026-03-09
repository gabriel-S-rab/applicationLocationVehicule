package com.accenture.applicationlocationvehicule.serviceTest;



import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.service.dto.AdressRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.dto.ClientResponseDto;
import com.accenture.applicationlocationvehicule.service.mapper.AdressMapper;
import com.accenture.applicationlocationvehicule.serviceTest.fake.FakeClientMapper;
import com.accenture.applicationlocationvehicule.serviceTest.fake.FakeClientRequestDto;
import com.accenture.applicationlocationvehicule.serviceTest.fake.FakeClientServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientServiceTest {


    private final FakeClientServiceImpl fakeClientServiceImpl;
    private final AdressMapper adressMapper;
    private final FakeClientMapper fakeClientMapper;

    public ClientServiceTest(FakeClientServiceImpl fakeClientServiceImpl, AdressMapper adressMapper, FakeClientMapper fakeClientMapper){
        this.fakeClientServiceImpl = new FakeClientServiceImpl();
        this.adressMapper  // faire un fake
        this.fakeClientMapper = fakeClientMapper;
    }


    @Test
    void addClientTest(){
        List<String> listLicense = new ArrayList<>();
        listLicense.add("A");
        listLicense.add("B");
        AdressRequestDto adressRequestDto = new AdressRequestDto("rue de la paix","paris","75000");
        Adress adress = adressMapper.toAdress(adressRequestDto);
        Date dateToday = new Date();
        SimpleDateFormat dateForma = new SimpleDateFormat("EEE dd MMM yyyy HH:mm:ss");
        String stringDateFormat = dateForma.format(dateToday);
        FakeClientRequestDto fakeClientRequestDto = new FakeClientRequestDto(1,"10/01/23",false,listLicense,stringDateFormat,"password","test@test.com",adress,"roger","robert");
        ClientResponseDto clientResponseDto = new ClientResponseDto(1,"10/01/23",false,listLicense, stringDateFormat, "password","test@test.com",adress,"roger","robert");
        ClientRequestDto clientRequestDto = fakeClientMapper.toClientRequestDto(fakeClientRequestDto);
         Assertions.assertEquals(fakeClientServiceImpl.addClient(clientRequestDto), clientResponseDto);
    }

}
