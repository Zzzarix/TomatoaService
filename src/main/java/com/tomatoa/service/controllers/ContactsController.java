package com.tomatoa.service.controllers;

import com.tomatoa.service.http.Request;
import com.tomatoa.service.http.Response;
import com.tomatoa.service.service.ContactsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/service/contacts")
@RequiredArgsConstructor
public class ContactsController {
    final private ContactsService service;

    @GetMapping("/getContacts")
    public Response getContacts(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }

    @PutMapping("/addContact")
    public Response addContact(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }

    @PostMapping("/updateContact")
    public Response updateContact(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }

    @DeleteMapping("/deleteContact")
    public Response deleteContact(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }

}
