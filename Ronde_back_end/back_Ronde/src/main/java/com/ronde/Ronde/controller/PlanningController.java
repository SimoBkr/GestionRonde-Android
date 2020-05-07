package com.ronde.Ronde.controller;

import com.ronde.Ronde.model.Personne;
import com.ronde.Ronde.model.Planning;
import com.ronde.Ronde.service.PlanningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plannings")
public class PlanningController {

    @Autowired
    PlanningRepository planningRepository;

    @GetMapping("/")
    Iterable<Planning> GetPlanning() {
        return  planningRepository.findAll();
    }

    @GetMapping("/{idPlanning}")
    Optional<Planning> GetPlanning(@PathVariable int idPlanning) {
        return  planningRepository.findById(idPlanning);
    }

    @PostMapping("/")
    Planning AddPlanning(@RequestBody Planning planning) {
        return planningRepository.save(planning);
    }

    @PutMapping("/")
    Planning UpdatePlanning(@RequestBody Planning planning){
        return planningRepository.save(planning);
    }

    @DeleteMapping("/{idPlanning}")
    void DeletePlanning(@PathVariable int idPlanning){
        planningRepository.deleteById(idPlanning);
    }

}
