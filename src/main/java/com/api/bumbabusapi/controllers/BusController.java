package com.api.bumbabusapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bumbabusapi.models.BusModel;
import com.api.bumbabusapi.services.BusService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/bus")
public class BusController {

    final BusService busService;

    public BusController(BusService busService){
        this.busService = busService;
    }

    @GetMapping
    public ResponseEntity<?> getAllBuses() {
        List<BusModel> buses = busService.findAll();
    
        if (buses.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma rota de ônibus encontrada.");
        }
    
        return ResponseEntity.status(HttpStatus.OK).body(buses);
    }
    
}