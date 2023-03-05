package com.example.mongodb.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.NewVendorAssessment;
import com.example.mongodb.model.repository.NewVendorAssessmentRepository;
import com.example.mongodb.resource.VendorAssessmentRequest;


@RestController
public class NewVendorAssessmentController {

    private final NewVendorAssessmentRepository vendorAssessmentRepository;

        public NewVendorAssessmentController(NewVendorAssessmentRepository vendorAssessmentRepository) {
            this.vendorAssessmentRepository = vendorAssessmentRepository;
        }

    @GetMapping("/newVendorAssessment")
    public ResponseEntity<List<NewVendorAssessment>>getAllVendorAssessments(){
        return ResponseEntity.ok(this.vendorAssessmentRepository.findAll());

    }

    @PostMapping("/createNewVendorAssessment")
    public ResponseEntity<NewVendorAssessment> createVendorAssessment(@RequestBody VendorAssessmentRequest vendorAssessmentRequest) {

        NewVendorAssessment vendorForm = new NewVendorAssessment();
        vendorForm.setCompanyName(vendorAssessmentRequest.getCompanyName());
        vendorForm.setRegistrationNo(vendorAssessmentRequest.getRegistrationNo());
        vendorForm.setOfficeAddress(vendorAssessmentRequest.getOfficeAddress());
        vendorForm.setGetRegistered(vendorAssessmentRequest.isGetRegistered());
        vendorForm.setVendorTel(vendorAssessmentRequest.getVendorTel());
        vendorForm.setVendorFax(vendorAssessmentRequest.getVendorFax());
        vendorForm.setBusinessType(vendorAssessmentRequest.getBusinessType());
        vendorForm.setContactName(vendorAssessmentRequest.getContactName());
        vendorForm.setContactTel(vendorAssessmentRequest.getContactTel());
        vendorForm.setContactDesignation(vendorAssessmentRequest.getContactDesignation());
        vendorForm.setBusinessNature(vendorAssessmentRequest.getBusinessNature());
        vendorForm.setProducts(vendorAssessmentRequest.getProducts());
        vendorForm.setIso9001Certification(vendorAssessmentRequest.getIso9001Certification());
        vendorForm.setAccrediationOfLaboratory(vendorAssessmentRequest.getAccrediationOfLaboratory());
        vendorForm.setProductCertification(vendorAssessmentRequest.getProductCertification());
        vendorForm.setResultsOfProductEvaluation(vendorAssessmentRequest.getResultsOfProductEvaluation());
        vendorForm.setSiteEvaluationResults(vendorAssessmentRequest.getSiteEvaluationResults());
        vendorForm.setResultsOfFirstDeal(vendorAssessmentRequest.getResultsOfFirstDeal());
        vendorForm.setTrackRecordReview(vendorAssessmentRequest.getTrackRecordReview());
        vendorForm.setEvaluationOthers(vendorAssessmentRequest.getEvaluationOthers());
        vendorForm.setCertificationBody(vendorAssessmentRequest.getCertificationBody());
        vendorForm.setAccrediationBody(vendorAssessmentRequest.getAccrediationBody());
        vendorForm.setProductMarkings(vendorAssessmentRequest.getProductMarkings());
        vendorForm.setResultOfEvaluation(vendorAssessmentRequest.getResultOfEvaluation());
        vendorForm.setEvaluatedBy(vendorAssessmentRequest.getEvaluatedBy());
        vendorForm.setApprovedByDirector(vendorAssessmentRequest.getApprovedByDirector());
        vendorForm.setEffectiveDate(vendorAssessmentRequest.getEffectiveDate());
    
        // if successful return 201 status 
        return ResponseEntity.status(201).body(this.vendorAssessmentRepository.save(vendorForm));

    }

        

    
}
