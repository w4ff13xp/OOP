package com.example.mongodb.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.UserAll;
import com.example.mongodb.model.repository.FormsRepository;

@RestController
@RequestMapping("/forms")
public class FormsController {

    @Autowired
    private FormsRepository ISOFormsRepository;

    @PostMapping("/fillForm")
    public String fillForm(@RequestBody UserAll user) {
        ISOFormsRepository.save(user);
        return "Form filled successfully";
    }

    // @GetMapping("/getUserByName/{username}")
    // public List<UserAll> getUserbyName(@PathVariable String username){
    //     return ISOFormsRepository.findByName(username);
    // }
    
}
