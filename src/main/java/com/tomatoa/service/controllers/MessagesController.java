package com.tomatoa.service.controllers;

import com.tomatoa.service.http.Response;
import com.tomatoa.service.models.Message;
import com.tomatoa.service.service.MessagesService;
import com.tomatoa.service.utils.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/service/messages")
@RequiredArgsConstructor
public class MessagesController {

    final private MessagesService service;

    @PostMapping("/{userId}/sendMessage")
    public Response sendMessage(@PathVariable(name = "userId") Long userId, @RequestBody Message message) {
        if (message == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }

        try {
            service.sendMessage(userId, message);

            return new Response(HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{userId}/updateMessage")
    public Response updateMessages(@PathVariable(name = "userId") Long userId, @RequestBody Map<String, Message> messages) {
        Message oldMessage = messages.get("oldMessage");
        Message newMessage = messages.get("newMessage");

        if (oldMessage == null || newMessage == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }

        try {
            service.updateMessages(userId, oldMessage, newMessage);

            return new Response(HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{userId}/removeMessage")
    public Response removeMessage(@PathVariable(name = "userId") Long userId, @RequestBody Message message) {
        if (message == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }
        try {
            service.removeMessage(userId, message);

            return new Response(HttpStatus.ACCEPTED);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
