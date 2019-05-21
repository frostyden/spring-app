package com.example.springbootapp.controllers;

import com.example.springbootapp.domain.Passenger;
import com.example.springbootapp.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping(value = "/passengers")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping(value = "/passengers/{id}")
    public Passenger getPassenger(@PathVariable Integer id) {
        return passengerService.getPassenger(id);
    }

    @PostMapping(value = "/passengers")
    public void addPassenger(@RequestBody Passenger passenger) {
        passengerService.addPassenger(passenger);
    }
    // Edit below functions
    @PutMapping(value = "/passengers/{id}")
    public void updatePassenger(@RequestBody Passenger passenger, @PathVariable Integer id) {
        passengerService.updatePassenger(passenger, id);
    }

    @DeleteMapping(value = "/passengers/{id}")
    public void deletePassenger(@PathVariable Integer id) {
        passengerService.deletePassenger(id);
    }


}
