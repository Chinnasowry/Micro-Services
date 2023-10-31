package com.example.CitezenService.repository;

import com.example.CitezenService.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CitizenRepo extends CrudRepository<Citizen, Integer> {
    Optional<List<Citizen>> findById(int id);

    public List<Citizen> findByVaccinationCenterId(int id);
}
