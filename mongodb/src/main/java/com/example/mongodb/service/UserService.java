package com.example.mongodb.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.security.crypto.bcrypt.BCrypt; 

import com.example.mongodb.model.User;
import com.example.mongodb.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    
    //CRUD CREATE, READ, UPDATE, DELETE

    public User addUser(User user) {
        // if (repository.findById(user.getId()).get() != null){
        //     return;
        // }
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
        existingUser.setId(userRequest.getId());
        existingUser.setUsername(userRequest.getUsername());
        // String hashedsString = BCrypt.hashpw(vendorRequest.getPassword(), BCrypt.gensalt());
        // System.out.println("---------------------"+hashedsString);
        // existingVendor.setPassword(hashedsString);
        existingUser.setPassword(userRequest.getPassword());
        existingUser.setEmail(userRequest.getEmail());
        existingUser.setAccessRights(userRequest.getAccessRights());
        existingUser.setLocations(userRequest.getLocations());
        return repository.save(existingUser);
    }

    public String deleteUser(String userId) {
        repository.deleteById(userId);
        return userId + "user deleted from database";
    }
}
