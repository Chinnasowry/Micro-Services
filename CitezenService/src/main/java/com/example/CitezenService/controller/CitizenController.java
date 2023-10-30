package com.example.CitezenService.controller;


import com.example.CitezenService.entity.Citizen;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("citizen")
public class CitizenController {

    @GetMapping("get")
    public ResponseEntity<Citizen> getCitizen(){
        return null;
    }
}
