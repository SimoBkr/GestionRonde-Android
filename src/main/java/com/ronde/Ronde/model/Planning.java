package com.ronde.Ronde.model;

import javax.persistence.*;

@Entity
public class Planning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String NamePlanning;

    private String DatePlanning;

    private String heure;

    @ManyToOne()
    private Personne agent;

    public Planning() {
    }

    public Planning(int id, String namePlanning, String datePlanning, String heure, Personne agent) {
        this.Id = id;
        NamePlanning = namePlanning;
        DatePlanning = datePlanning;
        this.heure = heure;
        this.agent = agent;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNamePlanning() {
        return NamePlanning;
    }

    public void setNamePlanning(String namePlanning) {
        NamePlanning = namePlanning;
    }

    public String getDatePlanning() {
        return DatePlanning;
    }

    public void setDatePlanning(String datePlanning) {
        DatePlanning = datePlanning;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Personne getAgent() {
        return agent;
    }
    public void setAgent(Personne agent) {
        this.agent = agent;
    }
}
