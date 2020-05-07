package com.ronde.Ronde.controller;

import com.ronde.Ronde.model.Personne;
import com.ronde.Ronde.service.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personnes")
public class PersonneController {

    @Autowired
    PersonneRepository personneRepository;

    @GetMapping("/")
    Iterable<Personne> GetAgent() {
        return  personneRepository.findAll();
    }

    @GetMapping("/{idPersonne}")
    Optional<Personne> GetAgent(@PathVariable Long idPersonne) {
        return  personneRepository.findById(Math.toIntExact(idPersonne));
    }

    @GetMapping("/search")
    List<Personne> findByQueryEmail(@RequestParam(value ="email" , required = false) String email,
                                    @RequestParam(value ="role" , required = false) String role) {
        if(email != null)
            return personneRepository.findByEmail(email);
        else
            return personneRepository.findByRole(role);
    }


    @PostMapping("/")
    Personne AddAgent(@RequestBody Personne personne) {
        return personneRepository.save(personne);
    }

    @PutMapping("/")
    Personne UpdateAgent(@RequestBody Personne personne){
        return personneRepository.save(personne);
    }

    @DeleteMapping("/{idPersonne}")
    void DeleteAgent(@PathVariable Long idPersonne){
        personneRepository.deleteById(Math.toIntExact(idPersonne));
    }
}
