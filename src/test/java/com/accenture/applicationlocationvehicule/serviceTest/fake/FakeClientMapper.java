package com.accenture.applicationlocationvehicule.serviceTest.fake;

import com.accenture.applicationlocationvehicule.service.dto.ClientRequestDto;
import com.accenture.applicationlocationvehicule.service.mapper.ClientMapper;
import org.mapstruct.Mapper;

@Mapper
public interface FakeClientMapper extends ClientMapper {

    ClientRequestDto toClientRequestDto(FakeClientRequestDto fakeClientRequestDto);
}
