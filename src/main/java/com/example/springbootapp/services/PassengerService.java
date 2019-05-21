package com.example.springbootapp.services;

import com.example.springbootapp.domain.Passenger;
import com.example.springbootapp.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    private List<Passenger> passengers = new ArrayList<>(Arrays.asList(
            new Passenger(1, "Name 1", "Surname 1", "+123456789"),
            new Passenger(2, "Name 2", "Surname 2", "+265422389"),
            new Passenger(3, "Name 3", "Surname 3", "+328536789")
        ));

    public List<Passenger> getAllPassengers() {

        return passengers;
    }

    public Passenger getPassenger(Integer id) {

        return passengers.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addPassenger(Passenger passenger) {

        passengers.add(passenger);
    }

    public void updatePassenger(Passenger passenger, Integer id) {

    }

    public void deletePassenger(Integer id) {

    }
}
