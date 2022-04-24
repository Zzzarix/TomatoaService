package com.tomatoa.service.repository;

import com.tomatoa.service.models.Channel;
import com.tomatoa.service.models.Message;
import org.springframework.stereotype.Repository;

@Repository
public class MessagesRepository {
    public Channel getChannel(Long chanId) {
        return new Channel();
    }

    public void sendMessage(Message message) {
        // get channel and updates messages
    }

    public void updateMessage(Message oldMessage, Message newMessage) {
    }

    public void removeMessage(Message message) {
    }
}
