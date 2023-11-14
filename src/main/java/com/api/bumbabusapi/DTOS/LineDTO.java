package com.api.bumbabusapi.DTOS;

import java.util.List;

import com.api.bumbabusapi.models.BusModel;
import com.api.bumbabusapi.models.RouteModel;



import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LineDTO {
    
    @Id @NotNull @Size(max = 20)
    private int line_id;
    
    @NotNull  @Size(max = 3)
    private int line_number;

    @NotNull
    private int line_overc;
  
    @NotNull @ManyToOne
    @JoinColumn(name = "route_id", nullable = false)
    private RouteModel route;
    
    @NotNull
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

    public List<BusModel> getBusList() {
        return busList;
    }

    public void setBusList(List<BusModel> busList) {
        this.busList = busList;
    }
   



    

    
    
    

    
}