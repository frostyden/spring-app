package com.example.springbootapp.services;

import com.example.springbootapp.domain.Message;
import com.example.springbootapp.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    private List<Message> messages = new ArrayList<>(Arrays.asList(
            new Message(1, "Name 1", "Surname 1"),
            new Message(2, "Name 2", "Surname 2"),
            new Message(3, "Name 3", "Surname 3")
    ));

    public List<Message> getAllMessages() {
        List<Message> messages = new ArrayList<>();
        messageRepository.findAll().forEach(messages::add);
        return messages;
    }

}
