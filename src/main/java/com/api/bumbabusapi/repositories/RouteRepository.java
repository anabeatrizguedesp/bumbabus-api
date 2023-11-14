package com.api.bumbabusapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.bumbabusapi.models.RouteModel;

@Repository
public interface RouteRepository extends JpaRepository<RouteModel,Integer> {
   
}