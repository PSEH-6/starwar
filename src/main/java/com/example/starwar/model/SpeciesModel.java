package com.example.starwar.model;

public class SpeciesModel extends CommonModel {

   private SpeciesModelDetails[] speciesModelDetails;

    public SpeciesModelDetails[] getSpeciesModelDetails() {
        return speciesModelDetails;
    }

    public void setSpeciesModelDetails(SpeciesModelDetails[] speciesModelDetails) {
        this.speciesModelDetails = speciesModelDetails;
    }
}
