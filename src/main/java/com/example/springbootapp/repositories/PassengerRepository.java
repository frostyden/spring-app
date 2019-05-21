package com.example.springbootapp.repositories;

import com.example.springbootapp.domain.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

}
