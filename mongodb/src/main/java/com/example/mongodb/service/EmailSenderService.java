package com.example.mongodb.service;

import jakarta.mail.internet.MimeMessage;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.net.MalformedURLException;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

//    public void sendEmail(String toEmail, String subject, String body) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("grp1oop@gmail.com");
//        message.setTo(toEmail);
//        message.setText(body);
//        message.setSubject(subject);
//        mailSender.send(message);
//        System.out.println("Mail Sent successfully...");
//    }
    public int sendEmail(String toEmail, String subject, String body) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
        try{
            mimeMessageHelper = new MimeMessageHelper(mimeMessage,"utf-8");
            mimeMessageHelper.setFrom("grp1oop@gmail.com");
            mimeMessageHelper.setTo(toEmail);
            mimeMessageHelper.setText(body,true);
            mimeMessageHelper.setSubject(subject);
            mailSender.send(mimeMessage);
            return 1;
        } catch (Exception e){
            System.out.println("ERROR");
            return 0;
        }
    }

    public int sendEmailWithAttachment(String toEmail, String subject, String body, String pathToAttachment) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
        try {
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom("grp1oop@gmail.com");
            mimeMessageHelper.setTo(toEmail);
            mimeMessageHelper.setText(body, true);
            mimeMessageHelper.setSubject(subject);

            FileSystemResource file = new FileSystemResource(new File(pathToAttachment));
            // file.getFilename() can be renamed to whichever name that you want to
            mimeMessageHelper.addAttachment(file.getFilename(), file);

            mailSender.send(mimeMessage);
            System.out.println("MAIL SENT");
            return 1;
        } catch (MessagingException e) {
            System.out.println("MessagingException Error");
            return 0;
        }
        // URL can only be used if image is in cloud or on web!!
//        } catch (MalformedURLException e){
//            System.out.println("MalformedURLException Error");
//            return 0;
//        }
    }
}

