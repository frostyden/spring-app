package com.example.springbootapp.controllers;

import com.example.springbootapp.domain.Message;
import com.example.springbootapp.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/message")
    public List<Message> getAllMessages() {
        return Arrays.asList(
                new Message(1, "Text 1", "Tag 1"),
                new Message(2, "Text 2", "Tag 2"),
                new Message(3, "Text 3", "Tag 3")
        );
    }
}
