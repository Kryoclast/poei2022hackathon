package com.freestack.spring.feature1.models;

public class Medecin {
    public Integer id;
    public String firstname;
    public String lastname;


    public Medecin(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}

