package com.example.mongodb.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "PreEvaluationForm")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreEvaluation {
    @Id
    private String formCode;
    private Date date;
    private String formName;
    private boolean formCompleted;
    private boolean formApproved;
    private String companyName;

    private String subContractorName;
    private String scopeOfWork;
    private String evaluator;

    private Boolean safetyHealthPolicy;
    private Boolean properDelegation;
    private Boolean safetyCommitment;
    
    private Boolean toolBoxMeeting;

    private Boolean supervisorTraining;
    private Boolean workerTraining;
    private Boolean certificatesSubmitted;

    private Boolean workerRules;
    private Boolean riskAssessmentsSubmitted;

    private Boolean inspectionGuidelines;
    private Boolean PPE;

    private Boolean safetySupervisor;
    private Boolean firstAider;
    private Boolean relevantLicensedPersonnel;

    private Integer temporaryDisabilityCases;
    private Integer permanentDisabilityCases;
    private Integer fatalCases;

    private String signature;

    private Date effectiveDate;

}
