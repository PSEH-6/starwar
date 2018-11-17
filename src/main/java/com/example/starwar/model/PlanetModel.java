package com.example.starwar.model;

public class PlanetModel extends CommonModel  {

   private PlanetModelDetails[] planetModelDetails;

    public PlanetModelDetails[] getPlanetModelDetails() {
        return planetModelDetails;
    }

    public void setPlanetModelDetails(PlanetModelDetails[] planetModelDetails) {
        this.planetModelDetails = planetModelDetails;
    }
}
