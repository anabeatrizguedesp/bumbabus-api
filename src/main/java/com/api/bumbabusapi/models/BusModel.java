package com.api.bumbabusapi.models;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Bus")
public class BusModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bus_id;
    
   @ManyToOne
    @JoinColumn(name = "line_id", nullable = false)
    private LineModel linha;

    @Column (nullable = false, length = 7)
    private String plate;

    @Column (nullable = false)
    private int maxCrowd;

    @Column(nullable = false)
    private int qtdSeat;





    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }


    public LineModel getLinha() {
        return linha;
    }

    public void setLinha(LineModel linha) {
        this.linha = linha;
    }


    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }



    public int getMaxCrowd() {
        return maxCrowd;
    }

    public void setMaxCrowd(int maxCrowd) {
        this.maxCrowd = maxCrowd;
    }



    public int getQtdSeat() {
        return qtdSeat;
    }

    public void setQtdSeat(int qtdSeat) {
        this.qtdSeat = qtdSeat;
    }
}