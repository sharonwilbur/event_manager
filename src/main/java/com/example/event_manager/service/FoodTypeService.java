package com.example.event_manager.service;

import com.example.event_manager.Repository.FoodTypeRepository;
import com.example.event_manager.entity.FoodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodTypeService {
    @Autowired
    private FoodTypeRepository foodTypeRepository;

    public List<FoodType> getallfoodtype(){
        return  foodTypeRepository.findAll();
    }
}
