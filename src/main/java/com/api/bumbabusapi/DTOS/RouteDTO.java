package com.api.bumbabusapi.DTOS;


import java.util.List;

import com.api.bumbabusapi.models.LineModel;



import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RouteDTO {

    @Id @NotNull 
    private int routes_id;

    @NotNull
    private int route_stopqtd ;

    @NotBlank @Size(max = 2000)
    private String route_stops;

    @NotBlank  @Size(max = 50)
    private String name;

    @NotNull
    @OneToMany(mappedBy = "route")
    private List<LineModel> linhas;


    
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LineModel> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<LineModel> linhas) {
        this.linhas = linhas;
    }

    
    

}
