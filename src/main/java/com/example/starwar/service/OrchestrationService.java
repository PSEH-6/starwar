package com.example.starwar.service;

import com.example.starwar.model.*;
import com.example.starwar.restTemplate.StarWarRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrchestrationService {

    @Autowired
    private StarWarRestTemplate starWarRestTemplate;

    private static  final String  PEOPLE_TYPE="people";
    private static  final String  FILMS_TYPE="films";
    private static  final String  PLANET_TYPE="planets";
    private static  final String  SPECIES_TYPE="species";
    private static  final String  STARSHIPS_TYPE="starships";
    private static  final String  VEHICLES_TYPE="vehicles";

    public ResultModel getResultByTypeAndName(String name,String type){

        if(type.equals(PEOPLE_TYPE)){
          return   refinePeoplesResult(starWarRestTemplate.getPeopleDetails(),name);
        }
        if(type.equals(FILMS_TYPE)){
            return  refineFilmsResult(starWarRestTemplate.getFilmsDetails(),name) ;
        }
        if(type.equals(PLANET_TYPE)){
            return  refinePlanetsResult(starWarRestTemplate.getPlanetDetails(),name);
        }
        if(type.equals(SPECIES_TYPE)){
            return  refineSpeciesResult(starWarRestTemplate.getSpeciesDetails(),name);
        }
        if(type.equals(STARSHIPS_TYPE)){
            return  refineStarShipsResult(starWarRestTemplate.getStarShipDetails(),name);
        }
        if(type.equals(VEHICLES_TYPE)){
            return  refineVehiclesResult(starWarRestTemplate.getVehiclesDetails(),name);
        }

        return null;
    }

    private ResultModel refineVehiclesResult(VehiclesModel vehiclesDetails,String name) {

        for(VehiclesModelDetails vehiclesModelDetails:vehiclesDetails.getVehiclesModelDetails()){
            if(vehiclesModelDetails.getName().equals(name)){
                return vehiclesModelDetails;
            }
        }
        return null;
    }

    private ResultModel refineStarShipsResult(StarShipsModel starShipDetails,String name) {
        for(StarShipsModelDetails starShipsModelDetails:starShipDetails.getStarShipsModelDetails()){
            if(starShipsModelDetails.getName().equals(name)){
                return starShipsModelDetails;
            }
        }
        return null;
    }

    private ResultModel refineSpeciesResult(SpeciesModel speciesDetails,String name) {
        for(SpeciesModelDetails speciesModelDetails:speciesDetails.getSpeciesModelDetails()){
            if(speciesModelDetails.getName().equals(name)){
                return speciesModelDetails;
            }
        }
        return null;
    }

    private ResultModel refinePlanetsResult(PlanetModel planetDetails,String name) {

        for(PlanetModelDetails planetModelDetails:planetDetails.getPlanetModelDetails()){
            if(planetModelDetails.getName().equals(name)){
                return planetModelDetails;
            }
        }
        return null;
    }

    private ResultModel refineFilmsResult(FilmsModel filmsDetails,String name) {
        for(FilmsModelDetails filmsModelDetails:filmsDetails.getFilmsModelDetails()){
            if(filmsModelDetails.getTitle().equals(name)){
                return filmsModelDetails;
            }
        }
        return null;
    }

    private ResultModel refinePeoplesResult(PeopleModel peopleDetails,String name) {
        for(PeopleModelDetails peopleModelDetails:peopleDetails.getPeopleModelDetails()){
            if(peopleModelDetails.getName().equals(name)){
                return peopleModelDetails;
            }
        }
        return null;
    }

}
