package com.example.event_manager.controller;

import com.example.event_manager.entity.eventTypes;
import com.example.event_manager.service.eventTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private eventTypesService eventTypesservice;

    @GetMapping("/eventType")
    public List<eventTypes> geteventTypes()
    {
        List<eventTypes> allevents=new ArrayList<>();
        allevents=eventTypesservice.getalleventTypes();
        return allevents;
    }
}
