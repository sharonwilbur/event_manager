package com.example.event_manager.service;

import com.example.event_manager.Repository.foodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class foodService {
    @Autowired
    private foodRepository foodrepository;
}
