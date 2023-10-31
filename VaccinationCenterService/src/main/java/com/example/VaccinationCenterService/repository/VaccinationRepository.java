package com.example.VaccinationCenterService.repository;

import com.example.VaccinationCenterService.entity.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VaccinationRepository extends JpaRepository<VaccinationCenter, Integer> {
}
