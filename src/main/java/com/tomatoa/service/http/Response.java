package com.tomatoa.service.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import java.util.Map;

public class Response extends ResponseEntity<Map<String, Object>> {
    public HttpStatus status;

    public Response(Map<String, Object> body, HttpStatus status) {
        super(body, status);
    }
}
