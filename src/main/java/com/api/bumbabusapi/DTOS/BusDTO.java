package com.api.bumbabusapi.DTOS;

import java.util.List;

import com.api.bumbabusapi.models.LineModel;
import com.api.bumbabusapi.models.SeatMapModel;
import com.api.bumbabusapi.models.SeatModel;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class BusDTO {

     @Id @NotNull 
    private int bus_id;

    @ManyToOne
    @JoinColumn(name = "line_id", nullable = false)
    private LineModel line_id;
  
    @NotBlank @Size(max=7)
    private String plate;

    @NotNull 
    private int maxCrowd;

    @OneToMany(mappedBy = "bus_id") // Correção: mappedBy deve ser o atributo na entidade SeatModel que referencia o BusModel
    private List<SeatModel> seats; // Correção: Renomear para "seats" para representar a lista de assentos associados ao ônibus

    @OneToMany(mappedBy = "bus_id") // Correção: mappedBy deve ser o atributo na entidade SeatMapModel que referencia o BusModel
    private List<SeatMapModel> seatMaps; // Lista de mapas de assentos associados ao ônibus




    
    //GETTERS
    public int getBus_id() {
        return bus_id;
    }

    public LineModel getLine_id() {
        return line_id;
    }

    public String getPlate() {
        return plate;
    }

    public int getMaxCrowd() {
        return maxCrowd;
    }
    public List<SeatModel> getSeats() {
        return seats;
    }

    public List<SeatMapModel> getSeatMaps() {
        return seatMaps;
    }



    //SETTERS
    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

     public void setLine_id(LineModel line_id) {
        this.line_id = line_id;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setMaxCrowd(int maxCrowd) {
        this.maxCrowd = maxCrowd;
    }
    public void setSeats(List<SeatModel> seats) {
        this.seats = seats;
    }

    public void setSeatMaps(List<SeatMapModel> seatMaps) {
        this.seatMaps = seatMaps;
    }


  
}
