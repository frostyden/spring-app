package com.example.springbootapp.controllers;

import com.example.springbootapp.domain.Trip;
import com.example.springbootapp.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TripController {

    @Autowired
    TripRepository tripRepository;

    public TripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Nullable
    @GetMapping(value = "/trips")
    public Iterable<Trip> getAllTrips() {

        return tripRepository.findAll();
    }

    @Nullable
    @GetMapping(value = "/trips/{id}")
    public Optional<Trip> getTrip(@PathVariable Integer id) {

        return tripRepository.findById(id);
    }

    @PostMapping(value = "/trips")
    public void addTrip(@RequestBody Trip trip) {

        tripRepository.save(trip);
    }
    // Edit below function
    @PutMapping(value = "/trips/{id}")
    public void updateTrip(@RequestBody Trip trip, @PathVariable Integer id) {

        tripRepository.save(trip);
    }

    @DeleteMapping(value = "/trips/{id}")
    public void deleteTrip(@PathVariable Integer id) {

        tripRepository.deleteById(id);
    }
}
