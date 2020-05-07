package com.ronde.Ronde.service;

import com.ronde.Ronde.model.Personne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonneRepository extends CrudRepository<Personne,Integer> {

    List<Personne> findByEmail (String email);
    List<Personne> findByRole (String role);

}
