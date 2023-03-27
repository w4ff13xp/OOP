package com.example.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmailWithAttachment("kljh9818@gmail.com",
				"Quantum Form Not Completed",
				"Dear Customer, " + "<br>" +
						"<br>" + "This emailed is sent to notify you that you have an unfilled/completed form under your Quantum account." +
						"<br>" + "Please do complete the form within 3days of notice from when this email was sent." +
						"<br>" + "<br>" + "Best Regards," +
						"<br>" + "Quantum Approver",
				"/Users/leejunhui/Desktop/Y2S2/LEEJUNHUI RESUME.pdf");
	}
}
