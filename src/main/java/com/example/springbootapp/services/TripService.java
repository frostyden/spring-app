package com.example.springbootapp.services;

import com.example.springbootapp.domain.Trip;
import com.example.springbootapp.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public List<Trip> getAllTrips() {
        List<Trip> trips = new ArrayList<>();
        tripRepository.findAll().forEach(trips::add);
        return trips;
    }

    public void addTrip(Trip trip) {

    }

    public void updateTrip(Trip trip, Integer id) {

    }

    public void deleteTrip(Integer id) {

    }

    public Trip getTrip(Integer id) {
        return null;
    }
}
