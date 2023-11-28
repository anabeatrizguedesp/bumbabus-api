package com.api.bumbabusapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="assento")
public class SeatModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seat_id;
    
    @Column(nullable = false)
    private boolean state;

    @Column(nullable = false,  length = 50 )
    private String name;
}
