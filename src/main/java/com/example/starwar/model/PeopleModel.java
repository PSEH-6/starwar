package com.example.starwar.model;

public class PeopleModel extends CommonModel {

  private PeopleModelDetails[] results;

    public PeopleModelDetails[] getResults() {
        return results;
    }

    public void setResults(PeopleModelDetails[] results) {
        this.results = results;
    }
}
