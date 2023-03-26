<template>
    <div class="container">
        <h1 class="text-center my-5">Approve Form</h1>
        <table class="table table-hover table-bordered table-striped text-center">
            <tr><th>Field</th><th>Value</th></tr>
            <tr><td>Attendance in Safety Meeting</td><td>5</td></tr>
            <tr><td>Tool Box Meeting</td><td>5</td></tr>
            <tr><td>Compliance To Rules & Regulation</td><td>5</td></tr>
            <tr><td>Safety Promotional Activities</td><td>5</td></tr>
            <tr><td>Document Submission</td><td>5</td></tr>
            <tr><td colspan=2 class="fw-bold">Score (I): 25</td></tr>
            
            <tr><td>Statutory Safety Training Course</td><td>5</td></tr>
            <tr><td>Safety Trade Course</td><td>5</td></tr>
            <tr><td>Mass Safety Talk</td><td>5</td></tr>
            <tr><td>WSH Safety Coordinator/ Supervisor</td><td>5</td></tr>
            <tr><td>Other Safety Training</td><td>5</td></tr>
            <tr><td colspan=2 class="fw-bold">Score (II): 25</td></tr>

            <tr><td>Effort in Accident Prevention</td><td>5</td></tr>
            <tr><td>Safe Work Practice/ Permit To Work</td><td>5</td></tr>
            <tr><td>Incident Severity & Frequency Rate</td><td>5</td></tr>
            <tr><td>Safety Offence</td><td>5</td></tr>
            <tr><td>Safety Inspection And Rectification</td><td>5</td></tr>
            <tr><td colspan=2 class="fw-bold">Score (III): 25</td></tr>

            <tr><td>Explosive Powered Tool/ Cutting Tool</td><td>5</td></tr>
            <tr><td>Ladder</td><td>5</td></tr>
            <tr><td>Lifting Gear/ Appliance/ Machine</td><td>5</td></tr>
            <tr><td>Electrical Equipment/ Compressor</td><td>5</td></tr>
            <tr><td>Other Machineries</td><td>5</td></tr>
            <tr><td colspan=2 class="fw-bold">Score (IV): 25</td></tr>

            <tr><td>Subcon Snr Mgt Commitment to HS</td><td>5</td></tr>
            <tr><td>Compliance with PPE</td><td>5</td></tr>
            <tr><td>Housekeeping & Cleanliness at Site</td><td>5</td></tr>
            <tr><td>Housekeeping & Cleanliness at Store</td><td>5</td></tr>
            <tr><td>Housekeeping & Cleanliness at Quarter</td><td>5</td></tr>
            <tr><td colspan=2 class="fw-bold">Score (V): 25</td></tr>
            
            <tr><td colspan=2><h3>OVERALL SCORE: 100%</h3><h3>Performance Evaluation: Good</h3></td></tr>
        </table>

        <div class="my-5 d-flex justify-content-between">
            <button type="button" class="btn btn-danger text-white" data-bs-toggle="modal" data-bs-target="#deleteModal">Reject</button>
            <button type="button" class="btn btn-primary text-white">Approve</button>
        </div>

        <div
            class="modal fade"
            tabindex="-1"
            id="deleteModal"
            role="dialog"
            aria-labelledby="exampleModalLabel"
            aria-hidden="true"
          >
            <div class="modal-dialog">
              <div class="modal-content">
                <div class="modal-header">
                  <h5 class="modal-title">Confirm Deletion</h5>
                  <button
                    type="button"
                    class="btn-close"
                    data-bs-dismiss="modal"
                    aria-label="Close"
                  ></button>
                </div>
                <div class="modal-body">
                  <p>
                    Are you sure you want to reject the form?
                  </p>
                  <div class="form-floating">
                    <p>Please state the reason(s) for rejection.</p>
                    <textarea class="form-control border rounded" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                  <button
                    type="button"
                    class="btn bg-gradient-custom border rounded"
                    data-bs-dismiss="modal"
                  >
                    No, cancel
                  </button>
                  <button
                    type="button"
                    class="btn bg-gradient-custom btn-danger text-white"
                    data-bs-dismiss="modal"
                  > <!--put @click here-->
                    Reject
                  </button>
                </div>
              </div>
            </div>
          </div>
    </div>
  </template>

  <script>
  export default {
    name:'AdminApprove',

data() {
return {


}
},
methods: {
  data() {
    return {
      // formCode: "formcode1",
      // formDate: "2023-03-07",
      // formName: "health evaluation",
      // formCompleted: false,
      // formApproved: false,
      // companyName: "Nike",

      attendance: 0,
      toolBox: 0,
      compliance: 0,
      promotionalActivities: 0,
      submission: 0,
      score1: 0,

      trainingCourse: 0,
      tradeCourse: 0,
      safetyTalk: 0,
      wshsupervisor: 0,
      otherTraining: 0,
      score2: 0,

      effort: 0,
      permitToWork: 0,
      frequencyRate: 0,
      safetyOffence: 0,
      safetyRectification: 0,
      score3: 0,

      cuttingTool: 0,
      ladder: 0,
      liftingGear: 0,
      electricalEquipment: 0,
      otherMachineries: 0,
      score4: 0,

      commitmentHS: 0,
      ppecompliance: 0,
      siteCleanliness: 0,
      storeCleanliness: 0,
      quarterCleanliness: 0,
      score5: 0,

      overallScore: 0,
      performanceStandard: "",
      comments: "",

      safetyCoordinator: "",
      safetyCoordinatorSignature: "",
      safetyCoordinatorEvaluationDate: "",

      director: "",
      directorSignature: "",
      directorApprovalDate: "",
    };
  },
    checkFormCode(){
        console.log("FORM CODE")
        console.log(localStorage.getItem('formid'))

    },
    async getInputs(){
        try {
            const axios = require('axios');
            var formid = localStorage.getItem('formid')
            console.log(formid)
            await axios.get(`http://localhost:8080/vendorAssessment/${formid}`)
            .then((response) => {
                console.log(response.data);
                var data = response.data
                this.companyName = data.companyName
                this.registrationNo =  data.registrationNo
                this.officeAddress =  data.officeAddress
                this.getRegistered =  data.getRegistered
                this.vendorTel =  data.vendorTel
                this.vendorFax =  data.vendorFax
          
                this.businessType =  data.businessType
                this.contactName =  data.contactName
                this.contactTel =  data.contactTel
                this.contactDesignation =  data.contactDesignation
                this.businessNature =  data.businessNature
                this.products =  data.products
          
                this.iso9001Certification= data.iso9001Certification
                this.accrediationOfLaboratory= data.accrediationOfLaboratory
                this.productCertification= data.productCertification
                this.resultsOfProductEvaluation= data.resultsOfProductEvaluation
                this.siteEvaluationResults= data.siteEvaluationResults
                this.resultsOfFirstDeal= data.resultsOfFirstDeal
                this.trackRecordReview= data.trackRecordReview

                this.evaluationOthers= data.evaluationOthers
                this.certificationBody= data.certificationBody
                this.accrediationBody= data.accrediationBody
                this.productMarkings= data.productMarkings
                this.resultOfEvaluation= data.resultOfEvaluation
          
                this.evaluatedBy= data.evaluatedBy
                this.approvedByDirector= data.approvedByDirector
                this.effectiveDate= data.effectiveDate
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
      }

},
created() {
    this.checkFormCode();
    this.getInputs();
    },
};

</script>

<style>

</style>