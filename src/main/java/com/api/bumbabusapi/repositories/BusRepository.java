package com.api.bumbabusapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.bumbabusapi.models.BusModel;

@Repository
public interface BusRepository extends JpaRepository<BusModel,Integer> {
    
}
