package com.example.mongodb.model.repository;
import com.example.mongodb.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface NewVendorAssessmentRepository extends MongoRepository<NewVendorAssessment, String> {
    
}
