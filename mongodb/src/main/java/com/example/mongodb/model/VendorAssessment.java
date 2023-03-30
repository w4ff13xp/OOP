package com.example.mongodb.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "VendorAssessment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorAssessment {
    @Id
    private String formCode;
    private String vendorID;
    private Date deadline;
    private String formName;
    private String companyName;
    private String status;
    private String rejectionReason;
    
    private Long registrationNo;
    private String officeAddress;
    private boolean getRegistered;
    private Long vendorTel;
    private Long vendorFax;
    private String businessType;
    private String contactName;
    private Long contactTel;
    private String contactDesignation;
    private String businessNature;
    private String products;
    private Boolean iso9001Certification;
    private Boolean accrediationOfLaboratory;
    private Boolean productCertification;
    private Boolean resultsOfProductEvaluation;
    private Boolean siteEvaluationResults;
    private Boolean resultsOfFirstDeal;
    private Boolean trackRecordReview;
    private String evaluationOthers;
    private String certificationBody;
    private String accrediationBody;
    private String productMarkings;
    private Boolean resultOfEvaluation;
    private String evaluatedBy;
    private String approvedByDirector;
    private Date submissionDate;

}
