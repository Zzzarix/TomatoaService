package com.tomatoa.service.service;

import com.tomatoa.service.models.Channel;
import com.tomatoa.service.models.Message;
import com.tomatoa.service.repository.MessagesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessagesService {
    final private MessagesRepository repository;

    public void sendMessage(Long userId, Message message) {
        // Auth user by userId
        // ....
        repository.sendMessage(message);
    }

    public void updateMessages(Long userId, Message oldMessage, Message newMessage) {
        // Auth user by userId
        // ....
        repository.updateMessage(oldMessage, newMessage);
    }

    public void removeMessage(Long userId, Message message) {
        // Auth user by userId
        // ....
        repository.removeMessage(message);
    }
}
