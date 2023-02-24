package com.freestack.spring.feature1.models;

public class Patient {

    public Integer id;
    public String firstname;
    public String lastname;


    public Patient(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
