package com.example.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.User;
import com.mongodb.client.MongoDatabase;

public interface UserRepository extends MongoRepository<User, String>{

    // @Query("{accessRights: ?0}")
    List<User> findByAccessRights(String accessRights);
    
}
