package com.example.starwar.model;

public class StarShipsModel extends CommonModel  {

  private StarShipsModelDetails[] results;

    public StarShipsModelDetails[] getResults() {
        return results;
    }

    public void setResults(StarShipsModelDetails[] results) {
        this.results = results;
    }
}
