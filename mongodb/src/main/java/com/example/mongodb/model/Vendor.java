package com.example.mongodb.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private String accessRights;
    private ArrayList<String> locations;

}
