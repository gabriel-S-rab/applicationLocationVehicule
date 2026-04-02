package com.accenture.applicationlocationvehicule.controller.advice;

import java.time.LocalDateTime;
import java.util.List;

record ErrorsDto(
        LocalDateTime timestamp,
        int errorCode,
        List<ErrorValidDto> errors) {
}