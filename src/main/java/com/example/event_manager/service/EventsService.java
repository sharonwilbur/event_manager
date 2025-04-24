package com.example.event_manager.service;

import com.example.event_manager.Repository.EventsRepository;
import com.example.event_manager.entity.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {
    @Autowired
    private EventsRepository eventsrepository;

    public List<Events> getallevents(){
        return eventsrepository.findAll();
    }
}
