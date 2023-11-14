package com.api.bumbabusapi.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.api.bumbabusapi.DTOS.RouteDTO;

import com.api.bumbabusapi.models.RouteModel;
import com.api.bumbabusapi.services.RouteService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/route")
public class RouteController {

    final RouteService routeService;

    public RouteController(RouteService routeService){
        this.routeService = routeService;
    }
    

     @PostMapping 
    public ResponseEntity<Object> SignUpRoute(@RequestBody RouteDTO routeDTO) {
        try {
            var routeModel = new RouteModel();
            BeanUtils.copyProperties(routeDTO, routeModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(routeService.save(routeModel));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao processar a solicitação: " + e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllRoutes() {
        List<RouteModel> routes = routeService.findAll();
    
        if (routes.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma rota de ônibus encontrada.");
        }
    
        return ResponseEntity.status(HttpStatus.OK).body(routes);
    }
}