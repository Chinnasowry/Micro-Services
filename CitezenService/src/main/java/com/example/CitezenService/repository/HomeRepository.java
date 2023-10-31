package com.example.CitezenService.repository;

import com.example.CitezenService.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Citizen, Integer> {
}
