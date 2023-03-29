package com.example.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.example.mongodb.model.HealthEvaluation;
import com.example.mongodb.service.HealthEvaluationService;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/healthEvaluation")
public class HealthEvaluationController {

    @Autowired
    private HealthEvaluationService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HealthEvaluation createHealthEvaluation(@RequestBody HealthEvaluation healthEvaluation) {
        return service.addHealthEvaluation(healthEvaluation);
    }

    @GetMapping
    public List<HealthEvaluation> getHealthEvaluations() {
        return service.findAllHealthEvaluations();
    }

    @GetMapping("/{formCode}")
    public HealthEvaluation getHealthEvaluation(@PathVariable String formCode) {
        return service.getHealthEvaluationByFormCode(formCode);
    }

    @PutMapping
    public HealthEvaluation modifyHealthEvaluation(@RequestBody HealthEvaluation healthEvaluation) {
        return service.updateHealthEvaluation(healthEvaluation);
    }

    @PutMapping("/updateStatus")
    public HealthEvaluation modifyHealthStatus(@RequestBody HealthEvaluation healthEvaluation) {
        return service.updateHealthStatus(healthEvaluation);
    }

    @DeleteMapping("/{formCode}")
    public String deleteHealthEvaluation(@PathVariable String formCode) {
        return service.deleteHealthEvaluation(formCode);
    }

}