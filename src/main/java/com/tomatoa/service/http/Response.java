package com.tomatoa.service.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import java.io.Serializable;
import java.util.Map;

public class Response extends ResponseEntity<Map<String, Object>> implements Serializable {
    public Response(Map<String, Object> body, HttpStatus status) {
        super(body, status);
    }

    public Response(HttpStatus status) {
        super(status);
    }
}
