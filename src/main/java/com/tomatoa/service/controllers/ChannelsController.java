package com.tomatoa.service.controllers;

import com.tomatoa.service.http.Response;
import com.tomatoa.service.models.Channel;
import com.tomatoa.service.service.ChannelsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/service/channels")
@RequiredArgsConstructor
public class ChannelsController {
    final private ChannelsService service;

    @GetMapping("/{userId}/getChannels")
    public Response getChannels(@PathVariable(name = "userId") Long userId) {
        try {
            return new Response(Map.of("channels", service.getChannels(userId)), HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{userId}/getMessages")
    public Response getMessages(@PathVariable(name = "userId") Long userId, @RequestParam(name = "chanId") Long chanId) {
        try {
            return new Response(Map.of("messages", service.getMessages(userId, chanId)), HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{userId}/addChannel")
    public Response addChannel(@PathVariable(name = "userId") Long userId, @RequestBody Map<String, Channel> request) {
        Channel channel = request.get("channel");

        if (channel == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }
        try {
            service.addChannel(userId, channel);

            return new Response(HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/{userId}/updateChannel")
    public Response updateChannel(@PathVariable(name = "userId") Long userId, @RequestBody Map<String, Channel> request) {
        Channel oldChannel = request.get("oldChannel");
        Channel newChannel = request.get("newChannel");

        if (oldChannel == null || newChannel == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }
        try {
            service.updateChannel(userId, oldChannel, newChannel);

            return new Response(HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{userId}/deleteChannel")
    public Response deleteChannel(@PathVariable(name = "userId") Long userId, @RequestBody Map<String, Channel> request) {
        Channel channel = request.get("channel");

        if (channel == null) {
            return new Response(HttpStatus.BAD_REQUEST);
        }
        try {
            service.removeChannel(userId, channel);

            return new Response(HttpStatus.OK);
        }
        catch (Exception ex) {
            return new Response(Map.of("error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
