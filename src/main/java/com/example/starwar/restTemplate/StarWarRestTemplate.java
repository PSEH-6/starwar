package com.example.starwar.restTemplate;

import com.example.starwar.model.*;
import org.springframework.http.HttpEntity;
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
       return restTemplate.getForObject("https://swapi.co/api/people/",PeopleModel.class);
    }

    public FilmsModel getFilmsDetails() {
        return restTemplate.getForObject("https://swapi.co/api/films/",FilmsModel.class);
    }

    public PlanetModel getPlanetDetails() {
        return restTemplate.getForObject("https://swapi.co/api/planets/",PlanetModel.class);
    }

    public SpeciesModel getSpeciesDetails() {
        return restTemplate.getForObject("https://swapi.co/api/species/",SpeciesModel.class);
    }

    public StarShipsModel getStarShipDetails() {
        return restTemplate.getForObject("https://swapi.co/api/startships/",StarShipsModel.class);
    }

    public VehiclesModel getVehiclesDetails() {
        return restTemplate.getForObject("https://swapi.co/api/vehicles/",VehiclesModel.class);
    }
}
