package com.api.bumbabusapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.bumbabusapi.models.BusModel;
import com.api.bumbabusapi.repositories.BusRepository;

@Service
public class BusService {
    
    final BusRepository busRepository;

    BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<BusModel> findAll() {
        return busRepository.findAll();
    }
}