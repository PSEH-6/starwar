package com.example.starwar.controller;

import com.example.starwar.service.OrchestrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarWarDetailsController {

    @Autowired
    private OrchestrationService orchestrationService;

    @RequestMapping(value = "/getDetails" )
    public void getStarWarDetails(@RequestParam(name="name", required=true) String name,
                                  @RequestParam(name="type", required=true) String type){

        orchestrationService.getResultByTypeAndName(name,type);

    }

}
