package com.tomatoa.service.repository;

import com.tomatoa.service.models.Channel;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelsRepository {
    public Channel getChannels(Long userId) {
        return new Channel();
    }

    public Channel getChannel(Long chanId) {
        return new Channel();
    }

    public void removeChannel(Channel channel) {
    }

    public void addChannel(Channel channel) {
    }

    public void updateChannel(Channel oldChannel, Channel newChannel) {
    }
}
