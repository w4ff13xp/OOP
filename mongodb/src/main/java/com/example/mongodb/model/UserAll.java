
package com.example.mongodb.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "usersAll")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserAll {
    
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private String accessRights;
    private String adminAssigned;
    private List<Forms> forms;
    
}
