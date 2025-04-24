package com.example.event_manager.service;

import com.example.event_manager.Repository.PaymentRepository;
import com.example.event_manager.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentrepository;


    public List<Payment> getallpayment(){
        return paymentrepository.findAll();
    }
}
