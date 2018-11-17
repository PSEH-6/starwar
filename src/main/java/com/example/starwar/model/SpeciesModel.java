package com.example.starwar.model;

public class SpeciesModel extends CommonModel {

   private SpeciesModelDetails[] results;

    public SpeciesModelDetails[] getResults() {
        return results;
    }

    public void setResults(SpeciesModelDetails[] results) {
        this.results = results;
    }
}
