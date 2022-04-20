package com.tomatoa.service.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class Request extends HashMap<String, Object> {
    public HttpStatus status;

    public Request(Map<String, Object> body) {
        super(body);
    }
}
