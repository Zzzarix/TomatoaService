package com.tomatoa.service.service;

import com.tomatoa.service.repository.MessagesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessagesService {
    final private MessagesRepository repository;
}
