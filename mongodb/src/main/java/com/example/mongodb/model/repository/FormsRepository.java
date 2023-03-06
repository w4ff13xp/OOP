package com.example.mongodb.model.repository;
import java.util.List;

import com.example.mongodb.model.UserAll;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FormsRepository extends MongoRepository<UserAll, String> {
    //List<UserAll> findByName(String username);
    
}
