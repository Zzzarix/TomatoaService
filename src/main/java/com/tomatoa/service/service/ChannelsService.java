package com.tomatoa.service.service;

import com.tomatoa.service.models.Channel;
import com.tomatoa.service.models.Message;
import com.tomatoa.service.repository.ChannelsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChannelsService {
    final private ChannelsRepository repository;

    public Channel getChannels(Long userId) {
        return repository.getChannels(userId);
    }

    public List<Message> getMessages(Long userId, Long chanId) {
        Channel channel = repository.getChannel(chanId);
        return channel.getMessages();
    }

    public void removeChannel(Long userId, Channel channel) {
        repository.removeChannel(channel);
    }

    public void addChannel(Long userId, Channel channel) {
        repository.addChannel(channel);
    }

    public void updateChannel(Long userId, Channel oldChannel, Channel newChannel) {
        repository.updateChannel(oldChannel, newChannel);
    }
}
