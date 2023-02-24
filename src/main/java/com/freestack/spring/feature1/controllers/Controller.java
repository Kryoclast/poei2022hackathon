package com.freestack.spring.feature1.controllers;

import com.freestack.spring.feature1.models.Medecin;
import com.freestack.spring.feature1.models.Patient;
import com.freestack.spring.feature1.models.Reservation;
import com.freestack.spring.feature1.repo.MedecinRepository;
import com.freestack.spring.feature1.repo.PatientRepository;
import com.freestack.spring.feature1.repo.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private MedecinRepository medecinRepository;
    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/patient")
    public String addPatient(@RequestBody Patient patient) {
        patientRepository.save(patient);
        return (" Patient sauvegardé ");
    }

    @GetMapping("/patient/{id}")
    public Patient getPatient(@PathVariable Long id) {
        Patient patient = patientRepository.findById(id).orElse(null);
        return patient;
    }

    @PostMapping("/medecin")
    public String addMedecin(@RequestBody Medecin medecin) {
        medecinRepository.save(medecin);
        return (" Medecin savegarde terminée ");
    }

    @GetMapping("/medecin/{id}")
    public  Medecin getMedecin(@PathVariable Long id) {
        Medecin medecin = medecinRepository.findById(id).orElse(null);
        return  medecin;
    }

    @PostMapping("/reservation")
    public String addReservation(@RequestBody Reservation reservation) {
        Medecin medecin = medecinRepository.findById(reservation.getId()).orElse(null);
        LocalDateTime date = reservation.getRdvDate();
        if(date.getHour()>= 9 && date.getHour()<17){
            for(Reservation r : medecin.getReservations()){
                if(r.getRdvDate().getHour()==date.getHour()){
                    return "Créneau occupé";
                }
            }
            reservationRepository.save(reservation);
        }


        return ("Reservated");
    }

    @GetMapping("/reservation/{id}")
    public  Reservation getReservation(@PathVariable Long id) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        return  reservation;
    }

}