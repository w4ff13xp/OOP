package com.example.mongodb.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.resource.Email;
import com.example.mongodb.resource.EmailMessage;
import com.example.mongodb.service.EmailSenderService;

import jakarta.mail.MessagingException;

@RestController
public class EmailController {

    // inject service from package service -> impl -> EmailSenderServiceImpl.java
    private final EmailSenderService emailSenderService;

    // creates constructor map EmailSenderServiceImpl sendEmail method as the parameter to implement sendEmail
    public EmailController(EmailSenderService emailSenderService){
        this.emailSenderService = emailSenderService;
    }

    // format: {
                // "to": "xx@gmail.com",
                // "subject" : "This is a test message",
                // "message" : "wheeeee"
                // }
    @PostMapping("/send-email")
    // EmailMessage defined in resource package -> EmailMessage.java
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage){
        this.emailSenderService.sendEmail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage());
        return ResponseEntity.ok("Success");

    }

    @PostMapping("/send-simpleemail")
    // EmailMessage defined in resource package -> EmailMessage.java
    public String simpleEmailTest(@RequestBody EmailMessage email) throws IOException, MessagingException {
        Email mail = new Email();
        mail.setMailTo(email.getTo());//replace with your desired email
        mail.setFrom("huirupalee@gmail.com");
        mail.setSubject(email.getSubject());
        this.emailSenderService.sendSimpleEmail(mail,email.getMessage());
        return "SUCCESSED";
    }
    
}
