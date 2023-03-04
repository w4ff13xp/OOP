package com.example.mongodb.service;

import java.io.IOException;

import com.example.mongodb.resource.Email;

import jakarta.mail.MessagingException;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String message);

    void sendSimpleEmail(Email mail, String message) throws MessagingException, IOException;
    
}
