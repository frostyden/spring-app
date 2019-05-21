package com.example.springbootapp.repositories;

import com.example.springbootapp.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {



}
