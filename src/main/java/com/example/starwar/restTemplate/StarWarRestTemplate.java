package com.example.starwar.restTemplate;

import com.example.starwar.model.*;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StarWarRestTemplate {

    private RestTemplate restTemplate;

    public StarWarRestTemplate() {
        restTemplate = new RestTemplate();
    }


    public PeopleModel getPeopleDetails() {
       return restTemplate.exchange("https://swapi.co/api/people/",HttpMethod.GET,null,PeopleModel.class).getBody();
    }

    public FilmsModel getFilmsDetails() {
        return restTemplate.exchange("https://swapi.co/api/films/",HttpMethod.GET,null,FilmsModel.class).getBody();
    }

    public PlanetModel getPlanetDetails() {
        return restTemplate.exchange("https://swapi.co/api/planets/",HttpMethod.GET,null,PlanetModel.class).getBody();
    }

    public SpeciesModel getSpeciesDetails() {
        return restTemplate.exchange("https://swapi.co/api/species/",HttpMethod.GET,null,SpeciesModel.class).getBody();
    }

    public StarShipsModel getStarShipDetails() {
        return restTemplate.exchange("https://swapi.co/api/startships/",HttpMethod.GET,null,StarShipsModel.class).getBody();
    }

    public VehiclesModel getVehiclesDetails() {
        return restTemplate.exchange("https://swapi.co/api/vehicles/",HttpMethod.GET,null,VehiclesModel.class).getBody();
    }
}
