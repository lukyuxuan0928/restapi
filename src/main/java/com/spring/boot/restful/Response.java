package com.spring.boot.restful;

import com.spring.boot.dto.ResponseBaseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response {
    public static <T>ResponseEntity buildResponse(String code, String message, T result) {
        ResponseBaseDto <T> responseBaseDto = new ResponseBaseDto<>();

        responseBaseDto.setCode(code);
        responseBaseDto.setMessage(message);
        responseBaseDto.setResult(result);

        return new ResponseEntity<>(responseBaseDto, HttpStatus.OK);
    }
}
