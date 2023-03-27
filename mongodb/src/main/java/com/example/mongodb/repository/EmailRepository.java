package com.example.mongodb.repository;

import com.example.mongodb.model.Email;

public interface EmailRepository {
    
    String sendSimpleMail(Email details);
    
    String sendMailWithAttachment(Email details);

}
