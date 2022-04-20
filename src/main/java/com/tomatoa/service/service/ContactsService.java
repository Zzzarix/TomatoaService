package com.tomatoa.service.service;

import com.tomatoa.service.models.Channel;
import com.tomatoa.service.repository.ChannelsRepository;
import com.tomatoa.service.repository.ContactsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ContactsService {
    final private ContactsRepository repository;

    public Map<Long, Channel> getChannels(Long id) {
        return null;
    }
}
