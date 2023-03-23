package com.example.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.model.VendorAssessment;
import com.example.mongodb.repository.VendorAssessmentRepository;

@Service
public class VendorAssessmentService {

    @Autowired
    private VendorAssessmentRepository repository;

    public VendorAssessment addVendorAssessment(VendorAssessment vendorAssessment) {
        return repository.save(vendorAssessment);
    }

    public List<VendorAssessment> findAllVendorAssessments() {
        return repository.findAll();
    }

    public VendorAssessment getVendorAssessmentByFormCode(String formCode) {
        return repository.findById(formCode).get();
    }

    public VendorAssessment updateVendorAssessment(VendorAssessment VARequest) {
        VendorAssessment existingForm = repository.findById(VARequest.getFormCode()).get();
        existingForm.setFormCode(VARequest.getFormCode());
        existingForm.setVendorID(VARequest.getVendorID());
        existingForm.setDate(VARequest.getDate());
        existingForm.setFormName(VARequest.getFormName());
        existingForm.setFormCompleted(VARequest.isFormCompleted());
        existingForm.setFormApproved(VARequest.isFormApproved());
        existingForm.setFormEvaluated(VARequest.isFormEvaluated());

        existingForm.setVendorID(VARequest.getVendorID());
        existingForm.setCompanyName(VARequest.getCompanyName());
        existingForm.setRegistrationNo(VARequest.getRegistrationNo());
        existingForm.setOfficeAddress(VARequest.getOfficeAddress());
        existingForm.setGetRegistered(VARequest.isGetRegistered());
        existingForm.setVendorTel(VARequest.getVendorTel());
        existingForm.setVendorFax(VARequest.getVendorFax());
        existingForm.setBusinessType(VARequest.getBusinessType());
        existingForm.setContactName(VARequest.getContactName());
        existingForm.setContactTel(VARequest.getContactTel());
        existingForm.setContactDesignation(VARequest.getContactDesignation());
        existingForm.setBusinessNature(VARequest.getBusinessNature());
        existingForm.setProducts(VARequest.getProducts());
        existingForm.setIso9001Certification(VARequest.getIso9001Certification());
        existingForm.setAccrediationOfLaboratory(VARequest.getAccrediationOfLaboratory());
        existingForm.setProductCertification(VARequest.getProductCertification());
        existingForm.setResultsOfProductEvaluation(VARequest.getResultsOfProductEvaluation());
        existingForm.setSiteEvaluationResults(VARequest.getSiteEvaluationResults());
        existingForm.setResultsOfFirstDeal(VARequest.getResultsOfFirstDeal());
        existingForm.setTrackRecordReview(VARequest.getTrackRecordReview());
        existingForm.setEvaluationOthers(VARequest.getEvaluationOthers());
        existingForm.setCertificationBody(VARequest.getCertificationBody());
        existingForm.setAccrediationBody(VARequest.getAccrediationBody());
        existingForm.setProductMarkings(VARequest.getProductMarkings());
        existingForm.setResultOfEvaluation(VARequest.getResultOfEvaluation());
        existingForm.setEvaluatedBy(VARequest.getEvaluatedBy());
        existingForm.setApprovedByDirector(VARequest.getApprovedByDirector());
        existingForm.setEffectiveDate(VARequest.getEffectiveDate());

        return repository.save(existingForm);
    }

    public String deleteVendorAssessment(String formCode) {
        repository.deleteById(formCode);
        return formCode + " deleted from dashboard";
    }
}
