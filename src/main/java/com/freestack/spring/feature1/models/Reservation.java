package com.freestack.spring.feature1.models;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {

    public Integer id;
    public LocalDateTime rdvDate;
    public Integer patient_id;
    public Integer medecin_id;


    public Reservation(LocalDateTime rdvDate, Integer patient_id, Integer medecin_id) {
        this.rdvDate = rdvDate;
        this.patient_id = patient_id;
        this.medecin_id = medecin_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getRdvDate() {
        return rdvDate;
    }

    public void setRdvDate(LocalDateTime rdvDate) {
        this.rdvDate = rdvDate;
    }

    public Integer getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Integer patient_id) {
        this.patient_id = patient_id;
    }

    public Integer getMedecin_id() {
        return medecin_id;
    }

    public void setMedecin_id(Integer medecin_id) {
        this.medecin_id = medecin_id;
    }
}

