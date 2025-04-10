package com.example.event_manager.service;

import com.example.event_manager.Repository.eventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class eventsService {
    @Autowired
    private eventsRepository eventsrepository;

}
