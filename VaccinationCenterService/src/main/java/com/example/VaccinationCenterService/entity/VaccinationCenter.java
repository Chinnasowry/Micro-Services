package com.example.VaccinationCenterService.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class VaccinationCenter {

    private int id;

    private String centerName;

    private String centerAddress;

}
