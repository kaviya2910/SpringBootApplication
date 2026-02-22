package com.learnSpringBoot.jobPortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceClass {
    repositoryClass repo;

    @Autowired
    serviceClass(repositoryClass repo){
        this.repo = repo;
    }

    public List<entityClass> getAllCompany(){
        System.out.println("getting company details");
        return this.repo.findAll();
    }


}
