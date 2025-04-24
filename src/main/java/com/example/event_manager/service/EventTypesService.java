package com.example.event_manager.service;

import com.example.event_manager.Repository.EventTypesRepository;
import com.example.event_manager.entity.EventTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTypesService {
    @Autowired
    private EventTypesRepository eventTyperepository;


    public List<EventTypes> getalleventTypes()
    {
        return eventTyperepository.findAll();
    }
}
