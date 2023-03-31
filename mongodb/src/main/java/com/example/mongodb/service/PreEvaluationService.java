package com.example.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.model.PreEvaluation;
import com.example.mongodb.repository.PreEvaluationRepository;

@Service
public class PreEvaluationService {

    @Autowired
    private PreEvaluationRepository repository;

    public PreEvaluation addPreEvaluation(PreEvaluation PreEvaluation) {
        return repository.save(PreEvaluation);
    }

    public List<PreEvaluation> findAllPreEvaluations() {
        return repository.findAll();
    }

    public PreEvaluation getPreEvaluationByFormCode(String formCode) {
        return repository.findById(formCode).get();
    }

    public PreEvaluation updatePreStatus(PreEvaluation PRERequest){
        PreEvaluation existingForm = repository.findById(PRERequest.getFormCode()).get();
        existingForm.setStatus(PRERequest.getStatus());
        existingForm.setRejectionReason(PRERequest.getRejectionReason());
        existingForm.setEvaluator(PRERequest.getEvaluator());
        existingForm.setEvaluatedDate(PRERequest.getEvaluatedDate());

        return repository.save(existingForm);
    }

    public PreEvaluation updatePreEvaluation(PreEvaluation PERequest) {
        PreEvaluation existingForm = repository.findById(PERequest.getFormCode()).get();
        existingForm.setFormCode(PERequest.getFormCode());
        existingForm.setVendorID(PERequest.getVendorID());
        existingForm.setDeadline(PERequest.getDeadline());
        existingForm.setEvaluatedDate(PERequest.getEvaluatedDate());
        existingForm.setFormName(PERequest.getFormName());
        existingForm.setCompanyName(PERequest.getCompanyName());
        existingForm.setStatus(PERequest.getStatus());
        existingForm.setRejectionReason(PERequest.getRejectionReason());
        existingForm.setAcknowledgedBy(PERequest.getAcknowledgedBy());
        existingForm.setSubContractorName(PERequest.getSubContractorName());
        existingForm.setScopeOfWork(PERequest.getScopeOfWork());
        existingForm.setEvaluator(PERequest.getEvaluator());

        existingForm.setSafetyHealthPolicy(PERequest.getSafetyHealthPolicy());
        existingForm.setProperDelegation(PERequest.getProperDelegation());
        existingForm.setSafetyCommitment(PERequest.getSafetyCommitment());

        existingForm.setToolBoxMeeting(PERequest.getToolBoxMeeting());

        existingForm.setSupervisorTraining(PERequest.getSupervisorTraining());
        existingForm.setWorkerTraining(PERequest.getWorkerTraining());
        existingForm.setCertificatesSubmitted(PERequest.getCertificatesSubmitted());

        existingForm.setWorkerRules(PERequest.getWorkerRules());
        existingForm.setRiskAssessmentsSubmitted(PERequest.getRiskAssessmentsSubmitted());

        existingForm.setInspectionGuidelines(PERequest.getInspectionGuidelines());
        existingForm.setPpe(PERequest.getPpe());;

        existingForm.setSafetySupervisor(PERequest.getSafetySupervisor());
        existingForm.setFirstAider(PERequest.getFirstAider());
        existingForm.setRelevantLicensedPersonnel(PERequest.getRelevantLicensedPersonnel());

        existingForm.setTemporaryDisabilityCases(PERequest.getTemporaryDisabilityCases());
        existingForm.setPermanentDisabilityCases(PERequest.getPermanentDisabilityCases());
        existingForm.setFatalCases(PERequest.getFatalCases());

        existingForm.setSignature(PERequest.getSignature());

        existingForm.setSubmissionDate(PERequest.getSubmissionDate());

        return repository.save(existingForm);
    }

    public String deletePreEvaluation(String formCode) {
        repository.deleteById(formCode);
        return formCode + " deleted from dashboard";
    }
}

