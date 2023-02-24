package com.freestack.spring.feature1.models;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public LocalDateTime rdvDate;
    public Long patient_id;
    public Long medecin_id;

    public Reservation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Reservation(LocalDateTime rdvDate, Long patient_id, Long medecin_id) {
        this.rdvDate = rdvDate;
        this.patient_id = patient_id;
        this.medecin_id = medecin_id;
    }


    public LocalDateTime getRdvDate() {
        return rdvDate;
    }

    public void setRdvDate(LocalDateTime rdvDate) {
        this.rdvDate = rdvDate;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Long getMedecin_id() {
        return medecin_id;
    }

    public void setMedecin_id(Long medecin_id) {
        this.medecin_id = medecin_id;
    }
}

