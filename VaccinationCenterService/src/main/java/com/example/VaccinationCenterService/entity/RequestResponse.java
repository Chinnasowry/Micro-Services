package com.example.VaccinationCenterService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestResponse {

    private VaccinationCenter vaccinationCenter;
    private List<Citizen> citizens;
}
