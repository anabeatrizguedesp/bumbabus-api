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
@Table(name="Mapa_Assentos")
public class SeatMapModel implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seatmap_id;

    @ManyToOne
    @JoinColumn(name = "bus_id") // Referência direta para o objeto BusModel
    private BusModel bus; // Mudança de nome para refletir melhor a associação com BusModel

    @Column(nullable = false)
    private int seat_qtd;

    @OneToMany(mappedBy = "seatMap")
    private List<SeatModel> seats; // Lista de assentos associados ao mapa de assentos

    
    //GETTERS
    public int getSeatmap_id() {
        return seatmap_id;
    }

    public BusModel getBus() {
        return bus;
    }

    public int getSeat_qtd() {
        return seat_qtd;
    }

    public List<SeatModel> getSeats() {
        return seats;
    }

    //SETTERS
    public void setSeatmap_id(int seatmap_id) {
        this.seatmap_id = seatmap_id;
    }

    public void setBus(BusModel bus) {
        this.bus = bus;
    }

    public void setSeat_qtd(int seat_qtd) {
        this.seat_qtd = seat_qtd;
    }

    public void setSeats(List<SeatModel> seats) {
        this.seats = seats;
    }

}
