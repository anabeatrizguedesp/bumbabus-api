package com.api.bumbabusapi.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Rotas")
public class RouteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int routes_id;

    @Column(nullable = false)
    private int route_stopqtd ;

    @Column(nullable = false,  length = 2000 )
    private String route_stops;

    @OneToOne(mappedBy = "route") // Relação OneToOne entre RouteModel e LineModel
    private LineModel lines; // Uma rota tem uma linha


    
    public int getRoutes_id() {
        return routes_id;
    }

    public void setRoutes_id(int routes_id) {
        this.routes_id = routes_id;
    }

    public int getRoute_stopqtd() {
        return route_stopqtd;
    }

    public void setRoute_stopqtd(int route_stopqtd) {
        this.route_stopqtd = route_stopqtd;
    }

    public String getRoute_stops() {
        return route_stops;
    }

    public void setRoute_stops(String route_stops) {
        this.route_stops = route_stops;
    }

  



}