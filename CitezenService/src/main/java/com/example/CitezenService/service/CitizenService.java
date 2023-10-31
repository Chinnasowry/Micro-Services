package com.example.CitezenService.service;

import com.example.CitezenService.entity.Citizen;
import com.example.CitezenService.repository.CitizenRepo;
import com.example.CitezenService.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenService {

    @Autowired
    HomeRepository repository;

    public Citizen saveInfo(Citizen citizen){
        Citizen save = repository.save(citizen);
        return save;
    }
}
