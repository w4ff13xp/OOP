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

    checkFormCode(){
        console.log("FORM CODE")
        console.log(localStorage.getItem('formid'))
    },


},
created() {
    this.checkFormCode();
    },
};

</script>

<style>

</style>