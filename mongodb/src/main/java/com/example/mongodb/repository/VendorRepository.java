package com.example.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Vendor;
import com.mongodb.client.MongoDatabase;

public interface VendorRepository extends MongoRepository<Vendor, String>{

    // @Query("{accessRights: ?0}")
    List<Vendor> findByAccessRights(String accessRights);
    
}
