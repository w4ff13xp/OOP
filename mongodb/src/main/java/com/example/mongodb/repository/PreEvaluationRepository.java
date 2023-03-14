package com.example.mongodb.repository;
import com.example.mongodb.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PreEvaluationRepository extends MongoRepository<PreEvaluation, String> {
    
}
