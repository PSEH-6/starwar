package com.example.starwar;


import com.example.starwar.model.PeopleModel;
import com.example.starwar.model.PeopleModelDetails;
import com.example.starwar.model.ResultModel;
import com.example.starwar.restTemplate.StarWarRestTemplate;
import com.example.starwar.service.OrchestrationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;


import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OrchestrationServiceTest {

    @Mock
    StarWarRestTemplate starWarRestTemplate;

    @Test
    public void testPeopleDetails(){
        Mockito.when(starWarRestTemplate.getPeopleDetails()).thenReturn(buildSampleResponse());

        OrchestrationService orchestrationService= new OrchestrationService();
        ReflectionTestUtils.setField(orchestrationService, "starWarRestTemplate", starWarRestTemplate);
        ResultModel resultModel=orchestrationService.getResultByTypeAndName("Luke Skywalker","people");
        PeopleModelDetails peopleModel=(PeopleModelDetails)resultModel;
        assertTrue(peopleModel.getName().equalsIgnoreCase("Luke Skywalker"));
    }

    private PeopleModel buildSampleResponse() {

        PeopleModel peopleModel = new PeopleModel();
        PeopleModelDetails[] peopleModelDetailsList = new PeopleModelDetails[1];
        PeopleModelDetails peopleModelDetails1= new PeopleModelDetails();
        peopleModelDetails1.setName("Luke Skywalker");
        peopleModelDetailsList[0]=peopleModelDetails1;
        peopleModel.setPeopleModelDetails(peopleModelDetailsList);
        return peopleModel;
    }
}
