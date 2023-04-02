<template>
  <div class="container">
    
    <!-- Alerts here -->
    <div v-if="delete_success" class="alert alert-primary" role="alert">
        DELETE SUCCESSFUL: Vendor was successfully deleted!
    </div>
    <div v-if="delete_error" class="alert alert-danger" role="alert">
        DELETE ERROR: Vendor was not successfully deleted!
    </div>
    <div v-if="edit_success" class="alert alert-primary" role="alert">
        EDIT SUCCESSFUL: Vendor was successfully updated!
    </div>
    <div v-if="edit_error" class="alert alert-danger" role="alert">
        EDIT ERROR: Vendor was not successfully updated!
    </div>
    <div v-if="assign_success" class="alert alert-primary" role="alert">
        ASSIGN SUCCESSFUL: Form was successfully assigned!
    </div>
    <div v-if="assign_error" class="alert alert-danger" role="alert">
        ASSIGN ERROR: Form was not successfully assigned!
    </div>
    <div v-if="assign_error2" class="alert alert-danger" role="alert">
        ASSIGN ERROR: User already has existing form assigned!
    </div>
    
    
    <!-- End alerts -->

    <div class="mb-4">
      <div class="h4 pb-2 my-4 border-bottom text-center">Companies
        <button
            type="button"
            class="btn btn-primary btn-sm font-xxs px-3 ms-2 text-white"
            onclick= "window.location.href='http://localhost:3000/createnewacc'"
        >
        Create New Account
        </button>
      </div>
      <!-- per company  -->
        <div class="table-responsive p-0">
            <table class="table align-items-center mb-0">
                <thead>
                    <tr>
                        <th class="col-2 text-uppercase text-xs font-weight-bolder opacity-7">
                            Company Name
                        </th>
                        <th class="col-3 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                            Email
                        </th>
                        <th class="col-1 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                            Access Rights
                        </th>
                        <th class="col-4 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                            Location
                        </th>
                        <th class="col-7 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                            Change
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="vendor in vendors_chunked[current_page]" >
                        <td class="px-4 col-2">
                            <div class="text-sm text-wrap">
                                {{ vendor.username }}
                            </div>
                        </td>
                        <td class="text-sm text-wrap fs-6 col-2 px-2">
                            {{ vendor.email }}
                        </td>
                        <td class="text-sm text-wrap fs-6 col-4 px-2">
                            {{ vendor.accessRights }}
                        </td>
                        <td class="text-sm text-wrap fs-6 col-4 px-2">
                            <p v-for="l in vendor.locations">- {{l}}</p>
                        </td>
                        <td class="text-start px-3 col-4">
                            <div class="mx-auto mt-2">
                                <button title="Edit"
                                    type="button"
                                    class="btn btn-info btn-sm font-xxs px-3 ms-2 text-white"
                                    data-bs-toggle="modal"
                                    data-bs-target="#editModal"
                                    @click="$event=>
                                        passVendortoChange(
                                            vendor.username,
                                            vendor.email,
                                            vendor.accessRights,
                                            vendor.id,
                                            vendor.locations,
                                            vendor.password,
                                            vendor.forms
                                        )"
                                ><i class="bi bi-pencil-square"></i>
                                
                                </button>
                                <button title="Delete"
                                    type="button"
                                    class="btn btn-danger btn-sm font-xxs px-3 ms-2 text-white"
                                    data-bs-toggle="modal"
                                    data-bs-target="#deleteModal"
                                    @click="$event=>
                                        passVendortoChange(
                                            vendor.username,
                                            vendor.email,
                                            vendor.accessRights,
                                            vendor.id,
                                            vendor.locations,
                                            vendor.password,
                                            vendor.forms
                                        )"
                                ><i class="bi bi-trash"></i>
                                
                                </button>
                                <!-- <button class="btn btn-success" @click="updateVendors()">Update</button> -->
                                <button title="Assign Form"
                                    type="button"
                                    class="btn btn-warning btn-sm font-xxs px-3 ms-2 text-white"
                                    data-bs-toggle="modal"
                                    data-bs-target="#assignModal"
                                    @click="$event=>
                                        passVendortoChange(
                                            vendor.username,
                                            vendor.email,
                                            vendor.accessRights,
                                            vendor.id,
                                            vendor.locations,
                                            vendor.password,
                                            vendor.forms
                                        )"
                                >
                                <i class="bi bi-hand-index"></i>
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
            <li class="page-item" v-for="(each_chunk, index) in vendors_chunked" 
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
<!-- START EDIT MODAL -->
        <div
            class="modal fade"
            id="editModal"
            tabindex="-1"
            role="dialog"
            aria-labelledby="exampleModalLabel"
            aria-hidden="true"
            >
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title id=exampleModalLabel">
                            Edit {{this.vendorTochange }}
                        </h5>
                        <button
                            type="button"
                            class="btn-close"
                            data-bs-dismiss="modal"
                            aria-label="Close"
                            ></button>
                    </div>
                    <div class="modal-body">
                        <div class="input-group mb-3">
                            <p style="padding-right: 8px;">Vendor Name: </p>
                            <input
                                type="text"
                                id="updated_vendor_name"
                                :value="vendorTochange"
                                class="form-control"
                                aria-label="vendor-name"
                                aria-describedby="basic-addon1"
                                />
                        </div>
                        <div class="input-group mb-3">

                        <!-- <label for="updated_vendor_access">Access Right</label> -->
                        <p style="padding-right: 17px;">Access Right: </p>
                        <select id="updated_vendor_access" v-model="accessTochange" style="border: 1px black solid; border-radius: 5px; padding: 5px;">
                        <option value="Admin">Admin</option>
                        <option value="Approver">Approver</option>
                        <option value="Vendor">Vendor</option>
                        </select>                     
                        </div>

                        <div class="input-group mb-3">
                            <p style="padding-right: 45px;">Location: </p>
                            <select id="updated_loc" v-model="loc" style="border: 1px black solid; border-radius: 5px; padding: 5px;" multiple>
                            <option value="Singapore">Singapore</option>
                            <option value="Malaysia">Malaysia</option>
                            <option value="USA">USA</option>
                            </select>
                        </div>

                        <input type="hidden" id="vendor_id" :value="vendorid"/>
                        <input type="hidden" id="loc" :value="loc"/>
                        <input type="hidden" id="pwd" :value="pwd"/>

                    </div>
                    <div class="modal-footer">
                    <button
                        type="button"
                        class="btn btn-secondary text-white"
                        data-bs-dismiss="modal"
                        id="button_close"
                    >
                    Close
                    </button>
                    <button
                        type="button"
                        class="btn bg-gradient-custom px-3 d-flex justify-content-center"
                        @click="$event=>updateVendors()"
                        data-bs-dismiss="modal"
                        >
                    Save changes
                    </button>
                </div>
                </div>

            </div>
        </div>
        <!-- End Edit Modal -->
<!-- START Assign MODAL -->
        <div
            class="modal fade"
            id="assignModal"
            tabindex="-1"
            role="dialog"
            aria-labelledby="exampleModalLabel"
            aria-hidden="true"
            >
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title id=exampleModalLabel">
                            Assign Forms
                        </h5>
                        <button
                            type="button"
                            class="btn-close"
                            data-bs-dismiss="modal"
                            aria-label="Close"
                            ></button>
                    </div>
                    <div class="modal-body">
                        <div>
                            <h6 style="text-decoration: underline;">
                                Vendor Details:
                            </h6>
                                <p style="padding-right: 8px;">Vendor Name: {{ vendorTochange }}</p>
                                <p style="padding-right: 17px;">Access Right: {{ accessTochange }}</p>
                                <p style="padding-right: 45px;">Location: {{ loc }}</p>
                                <p style="padding-right: 45px;">Forms: {{ this.formDisplay }}</p>

                                <input type="hidden" id="vendor_id" :value="vendorid"/>
                                <input type="hidden" id="loc" :value="loc"/>
                                <input type="hidden" id="pwd" :value="pwd"/>
                        </div>
                        <div>
                            <h6 style="text-decoration: underline;">
                            Forms:
                            </h6>
                            <div class="input-group mb-3">
                                <p style="padding-right: 10px;">Form Options: </p>
                                <select id="forms" style="border: 1px black solid; border-radius: 5px; padding: 5px;">
                                <option value="Performance Evaluation Form">Performance Evaluation Form</option>
                                <option value="Pre Evaluation Form">Pre Evaluation Form</option>
                                <option value="Vendor Assessment Form">Vendor Assessment Form</option>
                                </select>
                            </div>
                            <div class="input-group mb-3">
                                <p style="padding-right: 25px;">Due Date: </p>
                                <input type="text" id="due_date" :value="this.duedate"/>
                            </div>

                        </div>
                    </div>
                    <div class="modal-footer">
                    <button
                        type="button"
                        class="btn btn-secondary text-white"
                        data-bs-dismiss="modal"
                        id="button_close"
                    >
                    Close
                    </button>
                    <button
                        type="button"
                        class="btn bg-gradient-custom px-3 d-flex justify-content-center"
                        @click="$event=>assignForms()"
                        data-bs-dismiss="modal"
                        >
                    Assign
                    </button>
                </div>
                </div>

            </div>
        </div>
        <!-- End Assign Modal -->
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
                    Are you sure you want to delete <b>{{ vendorTochange }}</b
                    >?
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
                    @click="deleteVendors(vendorid, vendorid)"
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



export default {
name:'Admin',
  data() {
    return {
      vendors: [],
      vendors_chunked: [],
      delete_success: false,
      delete_error: false,
      edit_success: false,
      edit_error: false,
      assign_success: false,
      assign_error: false,
      assign_error2: false,

    //   CHANGE THIS IF U WANT TO DISPLAY MORE RESULTS PER PAGE
      results_per_page: 5,
    //   
      start_index: 0,
      end_index: 0,
      current_page: 0,
      vendorTochange: '',
      vendorEmail: '',
      accessTochange: '',
      vendorid: '',
      loc: [],
      pwd: '',
      forms: [],
      duedate:'',
      dateIn:'',
      formDisplay: [],

    }
  },
  methods: {
    setPagination() {
        this.num_page = (this.vendors).length / this.results_per_page;
        console.log("PAGINATION: " + this.num_page)
        for (let i=0; i < this.num_page; i++){
            if (this.num_page <= 1){
                this.start_index = 0;
                this.end_index = this.vendors.length;
            } else {
                this.start_index = i * this.results_per_page;
                this.end_index = (i+1) * this.results_per_page - 1;
            }
            let indiv_chunks = this.vendors.slice(
                this.start_index,
                this.end_index + 1
            );
            this.vendors_chunked.push(indiv_chunks);
            // console.log("here", this.start_index, this.end_index)
            console.log("MOOOOO");
            console.log(this.vendors_chunked);
        }
        console.log("MOOO2");
        console.log(this.vendors_chunked);
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
        if (this.current_page < this.vendors_chunked.length - 1){
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

    passVendortoChange(vendorChange, email, accessChange, id, loc, p, f){
        this.vendorTochange = vendorChange;
        this.vendorEmail= email;
        this.accessTochange = accessChange;
        this.vendorid = id;
        this.pwd = p;
        this.loc = loc;
        this.forms = f;
        this.formDisplay = [];

        if (f.length != 0){
            for (var forms in f){
                console.log(f[forms])
                if (f[forms][0] == 'H'){
                    this.formDisplay.push("Performance Evaluation Form ")
                }
                else if (f[forms][0] == 'V'){
                    this.formDisplay.push("Vendor Assessment Form ")
                }
                else if (f[forms][0] == 'P'){
                    this.formDisplay.push("Pre Evaluation Form ")
                }
            }
        }
        else {
            this.formDisplay = "No Forms Assigned"
        }
        

    },

    async getDueDate(){
        // Create a new date object with the current date
        const currentDate = new Date();

        // Use the setDate() method to set the date to 14 days ahead
        currentDate.setDate(currentDate.getDate() + 14);

        // The new date is now 7 days ahead of the current date
        console.log("CURRDATE",currentDate);
        const formattedDate = currentDate.toLocaleDateString('en-US');
        this.dateIn = currentDate;
        this.duedate = formattedDate;
    },

    async getVendors() {
        try {
            const axios = require('axios');

            await axios.get('http://localhost:8080/users')
            .then((response) => {
                console.log(response.data);
                this.vendors = response.data
                console.log("AYAYAY")
                console.log(this.vendors)
                this.setPagination();
                console.log("CALLING PAGINATION")
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
    },

    deleteVendors(vendorID, formCode) {
    //   alert("Delete successful");
      console.log(vendorID);
      const axios = require('axios');
      axios.delete('http://localhost:8080/users/' + vendorID)
      .then((r)=>{
        console.log(r);

        // DELETE HEALTH FORM 
        let temp = "HE" + formCode
        axios.delete('http://localhost:8080/healthEvaluation/' + temp)
        .then((r)=>{
            console.log(r);
            // location.reload();
            // this.delete_success = true;
        })
        .catch((e)=>{
            console.log(e);
            // this.delete_error = true;
        })

        // DELETE PRE FORM 
        let temp2 = "PE" + formCode

        axios.delete('http://localhost:8080/preEvaluation/' + temp2)
        .then((r)=>{
            console.log(r);
            // location.reload();
            // this.delete_success = true;
        })
        .catch((e)=>{
            console.log(e);
            // this.delete_error = true;
        })

        // DELETE VENDOR ASSESSMENT FORM 
        let temp3 = "VA" + formCode

        axios.delete('http://localhost:8080/vendorAssessment/' + temp3)
        .then((r)=>{
            console.log(r);
            // location.reload();
            // this.delete_success = true;
        })
        .catch((e)=>{
            console.log(e);
            // this.delete_error = true;
        })
        location.reload();
        this.delete_success = true;
      })
      .catch((e)=>{
        console.log(e);
        this.delete_error = true;
      })
    },

    updateVendors() {
        const axios = require('axios');
        let new_vendor_name = document.getElementById('updated_vendor_name').value;
        let new_vendor_access = document.getElementById('updated_vendor_access').value;
        let vid = document.getElementById('vendor_id').value;

        let e = this.vendorEmail;
        let p = document.getElementById('pwd').value;
        let loc = document.getElementById('loc').value;
        // console.log("LOC", loc)

        var vendor_obj = {
            id: vid,
            email: e,
            username: new_vendor_name,
            password: p,
            accessRights: new_vendor_access,
            locations: JSON.parse(JSON.stringify(this.loc)),
            forms: JSON.parse(JSON.stringify(this.forms)),
        }; 

        console.log("YIPPEEEEEEEEEEEEE")
        console.log(vendor_obj)
        axios.put('http://localhost:8080/users', vendor_obj)
        .then((response) => {
        console.log(response.data);
        location.reload();
        this.edit_success = true;
        
        })
        .catch ((error) => {
        console.log(error);
        this.edit_error = true;
        })
        },

        assignForms() {
        const axios = require('axios');
        let form = document.getElementById('forms').value;
        let vendor_name = document.getElementById('updated_vendor_name').value;
        let id = document.getElementById('vendor_id').value;
        let dd = new Date(document.getElementById('due_date').value)
        console.log("DUEDATE",dd)

        // HEALTH EVAL FORM
        if (form == 'Performance Evaluation Form'){

            var temp_obj = {
                deadline: dd,
                formName:form,
                status: "incomplete",
                companyName: vendor_name,
                formCode:"HE" + id,
            };

            axios.post('http://localhost:8080/healthEvaluation', temp_obj)
            .then((response) => {
            console.log(response.data);            
            })
            .catch ((error) => {
            console.log(error);
            this.assign_error = true;
            })

            let updated_form = this.forms
            let formCode = temp_obj['formCode']

            
            if (this.forms != null && updated_form.includes(formCode)){
                console.log("FORM ALR EXISTS")
                this.assign_error2 = true;
                return
            } else{
                if (this.forms != null){
                    updated_form.push(formCode)
                    console.log('FORM CODE', updated_form)
                } else{
                    updated_form = [formCode]
                    console.log("FORM CODE", updated_form)
                }

            }

            let new_vendor_access = document.getElementById('updated_vendor_access').value;
            let vid = document.getElementById('vendor_id').value;

            let e = this.vendorEmail;
            let p = document.getElementById('pwd').value;
            let loc = document.getElementById('loc').value;

            var vendor_obj = {
                id: id,
                email: e,
                username: vendor_name,
                password: p,
                accessRights: new_vendor_access,
                locations: JSON.parse(JSON.stringify(this.loc)),
                forms: updated_form,
            };

            axios.put('http://localhost:8080/users', vendor_obj)
            .then((response) => {
            console.log(response.data);
            location.reload();
            this.assign_success = true;
            
            })
            .catch ((error) => {
            console.log(error);
            this.assign_error = true;
            })
        }

        // PRE EVAL FORM
        if (form == 'Pre Evaluation Form'){

            var temp_obj = {
                deadline: dd,
                formName:form,
                status: "incomplete",
                companyName: vendor_name,
                formCode:"PE" + id,
            };

            axios.post('http://localhost:8080/preEvaluation', temp_obj)
            .then((response) => {
            console.log(response.data);
            })
            .catch ((error) => {
            console.log(error);
            this.assign_error = true;
            })

            let updated_form = this.forms
            let formCode = temp_obj['formCode']

            if (this.forms != null && updated_form.includes(formCode)){
                console.log("FORM ALR EXISTS")
                this.assign_error2 = true;
                return
            } else{
                if (this.forms != null){
                    updated_form.push(formCode)
                } else{
                    updated_form = [formCode]
                }
            }

            let new_vendor_access = document.getElementById('updated_vendor_access').value;
            let vid = document.getElementById('vendor_id').value;

            let e = this.vendorEmail;
            let p = document.getElementById('pwd').value;
            let loc = document.getElementById('loc').value;

            var vendor_obj = {
                id: id,
                email: e,
                username: vendor_name,
                password: p,
                accessRights: new_vendor_access,
                locations: JSON.parse(JSON.stringify(this.loc)),
                forms: updated_form
            };

            axios.put('http://localhost:8080/users', vendor_obj)
            .then((response) => {
            console.log(response.data);
            location.reload();
            this.assign_success = true;
            
            })
            .catch ((error) => {
            console.log(error);
            this.assign_error = true;
            })
        }

        // VENDOR ASSESSMENT FORM
        if (form == 'Vendor Assessment Form'){


            var temp_obj = {
                deadline: dd,
                formName:form,
                status: "incomplete",
                companyName: vendor_name,
                formCode:"VA" + id,
            };

            axios.post('http://localhost:8080/vendorAssessment', temp_obj)
            .then((response) => {
            console.log(response.data);
            })
            .catch ((error) => {
            console.log(error);
            this.assign_error = true;
            })

            let updated_form = this.forms
            let formCode = temp_obj['formCode']

            if (this.forms != null && updated_form.includes(formCode)){
                console.log("FORM ALR EXISTS")
                this.assign_error2 = true;
                return
            } else{
                if (this.forms != null){
                    updated_form.push(formCode)
                } else{
                    updated_form = [formCode]
                }
            }

            let new_vendor_access = document.getElementById('updated_vendor_access').value;
            let vid = document.getElementById('vendor_id').value;

            let e = this.vendorEmail;
            let p = document.getElementById('pwd').value;
            let loc = document.getElementById('loc').value;

            var vendor_obj = {
                id: id,
                email: e,
                username: vendor_name,
                password: p,
                accessRights: new_vendor_access,
                locations: JSON.parse(JSON.stringify(this.loc)),
                forms: updated_form
            };

            axios.put('http://localhost:8080/users', vendor_obj)
            .then((response) => {
            console.log(response.data);
            location.reload();
            this.assign_success = true;
            
            })
            .catch ((error) => {
            console.log(error);
            this.assign_error = true;
            })
        }
        
        },
  },
  created() {
      this.getVendors();
      this.getDueDate();
  }
}
</script>

<style></style>