package com.tomatoa.service.controllers;

import com.tomatoa.service.http.Request;
import com.tomatoa.service.http.Response;
import com.tomatoa.service.service.MessagesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/service/messages")
@RequiredArgsConstructor
public class MessagesController {

    final private MessagesService service;

    @PostMapping("/sendMessage")
    public Response sendMesage(@RequestBody Request request) {

        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }

    @PostMapping("/getMessages")
    public Response getMessages(@RequestBody Map<String, Object> request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }
}
