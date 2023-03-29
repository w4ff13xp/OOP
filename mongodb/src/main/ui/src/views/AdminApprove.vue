<template>
    <div class="container">
        <h1 class="text-center my-5">Approve Form</h1>
        <div>
            <table class="table table-hover table-bordered table-striped text-center">
            <thead>
                <tr><th>Field</th><th>Value</th></tr></thead>
            <tbody>
            <tr>
                <td>Attendance in Safety Meeting</td>
                <td>{{ attendance }}</td>
            </tr>
            <tr>
                <td>Tool Box Meeting</td>
                <td>{{ toolBox }}</td>
            </tr>
            <tr>
                <td>Compliance To Rules & Regulation</td>
                <td>{{ compliance }}</td>
            </tr>
            <tr>
                <td>Safety Promotional Activities</td>
                <td>{{ promotionalActivities }}</td>
            </tr>
            <tr>
                <td>Document Submission</td>
                <td>{{ submission }}</td>
            </tr>
            <tr>
                <td colspan="2" class="fw-bold">Score (I): {{ score1 }}</td>
            </tr>

            <tr>
                <td>Statutory Safety Training Course</td>
                <td>{{ trainingCourse }}</td>
            </tr>
            <tr>
                <td>Safety Trade Course</td>
                <td>{{ tradeCourse }}</td>
            </tr>
            <tr>
                <td>Mass Safety Talk</td>
                <td>{{ safetyTalk }}</td>
            </tr>
            <tr>
                <td>WSH Safety Coordinator/ Supervisor</td>
                <td>{{ wshsupervisor }}</td>
            </tr>
            <tr>
                <td>Other Safety Training</td>
                <td>{{ otherTraining }}</td>
            </tr>
            <tr>
                <td colspan="2" class="fw-bold">Score (II): {{ score2 }}</td>
            </tr>
            <tr>
                <td>Effort in Accident Prevention</td>
                <td>{{ effort }}</td>
            </tr>
            <tr>
                <td>Safe Work Practice/ Permit To Work</td>
                <td>{{ permitToWork }}</td>
            </tr>
            <tr>
                <td>Incident Severity &amp; Frequency Rate</td>
                <td>{{ frequencyRate }}</td>
            </tr>
            <tr>
                <td>Safety Offence</td>
                <td>{{ safetyOffence }}</td>
            </tr>
            <tr>
                <td>Safety Inspection And Rectification</td>
                <td>{{ safetyRectification }}</td>
            </tr>
            <tr>
                <td colspan="2" class="fw-bold">Score (III): {{ score3 }}</td>
            </tr>
            <tr>
                <td>Explosive Powered Tool/ Cutting Tool</td>
                <td>{{ cuttingTool }}</td>
            </tr>
            <tr>
                <td>Ladder</td>
                <td>{{ ladder }}</td>
            </tr>
            <tr>
                <td>Lifting Gear/ Appliance/ Machine</td>
                <td>{{ liftingGear }}</td>
            </tr>
            <tr>
                <td>Electrical Equipment/ Compressor</td>
                <td>{{ electricalEquipment }}</td>
            </tr>
            <tr>
                <td>Other Machineries</td>
                <td>{{ otherMachineries }}</td>
            </tr>
            <tr>
                <td colspan="2" class="fw-bold">Score (IV): {{ score4 }} </td>
            </tr>
            <tr>
            <td>Subcon Snr Mgt Commitment to HS</td>
            <td>{{ commitmentHS }}</td>
            </tr>
            <tr>
            <td>Compliance with PPE</td>
            <td>{{ ppecompliance }}</td>
            </tr>
            <tr>
            <td>Housekeeping &amp; Cleanliness at Site</td>
            <td>{{ siteCleanliness }}</td>
            </tr>
            <tr>
            <td>Housekeeping &amp; Cleanliness at Store</td>
            <td>{{ storeCleanliness }}</td>
            </tr>
            <tr>
            <td>Housekeeping &amp; Cleanliness at Quarter</td>
            <td>{{ quarterCleanliness }}</td>
            </tr>
            <tr>
            <td colspan="2" class="fw-bold">Score (V): {{ score5 }}</td>
            </tr>
            <tr>
            <td colspan="2">
                <h3>OVERALL SCORE: {{ overallScore }}</h3>
                <h3>Performance Evaluation: {{ performanceStandard }}</h3>
            </td>
            </tr>
            
            <tr><td colspan="2">Additional Comments: {{ comments }}</td></tr>
        </tbody>
        </table>

        </div>
        <!-- ALERTS -->
        <div v-if="approve_success" class="alert alert-primary" role="alert">
            APPROVE SUCCESSFUL: Form was successfully approved!
        </div>
        <div v-if="approve_error" class="alert alert-danger" role="alert">
            APPROVE ERROR: Form was not successfully approved!
        </div>
        <div v-if="reject_success" class="alert alert-primary" role="alert">
            REJECT SUCCESSFUL: Form was successfully rejected!
        </div>
        <div v-if="reject_error" class="alert alert-danger" role="alert">
            APPROVE ERROR: Form was not successfully rejected!
        </div>
        <!-- END ALERTS -->

        <div class="my-5 d-flex justify-content-between">
            <button type="button" class="btn btn-danger text-white" data-bs-toggle="modal" data-bs-target="#deleteModal">Reject</button>
            <button type="button" class="btn btn-primary text-white" @click="changeApproveStatus">Approve</button>
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
                    <textarea class="form-control border rounded" placeholder="Leave a comment here" id="rejectionReason" v-model="rejectionReason"></textarea>
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
                    @click="reject"
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
    approve_success: false,
    approve_error: false,
    reject_success: false,
    reject_error: false,
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

    rejectionReason: "",
    status: "",

}
},
methods: {
  
    checkFormCode(){
        console.log("FORM CODE")
        console.log(localStorage.getItem('formid'))

    },
    async getInputs(){
        try {
            const axios = require('axios');
            var formid = localStorage.getItem('formid')
            console.log(formid)
            await axios.get(`http://localhost:8080/healthEvaluation/${formid}`)
            .then((response) => {
                console.log(response.data);
                var data = response.data
                this.attendance = data.attendance
                this.toolBox = data.toolBox
                this.compliance = data.compliance
                this.promotionalActivities = data.promotionalActivities
                this.submission = data.submission
                this.score1 = data.score1

                this.trainingCourse= data.trainingCourse
                this.tradeCourse= data.tradeCourse
                this.safetyTalk= data.safetyTalk
                this.wshsupervisor= data.wshsupervisor
                this.otherTraining= data.otherTraining
                this.score2= data.score2
              console.log(this.wshsupervisor)
                this.effort= data.effort
                this.permitToWork= data.permitToWork
                this.frequencyRate= data.frequencyRate
                this.safetyOffence= data.safetyOffence
                this.safetyRectification= data.safetyRectification
                this.score3= data.score3

                this.cuttingTool= data.cuttingTool
                this.ladder= data.ladder
                this.liftingGear= data.liftingGear
                this.electricalEquipment= data.electricalEquipment
                this.otherMachineries= data.otherMachineries
                this.score4= data.score4

                this.commitmentHS= data.commitmentHS
                this.ppecompliance= data.ppecompliance
                this.siteCleanliness= data.siteCleanliness
                this.storeCleanliness= data.storeCleanliness
                this.quarterCleanliness= data.quarterCleanliness
                this.score5= data.score5

                this.overallScore=  data.overallScore
                this.performanceStandard= data.performanceStandard
                this.comments= data.comments

                this.safetyCoordinator= data.safetyCoordinator
                this.safetyCoordinatorSignature= data.safetyCoordinatorSignature
                this.safetyCoordinatorEvaluationDate= data.safetyCoordinatorEvaluationDate

                this.director= data.director
                this.directorSignature= data.directorSignature
                this.directorApprovalDate= data.directorApprovalDate

                this.status = data.status
                this.rejectionReason = data.rejectionReason
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
      },
      
      changeApproveStatus() {
        if (JSON.parse(localStorage.getItem('specificuser'))['accessRights'] == 'Admin'){
            const axios = require('axios');
            var formid = localStorage.getItem('formid')
            console.log(formid)
            var toUpdate = {
                formCode: formid,
                rejectionReason: this.rejectionReason,
                status: "pendingApproval"
            }
            axios.put(`http://localhost:8080/healthEvaluation/updateStatus`, toUpdate)
            .then((response) => {
                // alert("Update success")
                console.log(response.data)
                this.approve_success = true;
                window.location.href = "http://localhost:3000/home"
            })
            .catch ((error) => {
                // alert("Error")
                this.approve_error = true;
                console.log(error)
            })
        }
        if (JSON.parse(localStorage.getItem('specificuser'))['accessRights'] == 'Approver'){
            const axios = require('axios');
            var formid = localStorage.getItem('formid')
            console.log(formid)
            var toUpdate = {
                formCode: formid,
                rejectionReason: this.rejectionReason,
                status: "approved"
            }
            axios.put(`http://localhost:8080/healthEvaluation/updateStatus`, toUpdate)
            .then((response) => {
                // alert("Update success")
                console.log(response.data)
                this.approve_success = true;
                window.location.href = "http://localhost:3000/home"
            })
            .catch ((error) => {
                // alert("Error")
                this.approve_error = true;
                console.log(error)
            })
        }
            
      },
      reject() {
        if (JSON.parse(localStorage.getItem('specificuser'))['accessRights'] == 'Admin'){

            const axios = require('axios');
            var formid = localStorage.getItem('formid')
            console.log(formid)
            var toUpdate = {
                formCode: formid,
                rejectionReason: this.rejectionReason,
                status: "adminRejected"
            }
            axios.put(`http://localhost:8080/healthEvaluation/updateStatus`, toUpdate)
            .then((response) => {
                // alert("Reject success")
                console.log(response.data)
                this.reject_success = true;
                window.location.href = "http://localhost:3000/home"
            })
            .catch ((error) => {
                // alert("Error")
                this.reject_error = true;
                console.log(error)
            })
        }
        if (JSON.parse(localStorage.getItem('specificuser'))['accessRights'] == 'Approver'){
 

            const axios = require('axios');
            var formid = localStorage.getItem('formid')
            console.log(formid)
            var toUpdate = {
                formCode: formid,
                rejectionReason: this.rejectionReason,
                status: "approverRejected"
            }
            axios.put(`http://localhost:8080/healthEvaluation/updateStatus`, toUpdate)
            .then((response) => {
                // alert("Reject success")
                console.log(response.data)
                this.reject_success = true;
                window.location.href = "http://localhost:3000/home"
            })
            .catch ((error) => {
                // alert("Error")
                console.log(error)
                this.reject_error = true;
            })
        }
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