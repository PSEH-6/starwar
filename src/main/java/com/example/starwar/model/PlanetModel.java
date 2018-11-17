package com.example.starwar.model;

public class PlanetModel extends CommonModel  {

   private PlanetModelDetails[] results;

    public PlanetModelDetails[] getResults() {
        return results;
    }

    public void setResults(PlanetModelDetails[] results) {
        this.results = results;
    }
}
