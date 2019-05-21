package com.example.springbootapp.controllers;

import com.example.springbootapp.domain.Trip;
import com.example.springbootapp.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TripController {

    @Autowired
    private TripService tripService;

    @GetMapping(value = "/trips")
    public List<Trip> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GetMapping(value = "/trips/{id}")
    public Trip getTrip(@PathVariable Integer id) {

        return tripService.getTrip(id);
    }

    @PostMapping(value = "/trips")
    public void addTrip(@RequestBody Trip trip) {

        tripService.addTrip(trip);
    }
    // Edit below functions
    @PutMapping(value = "/trips/{id}")
    public void updateTrip(@RequestBody Trip trip, @PathVariable Integer id) {
        tripService.updateTrip(trip, id);
    }

    @DeleteMapping(value = "/trips/{id}")
    public void deleteTrip(@PathVariable Integer id) {
        tripService.deleteTrip(id);
    }
}
