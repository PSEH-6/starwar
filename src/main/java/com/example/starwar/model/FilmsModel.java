package com.example.starwar.model;

public class FilmsModel extends CommonModel {


   private FilmsModelDetails[] filmsModelDetails;

    public FilmsModelDetails[] getFilmsModelDetails() {
        return filmsModelDetails;
    }

    public void setFilmsModelDetails(FilmsModelDetails[] filmsModelDetails) {
        this.filmsModelDetails = filmsModelDetails;
    }
}
