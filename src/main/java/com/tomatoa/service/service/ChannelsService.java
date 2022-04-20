package com.tomatoa.service.service;

import com.tomatoa.service.repository.ChannelsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChannelsService {
    final private ChannelsRepository repository;
}
