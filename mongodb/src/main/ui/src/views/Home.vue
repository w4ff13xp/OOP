<template>     
    <div class="container">
        <!-- ALERTS -->
        <div v-if="delete_success" class="alert alert-primary" role="alert">
        DELETE SUCCESSFUL: Form was successfully deleted!
        </div>
        <div v-if="delete_error" class="alert alert-danger" role="alert">
            DELETE ERROR: Form was not successfully deleted!
        </div>
        <div class="mb-4">
          <div class="h4 pb-2 my-4 border-bottom text-center">Forms</div>
            <div class="table-responsive p-0">
                <table class="table align-items-center mb-0" id="homeTable">
                    <thead>
                        <tr>
                            <th class="col-2 text-uppercase text-xs text-blue font-weight-bolder opacity-7 " @click="sortTable(0)">
                                Vendor 
                            </th>
                            <!-- <th class="col-5 text-uppercase text-xs text-blue font-weight-bolder opacity-7" @click="sortTable(1)">
                                Form ID
                            </th> -->
                            <th class="col-2 text-uppercase text-xs text-blue font-weight-bolder opacity-7 " @click="sortTable(2)">
                                Form Name
                            </th>
                            <th class="col-2 text-uppercase text-xs font-weight-bolder opacity-7 ps-2" @click="sortTable(3)">
                                Deadline
                            </th>
                            <th class="col-2 text-uppercase text-xs text-green font-weight-bolder opacity-7" @click="sortTable(4)">
                                Status
                            </th>

                            <th class="col-2 text-uppercase text-xs text-green font-weight-bolder opacity-7" >
                                Actions
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="h in forms_chunked[current_page]" >
                            <td class="text-sm text-wrap fs-6 col-2 px-2">
                                    {{ h.companyName }}
                            </td>
                            <!-- <td class="px-4 col-5">
                                <div class="text-sm text-wrap">
                                    {{ h.formCode }}
                                </div>
                            </td> -->
                            <td class="text-sm text-wrap fs-6 col-2 px-2">
                                    {{ h.formName }}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-2 px-2">
                                    {{getFormattedDate(h.deadline)  }}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-2">
                                <span v-html="getStatus(h.status)"></span>
                            </td>

                            <td class="text-sm text-wrap fs-6 col-2" >
                                <div class="mx-auto mt-2">  
                                    <button
                                        type="button"
                                        class="btn btn-danger btn-sm font-xxs px-3 ms-2 text-white"
                                        v-if="this.user_access == 'Admin'"
                                        data-bs-toggle="modal"
                                        data-bs-target="#deleteModal"
                                        @click="$event=>
                                            pass(
                                                h.formCode,
                                                h.formName,
                                                
                                            )"
                                    >
                                    Delete
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-info btn-sm font-xxs  text-white"
                                        v-if="this.user_access == 'Vendor' && (h.status != 'approved' && h.status != 'pendingApproval') "
                                        v-on:click="editV(h.formCode, h.formName)"    

                                    >
                                    Edit
                                    </button>
                                    <p v-if="this.user_access == 'Vendor' && (h.status == 'approved' || h.status == 'pendingApproval')">
                                        No available actions!
                                    </p>
                                    <button
                                        type="button"
                                        class="btn btn-primary btn-sm font-xxs px-3 ms-2 text-white"
                                        v-if="this.user_access == 'Admin' && h.status =='pendingEvaluation'"
                                        @click="approve(h.formCode, h.formName)"
                                    >
                                    Evaluate
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-primary btn-sm font-xxs px-3 ms-2 text-white"
                                        v-if="this.user_access == 'Admin' && h.status =='approved'"
                                        @click="approve(h.formCode, h.formName)"
                                    >
                                    Print
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-info btn-sm font-xxs px-3 ms-2 text-white"
                                        v-if="this.user_access == 'Approver'"
                                        @click="approve(h.formCode, h.formName)"
                                    >
                                    Approve/Reject
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-info btn-sm font-xxs px-1 ms-2 text-white"
                                        v-if="h.status == 'incomplete' && this.user_access == 'Admin'"
                                        @click="email(h.formCode, h.companyName, h.formName, h.deadline)"
                                    >
                                    Send Alert
                                    </button>

                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item">
            <a class="page-link" @click="$event=>prevPage()" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
            </a>
            </li>
            <li class="page-item" v-for="(each_chunk, index) in forms_chunked" 
                                    :key="index" 
                                    :aria-label=(index+1).toString()
                                    @click="$event => showPage(index)"
                                    onActivated="curr_page_checker(index)">
                <a class="page-link" href="#">{{index+1}}</a></li>
            
            <li class="page-item" next @click="$event=>nextPage()">
            <a class="page-link"  aria-label="Next">
                <span aria-hidden="true" >&raquo;</span>
            </a>
            </li>
        </ul>
        </nav>
        <!--delete company modal-->
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
                    Are you sure you want to delete <b>{{ formName }}</b
                    > from <b>{{ formCode }}</b>?
                  </p>
                </div>
                <div class="modal-footer">
                  <button
                    type="button"
                    class="btn bg-gradient-custom"
                    data-bs-dismiss="modal"
                  >
                    No, cancel
                  </button>
                  <button
                    type="button"
                    class="btn bg-gradient-custom btn-danger text-white"
                    data-bs-dismiss="modal"
                    @click="deleteForm(formName, formCode)"
                  >
                    Yes, Delete
                  </button>
                </div>
              </div>
            </div>
          </div>
          <!--end delete company modal-->
        </div>
    </div>
</template>

<script>
import moment from 'moment';

export default{
    name:'Home',

    data() {
    return {
      healthForms: [],
      preForms: [],
      vendorForms: [],
      allForms: [],
      formCode: '',
      formName: '',
      updated_forms: [],
      user_obj: {},
      delete_success: false,
      delete_error: false,
      user_access: '',
      user_id: '',
      forms_chunked: [],
    //   CHANGE THIS IF U WANT TO DISPLAY MORE RESULTS PER PAGE
      results_per_page: 10,
    //   
      start_index: 0,
      end_index: 0,
      current_page: 0,

    }
  },
  methods: {
    getStatus(status){
        if (status == "incomplete"){
            return "Incomplete!"
        }
        if (status == "pendingEvaluation"){
            return '<span style="color:orange">Pending Admin Evaluation!</span>'
        }
        if (status == "adminRejected"){
            return '<span style="color:red">Admin Rejected!</span>'
        }
        if (status == "pendingApproval"){
            return '<span style="color:orange">Pending Approval!</span>'
        }
        if (status == "approverRejected"){
            return '<span style="color:red">Approval Rejected!</span>'
        }
        if (status == "approved"){
            return '<span style="color:green">Approved!</span>'
        }
    },

    getFormattedDate(date) {
            return moment(date).format("DD-MM-YYYY")
        },

     sortTable(n) {
        var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
        table = document.getElementById("homeTable");
        switching = true;
        // Set the sorting direction to ascending:
        dir = "asc";
        /* Make a loop that will continue until
        no switching has been done: */
        while (switching) {
            // Start by saying: no switching is done:
            switching = false;
            rows = table.rows;
            /* Loop through all table rows (except the
            first, which contains table headers): */
            for (i = 1; i < (rows.length - 1); i++) {
            // Start by saying there should be no switching:
            shouldSwitch = false;
            /* Get the two elements you want to compare,
            one from current row and one from the next: */
            x = rows[i].getElementsByTagName("TD")[n];
            y = rows[i + 1].getElementsByTagName("TD")[n];
            /* Check if the two rows should switch place,
            based on the direction, asc or desc: */
            if (dir == "asc") {
                if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
                // If so, mark as a switch and break the loop:
                shouldSwitch = true;
                break;
                }
            } else if (dir == "desc") {
                if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
                // If so, mark as a switch and break the loop:
                shouldSwitch = true;
                break;
                }
            }
            }
            if (shouldSwitch) {
            /* If a switch has been marked, make the switch
            and mark that a switch has been done: */
            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
            switching = true;
            // Each time a switch is done, increase this count by 1:
            switchcount ++;
            } else {
            /* If no switching has been done AND the direction is "asc",
            set the direction to "desc" and run the while loop again. */
            if (switchcount == 0 && dir == "asc") {
                dir = "desc";
                switching = true;
            }
            }
        }
        },
    setPagination() {

        let temp = [];
        if (this.user_access == "Vendor"){
            for (var f in this.allForms){
                if (this.allForms[f]["formCode"].includes(this.user_id) ){
                    temp.push(this.allForms[f]);
                }
            }
        
            this.allForms = temp
        }
        if (this.user_access == "Approver"){
            for (var f in this.allForms){
                if (this.allForms[f]["status"] == "pendingApproval" || this.allForms[f]["status"] == "approved" || this.allForms[f]["status"] == "approverRejected"){
                    temp.push(this.allForms[f]);
                }
            }
            this.allForms = temp
        }


        this.num_page = (this.allForms).length / this.results_per_page;
        console.log("PAGINATION: " + this.num_page)
        for (let i=0; i < this.num_page; i++){
            if (this.num_page <= 1){
                this.start_index = 0;
                this.end_index = this.allForms.length;
            } else {
                this.start_index = i * this.results_per_page;
                this.end_index = (i+1) * this.results_per_page - 1;
            }
            let indiv_chunks = this.allForms.slice(
                this.start_index,
                this.end_index + 1
            );
            this.forms_chunked.push(indiv_chunks);
            // console.log("here", this.start_index, this.end_index)
            // console.log("MOOOOO");
            // console.log(this.forms_chunked);
        }
        console.log("MOOO2");
        console.log(this.forms_chunked);
    },

    curr_page_checker(page_num) {
        // console.log("MAMAMAMAMA")
        // console.log(page_num, this.current_page)
        if (page_num == this.current_page){
            return true;
        } else {
            return false;
        }
    },

    showPage(index){
        this.current_page = index;
        console.log("CURR PAGE ", this.current_page)
    },

    nextPage(){
        if (this.current_page < this.forms_chunked.length - 1){
            this.current_page += 1;
            console.log("CURR PAGE ", this.current_page)
        } else {
            console.log("No more pages to load");
        }
    },

    prevPage(){
        if (this.current_page != 0){
            this.current_page -= 1;
        } else {
            console.log("No more pages to load");
        }
    },

    addVendorForms(){
        this.allForms = this.allForms.concat(this.vendorForms)
    },

    addPreForms(){
        this.allForms = this.allForms.concat(this.preForms)
    },

    addHealthForms(){
        this.allForms = this.allForms.concat(this.healthForms)
    },

    async email(formCode, companyName, formName, longDate){
        console.log(formCode, companyName, formName, longDate)
        var email = formCode.slice(2)
        console.log(email)
        var shortDate = longDate.toString().slice(0, 10)

        try {
            const axios = require('axios');

            let newEmail = {
                recipient : email,
                msgBody : "Dear " + companyName + "," + "\n\nI hope this email finds you well. I am writing to remind you about the upcoming deadline for submitting the " + formName + ". The deadline for submission is " + shortDate + ", which is fast approaching.\n\nIf you have already submitted the required forms, please disregard this reminder. However, if you have not yet submitted the forms, please do so as soon as possible to avoid missing the deadline.\n\nIf you have any questions or concerns, please don't hesitate to reach out to us. We are here to assist you in any way we can.\n\nThank you for your attention to this matter.\n\nBest Regards,\nQuantum Leap\nEmail: grp1oop@gmail.com\nQuantum Leap Incorporation Pte Ltd\n114 Lavender Street CT Hub 2, 09-50 Lobby, #3, 338729",
                subject: "Reminder: Submission of Required Forms before Deadline"
            };

            await axios.post('http://localhost:8080/sendMail', newEmail)
            .then((response) => {
                console.log(response.data);
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);

        }

    },

    approve(formid, formname){
        localStorage.setItem('edit', 'yes')
        localStorage.setItem('formid', formid)
        

        if(formname == "Vendor Assessment Form"){
            var redirect = "newvendorform"
        }else if(formname == "Performance Evaluation Form"){
            var redirect = "adminapprove"
            console.log(redirect)
        }else if(formname == "Pre Evaluation Form"){
            var redirect = "Safety&HealthPreEvaluation"
            console.log(redirect)
        }
        window.location.href = `http://localhost:3000/${redirect}`
        // console.log(this.$refs.formid);

    },  

    editV(formid, formname){
        localStorage.setItem('edit', 'yes')
        localStorage.setItem('formid', formid)

        if(formname == "Vendor Assessment Form"){
            var redirect = "newvendorform"
        }else if(formname == "Pre Evaluation Form"){
            var redirect = "Safety&HealthPreEvaluation"
            console.log(redirect)
        }else if(formname == "Performance Evaluation Form"){
            var redirect = "performanceevaluation"
            console.log(redirect)
        }
        window.location.href = `http://localhost:3000/${redirect}`
        // console.log(this.$refs.formid);
    },
    
    async getAllForms(){
        console.log('USERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR')
        console.log(JSON.parse(localStorage.getItem('specificuser')))
        this.user_id = JSON.parse(localStorage.getItem('specificuser'))['id']
        this.user_access = JSON.parse(localStorage.getItem('specificuser'))['accessRights']
        console.log(this.user_access)

        // GETTING HEALTH FORMS
        try {
            const axios = require('axios');

            await axios.get('http://localhost:8080/healthEvaluation')
            .then((response) => {
                console.log(response.data);
                this.healthForms = response.data
                console.log("HEALTHFORMS")
                console.log(this.healthForms)
                this.addHealthForms();
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
        // GETTING PRE FORMS
        try {
            const axios = require('axios');

            await axios.get('http://localhost:8080/preEvaluation')
            .then((response) => {
                console.log(response.data);
                this.preForms = response.data
                console.log("PREFORMS")
                console.log(this.preForms)
                this.addPreForms();
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
        // GETTING VENDOR FORMS
        try {
            const axios = require('axios');

            await axios.get('http://localhost:8080/vendorAssessment')
            .then((response) => {
                console.log(response.data);
                this.vendorForms = response.data
                console.log("VENDORFORMS")
                console.log(this.vendorForms)
                this.addVendorForms();
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
        // CALLING PAGINATION
        console.log("CALLING PAGINATION")
        // console.log(this.allForms)
        this.setPagination();
        
    }, 

    deleteForm(formName, formCode) {

        var newStr = formCode.slice(2)

    //  DELETE HEALTH FORM FROM FORMDB
      if (formName == 'Performance Evaluation Form'){
        const axios = require('axios');
        axios.delete('http://localhost:8080/healthEvaluation/' + formCode)
        .then((r)=>{
            console.log(r);
            

            // DELETE FORM CODE FROM USERDB
            axios.get('http://localhost:8080/users/' + newStr)
            .then((r)=>{
                console.log(r.data.forms);
                console.log("USER OBJECT")
                this.user_obj = r.data
                console.log(this.user_obj)
                let curr_forms = r.data.forms;
                let form_to_remove = formCode;
                let index = curr_forms.indexOf(form_to_remove);
                curr_forms.splice(index, 1);
                console.log("UPDATED FORMS", curr_forms);
                this.updated_forms = curr_forms;

                this.user_obj['forms'] = this.updated_forms;
                console.log('UPDATED USER OBJ')
                console.log(this.user_obj)

                axios.put('http://localhost:8080/users', this.user_obj)
                .then((response) => {
                console.log(response.data);
                console.log("DELETED")
                location.reload();
                this.delete_success = true;                
            })
            .catch ((error) => {
            console.log(error);
            this.delete_error = true;
                })
            })    
        })
        .catch((e)=>{
            console.log(e);
            this.delete_error = true;
        })
      }
    //  DELETE PRE FORM FROM FORMDB
    if (formName == 'Pre Evaluation Form'){
        const axios = require('axios');
        axios.delete('http://localhost:8080/preEvaluation/' + formCode)
        .then((r)=>{
            console.log(r);

            // DELETE FORM CODE FROM USERDB
            axios.get('http://localhost:8080/users/' + newStr)
            .then((r)=>{
                console.log(r.data.forms);
                console.log("USER OBJECT")
                this.user_obj = r.data
                console.log(this.user_obj)
                let curr_forms = r.data.forms;
                let form_to_remove = formCode;
                let index = curr_forms.indexOf(form_to_remove);
                curr_forms.splice(index, 1);
                console.log("UPDATED FORMS", curr_forms);
                this.updated_forms = curr_forms;

                this.user_obj['forms'] = this.updated_forms;
                console.log('UPDATED USER OBJ')
                console.log(this.user_obj)

                axios.put('http://localhost:8080/users', this.user_obj)
                .then((response) => {
                console.log(response.data);
                console.log("DELETED")
                location.reload();
                this.delete_success = true;                
            })
            .catch ((error) => {
            console.log(error);
            this.delete_error = true;
                })
            })    
        })
        .catch((e)=>{
            console.log(e);
            this.delete_error = true;
        })
      }
    //  DELETE VENDOR ASSESSMENT FORM FROM FORMDB
    if (formName == 'Vendor Assessment Form'){
        const axios = require('axios');
        axios.delete('http://localhost:8080/vendorAssessment/' + formCode)
        .then((r)=>{
            console.log(r);

            // DELETE FORM CODE FROM USERDB
            axios.get('http://localhost:8080/users/' + newStr)
            .then((r)=>{
                console.log(r.data.forms);
                console.log("USER OBJECT")
                this.user_obj = r.data
                console.log(this.user_obj)
                let curr_forms = r.data.forms;
                let form_to_remove = formCode;
                let index = curr_forms.indexOf(form_to_remove);
                curr_forms.splice(index, 1);
                console.log("UPDATED FORMS", curr_forms);
                this.updated_forms = curr_forms;

                this.user_obj['forms'] = this.updated_forms;
                console.log('UPDATED USER OBJ')
                console.log(this.user_obj)

                axios.put('http://localhost:8080/users', this.user_obj)
                .then((response) => {
                console.log(response.data);
                console.log("DELETED")
                location.reload();
                this.delete_success = true;                
            })
            .catch ((error) => {
            console.log(error);
            this.delete_error = true;
                })
            })    
        })
        .catch((e)=>{
            console.log(e);
            this.delete_error = true;
        })
      }
    },

    pass(formCode, formName){
        this.formCode = formCode;
        this.formName = formName;

    },
    
  },
    created() {
      this.getAllForms();
  },
};

</script>

<style>

</style>