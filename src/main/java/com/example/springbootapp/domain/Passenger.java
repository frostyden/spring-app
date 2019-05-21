package com.example.springbootapp.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToMany(fetch = FetchType.EAGER)
    List<Trip> trips;

    private String passengerName;
    private String getPassengerSurname;
    private String phoneNumber;

    public Passenger() { }

    public Passenger(Integer id, String passengerName, String getPassengerSurname, String phoneNumber) {
        this.id = id;
        this.passengerName = passengerName;
        this.getPassengerSurname = getPassengerSurname;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getGetPassengerSurname() {
        return getPassengerSurname;
    }

    public void setGetPassengerSurname(String getPassengerSurname) {
        this.getPassengerSurname = getPassengerSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
