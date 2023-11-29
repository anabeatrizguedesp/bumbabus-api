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
@Table(name="assento")
public class SeatModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seat_id;
    
    @Column(nullable = false)
    private boolean seat_state;

    @Column(nullable = false)
    private int seat_num;

     @ManyToOne
    @JoinColumn(name = "bus_id")
    private BusModel bus; // Referência ao ônibus

    @ManyToOne
    @JoinColumn(name = "seatmap_id") // Correção: Melhor nome para refletir o relacionamento
    private SeatMapModel seatmap_id; // Referência ao mapa de assentos


    
}
