package com.example.mongodb.resource;

import java.util.Date;

public class VendorAssessmentRequest {
    
    // user input from VendorAssessmentForm
    private String companyName;
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
    private Date effectiveDate;

    //constructor to create
    public VendorAssessmentRequest() {
    }
    
    public VendorAssessmentRequest(String companyName, Long registrationNo, String officeAddress, boolean getRegistered,
            Long vendorTel, Long vendorFax, String businessType, String contactName, Long contactTel,
            String contactDesignation, String businessNature, String products, Boolean iso9001Certification,
            Boolean accrediationOfLaboratory, Boolean productCertification, Boolean resultsOfProductEvaluation,
            Boolean siteEvaluationResults, Boolean resultsOfFirstDeal, Boolean trackRecordReview,
            String evaluationOthers, String certificationBody, String accrediationBody, String productMarkings,
            Boolean resultOfEvaluation, String evaluatedBy, String approvedByDirector, Date effectiveDate) 
        {
                this.companyName = companyName;
                this.registrationNo = registrationNo;
                this.officeAddress = officeAddress;
                this.getRegistered = getRegistered;
                this.vendorTel = vendorTel;
                this.vendorFax = vendorFax;
                this.businessType = businessType;
                this.contactName = contactName;
                this.contactTel = contactTel;
                this.contactDesignation = contactDesignation;
                this.businessNature = businessNature;
                this.products = products;
                this.iso9001Certification = iso9001Certification;
                this.accrediationOfLaboratory = accrediationOfLaboratory;
                this.productCertification = productCertification;
                this.resultsOfProductEvaluation = resultsOfProductEvaluation;
                this.siteEvaluationResults = siteEvaluationResults;
                this.resultsOfFirstDeal = resultsOfFirstDeal;
                this.trackRecordReview = trackRecordReview;
                this.evaluationOthers = evaluationOthers;
                this.certificationBody = certificationBody;
                this.accrediationBody = accrediationBody;
                this.productMarkings = productMarkings;
                this.resultOfEvaluation = resultOfEvaluation;
                this.evaluatedBy = evaluatedBy;
                this.approvedByDirector = approvedByDirector;
                this.effectiveDate = effectiveDate;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(Long registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public boolean isGetRegistered() {
        return getRegistered;
    }

    public void setGetRegistered(boolean getRegistered) {
        this.getRegistered = getRegistered;
    }

    public Long getVendorTel() {
        return vendorTel;
    }

    public void setVendorTel(Long vendorTel) {
        this.vendorTel = vendorTel;
    }

    public Long getVendorFax() {
        return vendorFax;
    }

    public void setVendorFax(Long vendorFax) {
        this.vendorFax = vendorFax;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getContactTel() {
        return contactTel;
    }

    public void setContactTel(Long contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactDesignation() {
        return contactDesignation;
    }

    public void setContactDesignation(String contactDesignation) {
        this.contactDesignation = contactDesignation;
    }

    public String getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public Boolean getIso9001Certification() {
        return iso9001Certification;
    }

    public void setIso9001Certification(Boolean iso9001Certification) {
        this.iso9001Certification = iso9001Certification;
    }

    public Boolean getAccrediationOfLaboratory() {
        return accrediationOfLaboratory;
    }

    public void setAccrediationOfLaboratory(Boolean accrediationOfLaboratory) {
        this.accrediationOfLaboratory = accrediationOfLaboratory;
    }

    public Boolean getProductCertification() {
        return productCertification;
    }

    public void setProductCertification(Boolean productCertification) {
        this.productCertification = productCertification;
    }

    public Boolean getResultsOfProductEvaluation() {
        return resultsOfProductEvaluation;
    }

    public void setResultsOfProductEvaluation(Boolean resultsOfProductEvaluation) {
        this.resultsOfProductEvaluation = resultsOfProductEvaluation;
    }

    public Boolean getSiteEvaluationResults() {
        return siteEvaluationResults;
    }

    public void setSiteEvaluationResults(Boolean siteEvaluationResults) {
        this.siteEvaluationResults = siteEvaluationResults;
    }

    public Boolean getResultsOfFirstDeal() {
        return resultsOfFirstDeal;
    }

    public void setResultsOfFirstDeal(Boolean resultsOfFirstDeal) {
        this.resultsOfFirstDeal = resultsOfFirstDeal;
    }

    public Boolean getTrackRecordReview() {
        return trackRecordReview;
    }

    public void setTrackRecordReview(Boolean trackRecordReview) {
        this.trackRecordReview = trackRecordReview;
    }

    public String getEvaluationOthers() {
        return evaluationOthers;
    }

    public void setEvaluationOthers(String evaluationOthers) {
        this.evaluationOthers = evaluationOthers;
    }

    public String getCertificationBody() {
        return certificationBody;
    }

    public void setCertificationBody(String certificationBody) {
        this.certificationBody = certificationBody;
    }

    public String getAccrediationBody() {
        return accrediationBody;
    }

    public void setAccrediationBody(String accrediationBody) {
        this.accrediationBody = accrediationBody;
    }

    public String getProductMarkings() {
        return productMarkings;
    }

    public void setProductMarkings(String productMarkings) {
        this.productMarkings = productMarkings;
    }

    public Boolean getResultOfEvaluation() {
        return resultOfEvaluation;
    }

    public void setResultOfEvaluation(Boolean resultOfEvaluation) {
        this.resultOfEvaluation = resultOfEvaluation;
    }

    public String getEvaluatedBy() {
        return evaluatedBy;
    }

    public void setEvaluatedBy(String evaluatedBy) {
        this.evaluatedBy = evaluatedBy;
    }

    public String getApprovedByDirector() {
        return approvedByDirector;
    }

    public void setApprovedByDirector(String approvedByDirector) {
        this.approvedByDirector = approvedByDirector;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    


    
    
}
