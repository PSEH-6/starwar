package com.example.starwar.model;

public class FilmsModel extends CommonModel {


   private FilmsModelDetails[] results;

    public FilmsModelDetails[] getResults() {
        return results;
    }

    public void setResults(FilmsModelDetails[] results) {
        this.results = results;
    }
}
