package com.example.starwar.model;

public class StarShipsModel extends CommonModel  {

  private StarShipsModelDetails[] starShipsModelDetails;

    public StarShipsModelDetails[] getStarShipsModelDetails() {
        return starShipsModelDetails;
    }

    public void setStarShipsModelDetails(StarShipsModelDetails[] starShipsModelDetails) {
        this.starShipsModelDetails = starShipsModelDetails;
    }
}
