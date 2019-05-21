package com.example.springbootapp.controllers;

import com.example.springbootapp.domain.Passenger;
import com.example.springbootapp.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PassengerController {

    @Autowired
    PassengerRepository passengerRepository;

    public PassengerController(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Nullable
    @GetMapping(value = "/passengers")
    public Iterable<Passenger> getAllPassengers() {

        return passengerRepository.findAll();
    }

    @Nullable
    @GetMapping(value = "/passengers/{id}")
    public Optional<Passenger> getPassenger(@PathVariable Integer id) {

        return passengerRepository.findById(id);
    }

    @PostMapping(value = "/passengers")
    public void addPassenger(@RequestBody Passenger passenger) {

        passengerRepository.save(passenger);
    }

    // Edit below function for updating passenger info
    // findByIdAndObject() ?
    @PutMapping(value = "/passengers/{id}")
    public void updatePassenger(@RequestBody Passenger passenger, @PathVariable Integer id) {

        passengerRepository.save(passenger);
    }

    @DeleteMapping(value = "/passengers/{id}")
    public void deletePassenger(@PathVariable Integer id) {

        passengerRepository.deleteById(id);
    }


}
