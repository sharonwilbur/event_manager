package com.example.event_manager.service;

import com.example.event_manager.Repository.eventTypesRepository;
import com.example.event_manager.entity.eventTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class eventTypesService {
    @Autowired
    private eventTypesRepository eventTyperepository;


    public List<eventTypes> getalleventTypes()
    {
        return eventTyperepository.findAll();
    }
}
