package com.jobsae.jobsae6;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Job {
    private static final long serialVersionUID=6;
    @Id
    @GeneratedValue
    private  int id;


    private String service;


    private boolean etat;

    public Job() {
    }

    public Job(String service, boolean etat) {
        this.service = service;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
