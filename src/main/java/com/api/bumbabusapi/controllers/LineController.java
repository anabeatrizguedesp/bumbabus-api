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

import com.api.bumbabusapi.DTOS.LineDTO;
import com.api.bumbabusapi.models.LineModel;

import com.api.bumbabusapi.services.LineService;



@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/line")
public class LineController {

    final LineService lineService;

    public LineController(LineService lineService){
        this.lineService = lineService;
    }

    @PostMapping 
    public ResponseEntity<Object> SignUpLine(@RequestBody LineDTO lineDTO) {
        try {
            var lineModel = new LineModel();
            BeanUtils.copyProperties(lineDTO, lineModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(lineService.save(lineModel));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao processar a solicitação: " + e.getMessage());
        }
    }
   
    @GetMapping
    public ResponseEntity<?> getAllLines() {
        List<LineModel> lines = lineService.findAll();
    
        if (lines.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma linha de ônibus encontrada.");
        }
    
        return ResponseEntity.status(HttpStatus.OK).body(lines);
    }

   
  /*  @GetMapping("/{line}")
    public ResponseEntity<?> getOneByNumber(@PathVariable(value = "line_number") int line_number) {
        Optional<LineModel> lineModelOptional = lineService.existenumero(line_number);

        if (lineModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(lineModelOptional.get());
        
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Linha não encontrada para o número: " + line_number);
        }
    }*/ 
}