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
@Table(name="Linhas")
public class LineModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int line_id;

    @Column(nullable = false)
    private int line_number;

    @Column(nullable = false)
    private int line_overc;

    @ManyToOne
    @JoinColumn(name = "route_id", nullable = false)
    private RouteModel route;

    @OneToMany(mappedBy = "linha")
    private List<BusModel> busList;





    public int getLine_id() {
        return line_id;
    }

    public void setLine_id(int line_id) {
        this.line_id = line_id;
    }

    public int getLine_number() {
        return line_number;
    }

    public void setLine_number(int line_number) {
        this.line_number = line_number;
    }

    public int getLine_overc() {
        return line_overc;
    }




    public void setLine_overc(int line_overc) {
        this.line_overc = line_overc;
    }

    public RouteModel getRoute() {
        return route;
    }

    public void setRoute(RouteModel route) {
        this.route = route;
    }
    
}