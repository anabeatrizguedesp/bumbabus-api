package com.api.bumbabusapi.services;

import java.util.List;


import org.springframework.stereotype.Service;


import com.api.bumbabusapi.models.LineModel;
import com.api.bumbabusapi.repositories.LineRepository;

import jakarta.transaction.Transactional;

@Service
public class LineService {
    
    final LineRepository lineRepository;
    

    LineService(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }

    @Transactional
    public LineModel save(LineModel lineModel) {
        return lineRepository.save(lineModel);
    }

   public List<LineModel> findAll(){
        return lineRepository.findAll();
    }

        
    }
