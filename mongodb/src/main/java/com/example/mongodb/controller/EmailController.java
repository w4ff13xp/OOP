package com.example.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.Email;
import com.example.mongodb.service.EmailService;

@RestController
public class EmailController {
    
    @Autowired private EmailService emailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Email details) {
        return emailService.sendSimpleMail(details);
    }
}
