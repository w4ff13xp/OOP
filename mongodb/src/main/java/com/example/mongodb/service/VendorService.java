package com.example.mongodb.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.security.crypto.bcrypt.BCrypt; 

import com.example.mongodb.model.Vendor;
import com.example.mongodb.model.repository.VendorRepository;

@Service
public class VendorService {

    @Autowired
    private VendorRepository repository;
    
    //CRUD CREATE, READ, UPDATE, DELETE

    public Vendor addVendor(Vendor vendor) {
        vendor.setId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(vendor);
    }

    public List<Vendor> findAllVendors() {
        return repository.findAll();
    }

    public Vendor getVendorByVendorId(String vendorId) {
        return repository.findById(vendorId).get();
    }

    public List<Vendor> getVendorByAccessRights(String accessRights) {
        return repository.findByAccessRights(accessRights);
    }

    public Vendor updateVendor(Vendor vendorRequest) {
        //get the existing document from DB
        //populate new value from request to existing object/entity/document

        Vendor existingVendor = repository.findById(vendorRequest.getId()).get();
        existingVendor.setUsername(vendorRequest.getUsername());
        // String hashedsString = BCrypt.hashpw(vendorRequest.getPassword(), BCrypt.gensalt());
        // System.out.println("---------------------"+hashedsString);
        // existingVendor.setPassword(hashedsString);
        existingVendor.setPassword(vendorRequest.getPassword());
        existingVendor.setEmail(vendorRequest.getEmail());
        existingVendor.setAccessRights(vendorRequest.getAccessRights());
        existingVendor.setLocations(vendorRequest.getLocations());
        return repository.save(existingVendor);
    }

    public String deleteVendor(String vendorId) {
        repository.deleteById(vendorId);
        return vendorId + "vendor deleted from database";
    }
}
