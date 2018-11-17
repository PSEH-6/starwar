package com.example.starwar.restTemplate;

import com.example.starwar.model.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class StarWarRestTemplate {

    private RestTemplate restTemplate;

    public StarWarRestTemplate() {
        restTemplate = new RestTemplate();
    }


    public PeopleModel getPeopleDetails() {

       return restTemplate.exchange("https://swapi.co/api/people/",HttpMethod.GET,getEntity(),PeopleModel.class).getBody();
    }

    public FilmsModel getFilmsDetails() {
        return restTemplate.exchange("https://swapi.co/api/films/",HttpMethod.GET,getEntity(),FilmsModel.class).getBody();
    }

    public PlanetModel getPlanetDetails() {
        return restTemplate.exchange("https://swapi.co/api/planets/",HttpMethod.GET,getEntity(),PlanetModel.class).getBody();
    }

    public SpeciesModel getSpeciesDetails() {
        return restTemplate.exchange("https://swapi.co/api/species/",HttpMethod.GET,getEntity(),SpeciesModel.class).getBody();
    }

    public StarShipsModel getStarShipDetails() {
        return restTemplate.exchange("https://swapi.co/api/startships/",HttpMethod.GET,getEntity(),StarShipsModel.class).getBody();
    }

    public VehiclesModel getVehiclesDetails() {
        return restTemplate.exchange("https://swapi.co/api/vehicles/",HttpMethod.GET,getEntity(),VehiclesModel.class).getBody();
    }

    private HttpEntity<String> getEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        return entity;
    }
}
