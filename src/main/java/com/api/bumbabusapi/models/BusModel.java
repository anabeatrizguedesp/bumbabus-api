package com.api.bumbabusapi.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Bus")
public class BusModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bus_id; // Mudança para Long para permitir maior espaço para IDs
    
    @ManyToOne
    @JoinColumn(name = "line_id", nullable = false)
    private LineModel linha;

    @Column(nullable = false, length = 7)
    private String plate;

    @Column(nullable = false)
    private int maxCrowd;

    @OneToMany(mappedBy = "bus_id") // Correção: mappedBy deve ser o atributo na entidade SeatModel que referencia o BusModel
    private List<SeatModel> seats; // Correção: Renomear para "seats" para representar a lista de assentos associados ao ônibus

    @OneToMany(mappedBy = "bus_id") // Correção: mappedBy deve ser o atributo na entidade SeatMapModel que referencia o BusModel
    private List<SeatMapModel> seatMaps; // Lista de mapas de assentos associados ao ônibus




    //GETTERS
    public Long getBus_id() {
        return bus_id;
    }

    public LineModel getLinha() {
        return linha;
    }

    public String getPlate() {
        return plate;
    }

    public int getMaxCrowd() {
        return maxCrowd;
    } 

    //SETTERS
    public void setBus_id(Long bus_id) {
        this.bus_id = bus_id;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setMaxCrowd(int maxCrowd) {
        this.maxCrowd = maxCrowd;
    }



}