package com.api.bumbabusapi.DTOS;



import com.api.bumbabusapi.models.LineModel;


import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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

    @OneToOne(mappedBy = "route") // Relação OneToOne entre RouteDTO e LineModel
    private LineModel lines; // Uma rota tem uma linha

    //GETTERS
    public int getRoutes_id() {
        return routes_id;
    }

    public int getRoute_stopqtd() {
        return route_stopqtd;
    }

    public String getRoute_stops() {
        return route_stops;
    }

    public LineModel getLinhas() {
        return lines;
    }

    //SETTERS
    public void setRoutes_id(int routes_id) {
        this.routes_id = routes_id;
    }

    public void setRoute_stopqtd(int route_stopqtd) {
        this.route_stopqtd = route_stopqtd;
    }


    public void setRoute_stops(String route_stops) {
        this.route_stops = route_stops;
    }


    public void setLinhas(LineModel lines) {
        this.lines = lines;
    }

    
    

}
