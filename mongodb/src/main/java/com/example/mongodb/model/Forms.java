package com.example.mongodb.model;

import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "ISOForm")
@NoArgsConstructor

public class Forms {

    private int formCode;
    private Date date;
    private String formName;
    private boolean formCompleted;
    private boolean formApproved;
    private Long revisionNum;
    
}
