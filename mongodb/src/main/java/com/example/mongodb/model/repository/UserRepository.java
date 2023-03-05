package com.example.mongodb.model.repository;

import java.util.List;

import com.example.mongodb.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    
    // @Query("{accessRights: ?0}")
    List<User> findByAccessRights(String accessRights);
    
}
