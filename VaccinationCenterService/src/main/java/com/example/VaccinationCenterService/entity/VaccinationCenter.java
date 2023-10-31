package com.example.VaccinationCenterService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class VaccinationCenter {

    @Id
    private int id;

    private String centerName;

    private String centerAddress;

}
