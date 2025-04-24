package com.example.event_manager.service;

import com.example.event_manager.Repository.FoodOrderRepository;
import com.example.event_manager.entity.FoodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodOrderService {

    @Autowired
    private FoodOrderRepository foodOrderRepository;

    public List<FoodOrder> getallfoodorders(){
        return foodOrderRepository.findAll();
    }
}
