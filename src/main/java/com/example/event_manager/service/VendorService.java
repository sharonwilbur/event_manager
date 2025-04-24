package com.example.event_manager.service;

import com.example.event_manager.Repository.VendorRepository;
import com.example.event_manager.entity.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorsRepository;

    public List<Vendor> getallVendors() {
        return vendorsRepository.findAll();
    }

    public List<Vendor> getVendorsByServiceType(String serviceType) {
        return vendorsRepository.findByServiceType(serviceType);
    }

    public List<Vendor> getallfoodvendor(){
        return vendorsRepository.findByServiceType("FOOD");
    }

    public List<Vendor> getallmusicvendor(){
        return vendorsRepository.findByServiceType("MUSIC");
    }
    public List<Vendor> getallvenuevendor(){
        return vendorsRepository.findByServiceType("VENUE");
    }
}
