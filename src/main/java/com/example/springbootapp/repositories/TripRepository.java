package com.example.springbootapp.repositories;

import com.example.springbootapp.domain.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripRepository extends CrudRepository<Trip, Integer> {

}
