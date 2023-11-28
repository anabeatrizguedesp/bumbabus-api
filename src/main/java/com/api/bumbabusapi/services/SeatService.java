package com.api.bumbabusapi.services;

import java.util.List;

import com.api.bumbabusapi.models.SeatModel;
import com.api.bumbabusapi.repositories.SeatRepository;

public class SeatService {

    final SeatRepository seatRepository;



    SeatService (SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    
     public SeatModel save(SeatModel seatModel) {
        return seatRepository.save(seatModel);
    }

    public List<SeatModel> findAll(){
        return seatRepository.findAll();
    }



    
}
