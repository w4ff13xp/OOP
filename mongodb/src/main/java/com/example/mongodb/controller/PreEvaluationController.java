package com.example.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.PreEvaluation;
import com.example.mongodb.service.PreEvaluationService;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/preEvaluation")
public class PreEvaluationController {

    @Autowired
    private PreEvaluationService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PreEvaluation createPreEvaluation(@RequestBody PreEvaluation preEvaluation) {
        return service.addPreEvaluation(preEvaluation);
    }

    @GetMapping
    public List<PreEvaluation> getPreEvaluations() {
        return service.findAllPreEvaluations();
    }

    @GetMapping("/{formCode}")
    public PreEvaluation getPreEvaluation(@PathVariable String formCode) {
        return service.getPreEvaluationByFormCode(formCode);
    }

    @PutMapping
    public PreEvaluation modifyPreEvaluation(@RequestBody PreEvaluation preEvaluation) {
        return service.updatePreEvaluation(preEvaluation);
    }

    @DeleteMapping("/{formCode}")
    public String deletePreEvaluation(@PathVariable String formCode) {
        return service.deletePreEvaluation(formCode);
    }

}
