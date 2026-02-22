package com.learnSpringBoot.jobPortal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    serviceClass service;

    controller(serviceClass service){
        this.service = service;
    }


    @GetMapping("/allCompanies")
    public List<entityClass> getAllCompany(){
        return service.getAllCompany();
    }

}
