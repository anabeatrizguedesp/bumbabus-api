package com.api.bumbabusapi.DTOS;

import com.api.bumbabusapi.models.LineModel;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class BusDTO {

     @Id @NotNull 
    private int bus_id;
    
    @NotNull  @Size(max = 3)
    private int line_number;

    @OneToMany
    @JoinColumn(name= "line_id", nullable=false)
    private LineModel line;
  
    @NotBlank @Size(max=7)
    private String plate;

    @NotNull 
    private int maxCrowd;

    @NotNull
    private int qtdSeat;

    

    public int getBus_id() {
        return bus_id;
    }

    public int getLine_number() {
        return line_number;
    }

    public LineModel getLine() {
        return line;
    }

    public String getPlate() {
        return plate;
    }

    public int getMaxCrowd() {
        return maxCrowd;
    }

    public int getQtdSeat() {
        return qtdSeat;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public void setLine_number(int line_number) {
        this.line_number = line_number;
    }

    public void setLine(LineModel line) {
        this.line = line;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setMaxCrowd(int maxCrowd) {
        this.maxCrowd = maxCrowd;
    }

    public void setQtdSeat(int qtdSeat) {
        this.qtdSeat = qtdSeat;
    }
}
