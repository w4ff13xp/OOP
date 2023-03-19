<template>
    <div class="container-fluid">
      <!-- <form action="http://localhost:8080/home" method="post"> -->
      <form v-on:submit.prevent="addToAPI" id="form">

        
      <!-- <Navigation></Navigation> -->
      <h2 id="title" class="text-center pt-3">
        NEW VENDOR FORM EVALUATION
      </h2>
  
      <div class="row bg-light m-5 rounded p-3 border">
        <h4 class="text-center mb-5">PART I: NEW VENDOR FORM</h4>
        <!-- <form action="customer/customerinput.php" method="post"> -->
          <div class="m-3 d-flex">
            <div class="d-flex w-100">
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Company Name*</label>
                <input type="text" class="form-control" name="first" placeholder="Company's Name" v-model="state.companyName" >        
                <span class="text-danger" v-if="v$.companyName.$error">{{ v$.companyName.$errors[0].$message }}</span>
              </div>
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Company Registration No.*</label>
                <input type="number" class="form-control" name="second" placeholder="Company's Registration No." v-model="state.registrationNo" >        
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
                        <input type="radio" class="form-check-input" name="third" id="inlineRadio1" value="true" v-model="state.getRegistered">        
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label"  for="inlineRadio1">No</label>
                        <input type="radio" class="form-check-input" name="third" id="inlineRadio1" value="false" v-model="state.getRegistered">        
                    </div>
              </div>   
        
            </div>
          </div>
          <div class="m-3 d-flex">
            <div class="d-flex justify-content-between w-100">
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Office Address</label>
                <input type="text" class="form-control" name="fourth" placeholder="1234 Main St" v-model="state.officeAddress">        
              </div>  
              <div class="form-check form-check-inline col-md-3">
                <label class="form-check-label" for="inputPhone">Tel</label>
                <input type="number" class="form-control" name="fifth" placeholder="9123 4567" v-model="state.vendorTel">
              </div>
              <div class="form-check form-check-inline col-md-3">
                <label class="form-check-label" for="inputPhone">Fax</label>
                <input type="number" class="form-control" name="sixth" placeholder="6123 4567" v-model="state.vendorFax">
              </div>
              
            </div>
          </div>
          <div class="m-3 d-flex">
            <div class="d-flex justify-content-between w-100">
              <div class="form-check form-check-inline col-md-6">
                <label class="form-check-label"  for="inlineCompanyName">Types of business License/ Registration</label>
                <input type="text" class="form-control" name="seventh" placeholder="Company's Name" v-model="state.businessType">        
              </div>
              <div class="form-check form-check-inline col-md-6">
                <div >Nature of Business {{ businessNature }}</div>
                <select v-model="state.businessNature" class="btn btn-outline-secondary dropdown-toggle col-md-12">
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
                <input type="text" class="form-control" name="ninth" placeholder="Company's Name" v-model="state.contactName">        
              </div>
              <div class="form-check form-check-inline col-md-3">
                <label class="form-check-label" for="inputPhone">Tel</label>
                <input type="number" class="form-control" name="tenth" placeholder="6123 4567" v-model="state.contactTel">
              </div>
              <div class="form-check form-check-inline col-md-3">
                <label class="form-check-label"  for="inlineCompanyName">Designation</label>
                <input type="text" class="form-control" name="eleventh" placeholder="e.g. Manger " v-model="state.contactDesignation">        
              </div>   
            </div>
          </div>
          <div class="m-3 d-flex">
            <div class="d-flex justify-content-between w-100">
              <div class="form-check form-check-inline col-md-12">
                <label class="form-check-label"  for="product">Product/ Services</label>
                <input type="text" class="form-control" name="seventh" placeholder="Submit company's profile, brochure on product/service, if available" v-model="state.products">        
              </div>
 
            </div>
          </div>
        <!-- </form> -->
  
      </div>
  
      <div class="row bg-light m-5 rounded p-3 border">
        <h4 class="text-center mb-5">
          PART II: EVALUATION
        </h4>
        <!-- <form> -->
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.iso9001Certification">
                        <label class="form-check-label" for="flexCheckDefault">ISO 9001 Certification{{ iso9001Certification }}</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Certification Body" v-model="state.certificationBody">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.accrediationOfLaboratory">
                        <label class="form-check-label" for="flexCheckDefault">Accredition of Laboratory</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Accredition Body" v-model="state.accrediationBody">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.productCertification">
                        <label class="form-check-label" for="flexCheckDefault">Product Certification</label>
                    </div>
                
                    <div class="form-check form-check-inline col-md-6">
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Product Markings (e.g. PSB, UL, TUV)" v-model="state.productMarkings">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline col-md-6">
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.siteEvaluationResults">
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
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.resultsOfProductEvaluation">
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
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.resultsOfFirstDeal">
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
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.trackRecordReview">
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
                        <input class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.evaluationOthers">
                        <label class="form-check-label" for="flexCheckDefault">Others(e.g. commercial, sole supplier, customer specified, franchise etc.)</label>
                    </div>
                </div>
            </div>
        <!-- </form> -->
  
        <!-- <h5 class="text-center my-3">SCORE (II): {{ computeScoreTwo }}</h5> -->
      </div>
  
      <div class="row bg-light m-5 rounded p-3 border">
        <h4 class="text-center mb-5">PART III: RESULT OF EVALUATION</h4>
        <!-- <form> -->
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline ">
                            <div>
                                <label class="form-check-label"  for="gstRegistered">Approved</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <label class="form-check-label "  for="inlineRadio1">Yes</label>
                                <input type="radio" class="form-check-input" name="third" id="inlineRadio1" value="true" v-model="state.resultOfEvaluation">        
                            </div>
                            <div class="form-check form-check-inline">
                                <label class="form-check-label"  for="inlineRadio1">No</label>
                                <input type="radio" class="form-check-input" name="third" id="inlineRadio1" value="false" v-model="state.resultOfEvaluation">        
                            </div>
                    </div>  
                    <div class="form-check form-check-inline ">
                        <label class="form-check-label"  for="inlineCompanyName">Evaluated by</label>
                        <input type="text" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="state.evaluatedBy">
                    </div>
                    <div class="form-check form-check-inline ">
                        <label class="form-check-label"  for="inlineCompanyName">Approved by</label>
                        <input type="text" class="form-control form-check-inline" name="companyaddress" placeholder="evaluator name" v-model="state.approvedByDirector">
                    </div>
                </div>
            </div>
            <div class="m-3 d-flex">
                <div class="d-flex justify-content-between w-100">
                    <div class="form-check form-check-inline ">
                        <label class="form-check-label"  for="inlineCompanyName">Effective Date</label>
                        <input type="date" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="state.effectiveDate">
                    </div>
                </div>
            </div>
        <!-- </form> -->
  
        <!-- <h5 class="text-center my-3">SCORE (III): {{ computeScoreThree }}</h5> -->
      </div>
  
      <div class="text-center m-3">
        <button type="submit" class="btn btn-warning mx-3" >Save</button>
        <button type="submit" class="btn btn-success text-white" >Submit</button>
      </div>
    </form>
      <!-- <Footer></Footer> -->
    </div>
  </template>
  
  <script>
  import useValidate from '@vuelidate/core'
  import {required, helpers} from '@vuelidate/validators'
  import {reactive, computed} from 'vue'
  export default {
    name: "NewVendorForm",
    setup(){
      const state = reactive({
        // formDate: "2023-03-07",
        // formName: "vendor assessment",
        // formCompleted: false,
        formApproved: false,
  
        companyName: "",
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
      })

      const rules = computed(() => {
        return {
        // formDate: "2023-03-07",
        // formName: "vendor assessment",
        // formCompleted: false,
        formApproved: false,

        companyName: {required},
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
        }
      })
      const v$ = useValidate(rules,state)
      return {
        state, 
        v$
      }
    },
    // data() {
    //   return {
    //     v$: useValidate(),
    //     // formCode: "QLI-QHSP-10-F01",
    //     formDate: "2023-03-07",
    //     formName: "vendor assessment",
    //     formCompleted: false,
    //     formApproved: false,
  
    //     companyName: "",
    //     registrationNo: "",
    //     officeAddress: "",
    //     getRegistered: "",
    //     vendorTel: "",
    //     vendorFax: "",
  
    //     businessType: "",
    //     contactName: "",
    //     contactTel: "",
    //     contactDesignation: "",
    //     businessNature: "",
    //     products: "",
  
    //     iso9001Certification: false,
    //     accrediationOfLaboratory: false,
    //     productCertification: false,
    //     resultsOfProductEvaluation: false,
    //     siteEvaluationResults: false,
    //     resultsOfFirstDeal: false,
    //     trackRecordReview: false,

    //     evaluationOthers: "",
    //     certificationBody: "",
    //     accrediationBody: "",
    //     productMarkings: "",
    //     resultOfEvaluation: false,
  
    //     evaluatedBy: "",
    //     approvedByDirector: "",
    //     effectiveDate: "",
    //   };
    // },
    
    methods: {
      addToAPI() {
        
        function toIsoString(date) {
          var tzo = -date.getTimezoneOffset(),
              dif = tzo >= 0 ? '+' : '-',
              pad = function(num) {
                  return (num < 10 ? '0' : '') + num;
              };
          return date.getFullYear() +
              '-' + pad(date.getMonth() + 1) +
              '-' + pad(date.getDate()) +
              'T' + pad(date.getHours()) +
              ':' + pad(date.getMinutes()) +
              ':' + pad(date.getSeconds()) +
              dif + pad(Math.floor(Math.abs(tzo) / 60)) +
              ':' + pad(Math.abs(tzo) % 60);
        }
        var dt = new Date();
        let newForm = {
          // formCode: this.formCode,
          date: toIsoString(dt),
          formName: "vendor assessment",
          formCompleted: false,
          formApproved: this.state.formApproved,

          companyName: this.state.companyName,
          registrationNo: this.state.registrationNo, 
          officeAddress: this.state.officeAddress, 
          getRegistered: this.state.gstRegistered, 
          vendorTel: this.state.vendorTel, 
          vendorFax: this.state.vendorFax, 
          businessType: this.state.businessType, 
  
          contactName: this.state.contactName, 
          contactTel: this.state.contactTel, 
          contactDesignation: this.state.contactDesignation, 
          businessNature: this.state.businessNature, 
          products: this.state.products, 

          iso9001Certification: this.state.iso9001Certification, 
          accrediationOfLaboratory: this.state.accrediationOfLaboratory, 
          productCertification: this.state.productCertification, 
          resultsOfProductEvaluation: this.state.resultsOfProductEvaluation,
          siteEvaluationResults: this.state.siteEvaluationResults,
          resultsOfFirstDeal: this.state.resultsOfFirstDeal,
          trackRecordReview: this.state.trackRecordReview,
          evaluationOthers: this.state.evaluationOthers,

          certificationBody: this.state.certificationBody,
          accrediationBody: this.state.accrediationBody,
          productMarkings: this.state.productMarkings,
          resultOfEvaluation: this.state.resultOfEvaluation,

          evaluatedBy: this.state.evaluatedBy,
          approvedByDirector: this.state.approvedByDirector,
          effectiveDate: this.state.effectiveDate,
     
        };
        // console.log(this.state.companyName)
        const axios = require("axios");
        this.v$.$validate()
        if(!this.v$.$error){
            alert('successful validation')
            axios
            .post("http://localhost:8080/vendorAssessment", newForm)
            .then((response) => {
              console.log(response);
              localStorage.setItem('edit',false);
                  alert("form submitted")
              // window.location.href = "http://localhost:8080/home"
            })
            .catch((error) => {
              console.log(error);
            });
        }else{
            alert('form failed')
        }
        // editing = localStorage.getItem('edit');
        // if (editing){
          // test = document.getElementById(form).querySelectorAll("[required]")
          // console.log(test)
          // localStorage.setItem('edit',false);
        // }
        // axios
        // .post("http://localhost:8080/vendorAssessment", newForm)
        // .then((response) => {
        //   console.log(response);
        //   localStorage.setItem('edit',false);
              // alert("form submitted")
        //   // window.location.href = "http://localhost:8080/home"
        // })
        // .catch((error) => {
        //   console.log(error);
        // });
        
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
  