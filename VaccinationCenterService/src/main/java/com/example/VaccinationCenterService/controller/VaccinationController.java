package com.example.VaccinationCenterService.controller;


import com.example.VaccinationCenterService.entity.Citizen;
import com.example.VaccinationCenterService.entity.RequestResponse;
import com.example.VaccinationCenterService.entity.VaccinationCenter;
import com.example.VaccinationCenterService.repository.VaccinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/vaccination")
public class VaccinationController {

    @Autowired
    private VaccinationRepository repo;

    @Autowired
    RestTemplate restTemplate;


    @PostMapping("/add")
    public ResponseEntity<VaccinationCenter> addCitizen(@RequestBody VaccinationCenter vaccinationCenter){

        return new ResponseEntity<>(repo.save(vaccinationCenter), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<RequestResponse> getAllData(@PathVariable Integer id){

        VaccinationCenter vaccinationCenter = repo.findById(id).get();
        RequestResponse requestResponse = new RequestResponse();
        requestResponse.setVaccinationCenter(vaccinationCenter);

        List<Citizen> citizens = restTemplate.getForObject("http://localhost:8081/citizen/vaccination/"+id, List.class);
        requestResponse.setCitizens(citizens);
        return new ResponseEntity<>(requestResponse, HttpStatus.OK);
    }
}
