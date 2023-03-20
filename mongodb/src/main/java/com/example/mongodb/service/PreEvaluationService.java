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
        PreEvaluation.setSubContractorName("");
        PreEvaluation.setScopeOfWork("");
        PreEvaluation.setEvaluator("");

        PreEvaluation.setSafetyHealthPolicy(null);
        PreEvaluation.setProperDelegation(null);
        PreEvaluation.setSafetyCommitment(null);

        PreEvaluation.setToolBoxMeeting(null);

        PreEvaluation.setSupervisorTraining(null);
        PreEvaluation.setWorkerTraining(null);
        PreEvaluation.setCertificatesSubmitted(null);

        PreEvaluation.setWorkerRules(null);
        PreEvaluation.setRiskAssessmentsSubmitted(null);

        PreEvaluation.setInspectionGuidelines(null);
        PreEvaluation.setPPE(null);

        PreEvaluation.setSafetySupervisor(null);
        PreEvaluation.setFirstAider(null);
        PreEvaluation.setRelevantLicensedPersonnel(null);

        PreEvaluation.setTemporaryDisabilityCases(null);
        PreEvaluation.setPermanentDisabilityCases(null);
        PreEvaluation.setFatalCases(null);

        PreEvaluation.setSignature(null);
        return repository.save(PreEvaluation);
    }

    public List<PreEvaluation> findAllPreEvaluations() {
        return repository.findAll();
    }

    public PreEvaluation getPreEvaluationByFormCode(String formCode) {
        return repository.findById(formCode).get();
    }

    public PreEvaluation updatePreEvaluation(PreEvaluation PERequest) {
        PreEvaluation existingForm = repository.findById(PERequest.getFormCode()).get();
        existingForm.setFormCode(PERequest.getFormCode());
        existingForm.setDate(PERequest.getDate());
        existingForm.setFormName(PERequest.getFormName());
        existingForm.setFormCompleted(PERequest.isFormCompleted());
        existingForm.setFormApproved(PERequest.isFormApproved());
        existingForm.setCompanyName(PERequest.getCompanyName());
        // existingForm.setRevisionNum(PERequest.getRevisionNum());
        existingForm.setSubContractorName(PERequest.getSubContractorName());
        existingForm.setScopeOfWork(PERequest.getScopeOfWork());
        existingForm.setEvaluator(PERequest.getEvaluator());

        existingForm.setSafetyHealthPolicy(PERequest.isSafetyHealthPolicy());
        existingForm.setProperDelegation(PERequest.getProperDelegation());
        existingForm.setSafetyCommitment(PERequest.getSafetyCommitment());

        existingForm.setToolBoxMeeting(PERequest.getToolBoxMeeting());

        existingForm.setSupervisorTraining(PERequest.getSupervisorTraining());
        existingForm.setWorkerTraining(PERequest.getWorkerTraining());
        existingForm.setCertificatesSubmitted(PERequest.getCertificatesSubmitted());

        existingForm.setWorkerRules(PERequest.getWorkerRules());
        existingForm.setRiskAssessmentsSubmitted(PERequest.getRiskAssessmentsSubmitted());

        existingForm.setInspectionGuidelines(PERequest.getInspectionGuidelines());
        existingForm.setPPE(PERequest.getPPE());;

        existingForm.setSafetySupervisor(PERequest.getSafetySupervisor());
        existingForm.setFirstAider(PERequest.getFirstAider());
        existingForm.setRelevantLicensedPersonnel(PERequest.getRelevantLicensedPersonnel());

        existingForm.setTemporaryDisabilityCases(PERequest.getTemporaryDisabilityCases());
        existingForm.setPermanentDisabilityCases(PERequest.getPermanentDisabilityCases());
        existingForm.setFatalCases(PERequest.getFatalCases());

        existingForm.setSignature(PERequest.getSignature());

        return repository.save(existingForm);
    }

    public String deletePreEvaluation(String formCode) {
        repository.deleteById(formCode);
        return formCode + " deleted from dashboard";
    }
}

