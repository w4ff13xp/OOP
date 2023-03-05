package com.example.mongodb.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.model.User;
import com.example.mongodb.model.repository.UserRepository;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository repository;
    
    //CRUD CREATE, READ, UPDATE, DELETE

    public User addUser(User user) {
        user.setId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(user);
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public User getUserByUserId(String userId) {
        return repository.findById(userId).get();
    }

    public List<User> getUserByAccessRights(String accessRights) {
        return repository.findByAccessRights(accessRights);
    }

    public User updateUser(User userRequest) {
        //get the existing document from DB
        //populate new value from request to existing object/entity/document

        User existingUser = repository.findById(userRequest.getId()).get();
        existingUser.setUsername(userRequest.getUsername());
        existingUser.setPassword(userRequest.getPassword());
        existingUser.setEmail(userRequest.getEmail());
        existingUser.setAccessRights(userRequest.getAccessRights());
        return repository.save(existingUser);
    }

    public String deleteUser(String userId) {
        repository.deleteById(userId);
        return userId + "vendor deleted from database";
    }
    
}
