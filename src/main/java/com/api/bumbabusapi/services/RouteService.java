package com.api.bumbabusapi.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.api.bumbabusapi.models.RouteModel;
import com.api.bumbabusapi.repositories.RouteRepository;

@Service
public class RouteService {
    
    final RouteRepository routeRepository;



    RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    
     public RouteModel save(RouteModel routeModel) {
        return routeRepository.save(routeModel);
    }

    public List<RouteModel> findAll(){
        return routeRepository.findAll();
    }

   

}