package com.example.CitezenService.controller;


import com.example.CitezenService.entity.Citizen;
import com.example.CitezenService.repository.CitizenRepo;
import com.example.CitezenService.service.CitizenService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    CitizenRepo repo;

    @Autowired
    CitizenService service;

    @GetMapping("/get/{id}")
    public Optional<List<Citizen>> getCitizen(@PathVariable int id){
//        return new ResponseEntity<>(repo.findById(id.getId())., HttpStatus.OK);
        return repo.findById(id);
    }

    @GetMapping("/vaccination/{id}")
    public ResponseEntity<List<Citizen>> getById(@PathVariable int id){
        return new ResponseEntity<>(repo.findByVaccinationCenterId(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Citizen> saveData(@RequestBody Citizen citizen){
        Citizen citizen1 = service.saveInfo(citizen);
        return new ResponseEntity<>(citizen1, HttpStatus.OK);
    }
}
