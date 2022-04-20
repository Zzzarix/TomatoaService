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
@RequestMapping("/service/channels")
@RequiredArgsConstructor
public class ChannelsController {
    final private ContactsService service;

    @GetMapping("/getChannels")
    public Response getChannels(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>();
        Long id = (Long)request.get("userId");
        if (id == null) {
            return new Response(body, HttpStatus.BAD_REQUEST);
        }
        try {
            body.put("channels", service.getChannels(id));
        }
        catch (Exception ex) {
            body.put("error", ex.getMessage());
            return new Response(body, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new Response(body, HttpStatus.OK);
    }

    @GetMapping("/getChannel")
    public Response getChannel(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }

    @PutMapping("/addChannel")
    public Response addChannel(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }

    @PostMapping("/updateChannel")
    public Response updateChannel(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }

    @DeleteMapping("/deleteChannel")
    public Response deleteChannel(@RequestBody Request request) {
        Map<String, Object> body = new HashMap<>(Map.of("Message", "Hello"));
        return new Response(body, HttpStatus.OK); // Test status
    }
}
