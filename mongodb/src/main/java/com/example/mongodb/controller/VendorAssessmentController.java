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

import com.example.mongodb.model.VendorAssessment;
import com.example.mongodb.service.VendorAssessmentService;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/vendorAssessment")
public class VendorAssessmentController {

    @Autowired
    private VendorAssessmentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VendorAssessment createVendorAssessment(@RequestBody VendorAssessment vendorAssessment) {
        return service.addVendorAssessment(vendorAssessment);
    }

    @GetMapping
    public List<VendorAssessment> getVendorAssessments() {
        return service.findAllVendorAssessments();
    }

    @GetMapping("/{formCode}")
    public VendorAssessment getVendorAssessment(@PathVariable String formCode) {
        return service.getVendorAssessmentByFormCode(formCode);
    }

    @PutMapping
    public VendorAssessment modifyVendorAssessment(@RequestBody VendorAssessment vendorAssessment) {
        return service.updateVendorAssessment(vendorAssessment);
    }

    @DeleteMapping("/{formCode}")
    public String deleteVendorAssessment(@PathVariable String formCode) {
        return service.deleteVendorAssessment(formCode);
    }

}
