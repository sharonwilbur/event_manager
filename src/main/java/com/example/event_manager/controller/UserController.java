package com.example.event_manager.controller;

import com.example.event_manager.entity.*;
import com.example.event_manager.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private EventTypesService eventTypesservice;
    @Autowired
    private EventsService eventsservice;
    @Autowired
    private FoodOrderService foodOrderService;
    @Autowired
    private VendorService vendorService;

    @Autowired
    private PaymentService paymentservice;


    @GetMapping("/eventType")
    public List<EventTypes> geteventTypes()
    {
        return eventTypesservice.getalleventTypes();
    }

    @GetMapping("/events")
    public List<Events> getevents(){
        List<Events> allevents=new ArrayList<>();
        allevents=eventsservice.getallevents();
        return allevents;
    }

    @GetMapping("/foodorder")
    public List<FoodOrder> getfood(){
        return foodOrderService.getallfoodorders();
    }

    @GetMapping("/venuevendor")
    public List<Vendor> getallvenue(){
        return vendorService.getallvenuevendor();
    }

    @GetMapping("/musicvendor")
    public List<Vendor> getallmusic(){
        return vendorService.getallmusicvendor();
    }

    @GetMapping("/payment")
    public List<Payment> getpayment(){
        return paymentservice.getallpayment();
    }
    


}
