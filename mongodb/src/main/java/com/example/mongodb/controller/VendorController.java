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

import com.example.mongodb.model.Vendor;
import com.example.mongodb.service.VendorService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/vendors")
public class VendorController {
    
    @Autowired
    private VendorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return service.addVendor(vendor);
    }

    @GetMapping
    public List<Vendor> getVendors() {
        return service.findAllVendors();
    }

    @GetMapping("/{vendorId}")
    public Vendor getVendor(@PathVariable String vendorId) {
        return service.getVendorByVendorId(vendorId);
    }

    @GetMapping("/accessRights/{accessRights}")
    public List<Vendor> findVendorByAccessRights(@PathVariable String accessRights) {
        return service.getVendorByAccessRights(accessRights);
    }

    @PutMapping
    public Vendor modifyVendor(@RequestBody Vendor vendor) {
        return service.updateVendor(vendor);
    }

    @DeleteMapping("/{vendorId}")
    public String deleteVendor(@PathVariable String vendorId) {
        return service.deleteVendor(vendorId);
    }
}
