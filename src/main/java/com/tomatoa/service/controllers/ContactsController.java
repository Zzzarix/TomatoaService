package com.tomatoa.service.controllers;

import com.tomatoa.service.http.Response;
import com.tomatoa.service.models.Contact;
import com.tomatoa.service.service.ContactsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/service/contacts")
@RequiredArgsConstructor
public class ContactsController {
    final private ContactsService service;

    @GetMapping("/{userId}/getMe")
    public Response getMe(@PathVariable(name = "userId") Long userId) {
        try {
            return new Response(Map.of("contacts", service.getContact(userId)), HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{userId}/getContacts")
    public Response getContacts(@PathVariable(name = "userId") Long userId) {
        try {
            return new Response(Map.of("contacts", service.getContacts(userId)), HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{userId}/addContact")
    public Response addContact(@PathVariable(name = "userId") Long userId, @RequestBody Map<String, Contact> request) {
        Contact contact = request.get("contact");

        if (contact == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }
        try {
            service.addContact(userId, contact);

            return new Response(HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/{userId}/updateContact")
    public Response updateContact(@PathVariable(name = "userId") Long userId, @RequestBody Map<String, Contact> request) {
        Contact oldContact = request.get("oldContact");
        Contact newContact = request.get("newContact");

        if (oldContact == null || newContact == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }
        try {
            service.updateContact(userId, oldContact, newContact);

            return new Response(HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{userId}/deleteContact")
    public Response deleteContact(@PathVariable(name = "userId") Long userId, @RequestBody Map<String, Contact> request) {
        Contact contact = request.get("contact");

        if (contact == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }
        try {
            service.removeContact(userId, contact);

            return new Response(HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
