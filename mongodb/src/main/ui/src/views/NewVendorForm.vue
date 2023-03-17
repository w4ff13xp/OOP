<template>
    <div class="container-fluid">
      <!-- <Navigation></Navigation> -->
      <h2 id="title" class="text-center pt-3">
        NEW VENDOR FORM EVALUATION
      </h2>
  
      <div class="row bg-light m-5 rounded p-3 border">
        <h4 class="text-center mb-5">PART I: NEW VENDOR FORM</h4>
        <form>
          <div class="m-3 d-flex">
            <div class="d-flex w-100">
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Company Name</label>
                <input type="text" class="form-control" name="first" placeholder="Company's Name" v-model="companuName">        
              </div>
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Company Registration No.</label>
                <input type="number" class="form-control" name="second" placeholder="Company's Registration No. " v-model="registrationNo">        
              </div>   
            </div>
          </div>
          <div class="m-3 d-flex">
            <div class="d-flex justify-content-between w-100">
                <div class="form-check form-check-inline ">
                    <div>
                        <label class="form-check-label"  for="gstRegistered">GST Registered</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label "  for="inlineRadio1">Yes</label>
                        <input type="radio" class="form-check-input" name="third" id="inlineRadio1" value="true" v-model="getRegistered">        
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label"  for="inlineRadio1">No</label>
                        <input type="radio" class="form-check-input" name="third" id="inlineRadio1" value="false" v-model="getRegistered">        
                    </div>
              </div>   
        
            </div>
          </div>
          <div class="m-3 d-flex">
            <div class="d-flex justify-content-between w-100">
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Office Address</label>
                <input type="text" class="form-control" name="fourth" placeholder="1234 Main St" v-model="officeAddress">        
              </div>  
              <div class="form-check form-check-inline col-md-3">
                <label class="form-check-label" for="inputPhone">Tel</label>
                <input type="number" class="form-control" name="fifth" placeholder="9123 4567" v-model="vendorTel">
              </div>
              <div class="form-check form-check-inline col-md-3">
                <label class="form-check-label" for="inputPhone">Fax</label>
                <input type="number" class="form-control" name="sixth" placeholder="6123 4567" v-model="vendorFax">
              </div>
              
            </div>
          </div>
          <div class="m-3 d-flex">
            <div class="d-flex justify-content-between w-100">
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Types of business License/ Registration</label>
                <input type="text" class="form-control" name="seventh" placeholder="Company's Name" v-model="businessType">        
              </div>
              <div class="form-check form-check-inline col-md-6">
                <div >Nature of Business {{ businessNature }}</div>
                <select v-model="businessNature" class="btn btn-outline-secondary dropdown-toggle col-md-12">
                    <option value="" disabled>Please select one</option>
                    <option value="Manufacturing">Manufacturing</option>
                    <option value="Agent/dealer">Agent/dealer</option>
                    <option value="Distributor">Distributor</option>
                    <option value="Others">Others</option>
                </select>
              </div>   
            </div>
          </div>
          <div class="m-3 d-flex">
            <div class="d-flex justify-content-between w-100">
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Contact Person</label>
                <input type="text" class="form-control" name="ninth" placeholder="Company's Name" v-model="contactName">        
              </div>
              <div class="form-check form-check-inline col-md-3">
                <label class="form-check-label" for="inputPhone">Tel</label>
                <input type="number" class="form-control" name="tenth" placeholder="6123 4567" v-model="contactTel">
              </div>
              <div class="form-check form-check-inline col-md-3">
                <label class="form-check-label"  for="inlineCompanyName">Designation</label>
                <input type="text" class="form-control" name="eleventh" placeholder="e.g. Manger " v-model="contactDesignation">        
              </div>   
            </div>
          </div>
          <div class="m-3 d-flex">
            <div class="d-flex justify-content-between w-100">
              <div class="form-check form-check-inline col-md-12">
                <label class="form-check-label"  for="product">Product/ Services</label>
                <input type="text" class="form-control" name="seventh" placeholder="Submit company's profile, brochure on product/service, if available" v-model="products">        
              </div>
 
            </div>
          </div>
        </form>
  
      </div>
  
      <div class="row bg-light m-5 rounded p-3 border">
        <h4 class="text-center mb-5">
          PART II: EVALUATION
        </h4>
        <form>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="iso9001Certification">
                        <label class="form-check-label" for="flexCheckDefault">ISO 9001 Certification{{ iso9001Certification }}</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Certification Body" v-model="certificationBody">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="accrediationOfLaboratory">
                        <label class="form-check-label" for="flexCheckDefault">Accredition of Laboratory</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Accredition Body" v-model="accrediationBody">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="productCertification">
                        <label class="form-check-label" for="flexCheckDefault">Product Certification</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Product Markings (e.g. PSB, UL, TUV)" v-model="productMarkings">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="siteEvaluationResults">
                        <label class="form-check-label" for="flexCheckDefault">Site Evaluation Results</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="resultsOfProductEvaluation">
                        <label class="form-check-label" for="flexCheckDefault">Results of Sample/Product Evaluation</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="resultsOfFirstDeal">
                        <label class="form-check-label" for="flexCheckDefault">Results of First Deal</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="trackRecordReview">
                        <label class="form-check-label" for="flexCheckDefault">Track Record Review/ Customer Reference</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-12">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="evaluationOthers">
                        <label class="form-check-label" for="flexCheckDefault">Others(e.g. commercial, sole supplier, customer specified, franchise etc.)</label>
                    </div>
                </div>
            </div>
        </form>
  
        <!-- <h5 class="text-center my-3">SCORE (II): {{ computeScoreTwo }}</h5> -->
      </div>
  
      <div class="row bg-light m-5 rounded p-3 border">
        <h4 class="text-center mb-5">PART III: RESULT OF EVALUATION</h4>
        <form>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline ">
                            <div>
                                <label class="form-check-label"  for="gstRegistered">Approved</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <label class="form-check-label "  for="inlineRadio1">Yes</label>
                                <input type="radio" class="form-check-input" name="third" id="inlineRadio1" value="true" v-model="resultOfEvaluation">        
                            </div>
                            <div class="form-check form-check-inline">
                                <label class="form-check-label"  for="inlineRadio1">No</label>
                                <input type="radio" class="form-check-input" name="third" id="inlineRadio1" value="false" v-model="resultOfEvaluation">        
                            </div>
                    </div>  
                    <div class="form-check form-check-inline ">
                        <label class="form-check-label"  for="inlineCompanyName">Evaluated by</label>
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="evaluatedBy">
                    </div>
                    <div class="form-check form-check-inline ">
                        <label class="form-check-label"  for="inlineCompanyName">Approved by</label>
                        <input type="text" class="form-control form-check-inline" name="companyaddress" placeholder="evaluator name" v-model="approvedByDirector">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline ">
                        <label class="form-check-label"  for="inlineCompanyName">Effective Date</label>
                        <input type="date" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="effectiveDate">
                    </div>
                </div>
            </div>
        </form>
  
        <!-- <h5 class="text-center my-3">SCORE (III): {{ computeScoreThree }}</h5> -->
      </div>
  
      <div class="text-center m-3">
        <button type="submit" class="btn btn-warning mx-3" @click="addToAPI">Save</button>
        <button type="submit" class="btn btn-success text-white" @click="addToAPI">Submit</button>
      </div>
      <!-- <Footer></Footer> -->
    </div>
  </template>
  
  <script>
  export default {
    name: "NewVendorForm",
    data() {
      return {
        formCode: "QLI-QHSP-10-F01",
        formDate: "2023-03-07",
        formName: "vendor assessment",
        formCompleted: false,
        formApproved: false,
  
        companuName: "",
        registrationNo: "",
        officeAddress: "",
        getRegistered: "",
        vendorTel: "",
        vendorFax: "",
  
        businessType: "",
        contactName: "",
        contactTel: "",
        contactDesignation: "",
        businessNature: "",
        products: "",
  
        iso9001Certification: false,
        accrediationOfLaboratory: false,
        productCertification: false,
        resultsOfProductEvaluation: false,
        siteEvaluationResults: false,
        resultsOfFirstDeal: false,
        trackRecordReview: false,

        evaluationOthers: "",
        certificationBody: "",
        accrediationBody: "",
        productMarkings: "",
        resultOfEvaluation: false,
  
        evaluatedBy: "",
        approvedByDirector: "",
        effectiveDate: "",
      };
    },
    methods: {
      addToAPI() {
        let newForm = {
          formCode: this.formCode,
          date: this.formDate,
          formName: this.formName,
          formCompleted: this.formCompleted,
          formApproved: this.formApproved,

          companyName: this.companyName,
          registrationNo: this.registrationNo, 
          officeAddress: this.officeAddress, 
          getRegistered: this.gstRegistered, 
          vendorTel: this.vendorTel, 
          vendorFax: this.vendorFax, 
          businessType: this.businessType, 
  
          contactName: this.contactName, 
          contactTel: this.contactTel, 
          contactDesignation: this.contactDesignation, 
          businessNature: this.businessNature, 
          products: this.products, 

          iso9001Certification: this.iso9001Certification, 
          accrediationOfLaboratory: this.accrediationOfLaboratory, 
          productCertification: this.productCertification, 
          resultsOfProductEvaluation: this.resultsOfProductEvaluation,
          siteEvaluationResults: this.siteEvaluationResults,
          resultsOfFirstDeal: this.resultsOfFirstDeal,
          trackRecordReview: this.trackRecordReview,
          evaluationOthers: this.evaluationOthers,

          certificationBody: this.certificationBody,
          accrediationBody: this.accrediationBody,
          productMarkings: this.productMarkings,
          resultOfEvaluation: this.resultOfEvaluation,

          evaluatedBy: this.evaluatedBy,
          approvedByDirector: this.approvedByDirector,
          effectiveDate: this.effectiveDate,
     
        };
  
        const axios = require("axios");
  
        axios
          .post("http://localhost:8080/vendorAssessment", newForm)
          .then((response) => {
            console.log(response);
          })
          .catch((error) => {
            console.log(error);
          });
      },
    },
    computed: {
      computeScoreOne() {
        this.score1 =
          parseInt(this.attendance) +
          parseInt(this.toolBox) +
          parseInt(this.compliance) +
          parseInt(this.promotionalActivities) +
          parseInt(this.submission);
        return this.score1;
      },
      computeScoreTwo() {
        this.score2 =
          parseInt(this.trainingCourse) +
          parseInt(this.tradeCourse) +
          parseInt(this.safetyTalk) +
          parseInt(this.WSHSupervisor) +
          parseInt(this.otherTraining);
        return this.score2;
      },
      computeScoreThree() {
        this.score3 =
          parseInt(this.effort) +
          parseInt(this.permitToWork) +
          parseInt(this.frequencyRate) +
          parseInt(this.safetyOffence) +
          parseInt(this.safetyRectification);
        return this.score3;
      },
      computeScoreFour() {
        this.score4 =
          parseInt(this.cuttingTool) +
          parseInt(this.ladder) +
          parseInt(this.liftingGear) +
          parseInt(this.electricalEquipment) +
          parseInt(this.otherMachineries);
        return this.score4;
      },
      computeScoreFive() {
        this.score5 =
          parseInt(this.commitmentHS) +
          parseInt(this.PPECompliance) +
          parseInt(this.siteCleanliness) +
          parseInt(this.storeCleanliness) +
          parseInt(this.quarterCleanliness);
        return this.score5;
      },
      computeOverallScore() {
        this.overallScore =
          (((this.score1 + this.score2 + this.score3 + this.score4 + this.score5) /
            (25 * 5)) *
          100).toFixed(2);
        return this.overallScore;
      },
      computePerformanceStandard() {
        if (this.overallScore <= 39) {
          this.performanceStandard = "Poor";
        } else if (this.overallScore <= 49) {
          this.performanceStandard = "Below Average";
        } else if (this.overallScore <= 64) {
          this.performanceStandard = "Average";
        } else if (this.overallScore <= 84) {
          this.performanceStandard = "Above Average";
        } else {
          this.performanceStandard = "Good";
        }
        return this.performanceStandard;
      },
    },
  };
  </script>
  
  <style></style>
  