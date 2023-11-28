package com.api.bumbabusapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.bumbabusapi.models.SeatModel;

@Repository
public interface SeatRepository extends JpaRepository<SeatModel,Integer> {
   
}
