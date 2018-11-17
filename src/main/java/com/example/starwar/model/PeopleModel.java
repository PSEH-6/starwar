package com.example.starwar.model;

public class PeopleModel extends CommonModel {

  private PeopleModelDetails[] peopleModelDetails;

    public PeopleModelDetails[] getPeopleModelDetails() {
        return peopleModelDetails;
    }

    public void setPeopleModelDetails(PeopleModelDetails[] peopleModelDetails) {
        this.peopleModelDetails = peopleModelDetails;
    }
}
