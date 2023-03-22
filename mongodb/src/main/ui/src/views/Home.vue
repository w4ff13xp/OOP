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
                <table class="table align-items-center mb-0">
                    <thead>
                        <tr>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7">
                                Form ID
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Form Name
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Date
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Approval Status
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Vendor
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Change
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="h in forms_chunked[current_page]" >
                            <td class="px-4 col-5">
                                <div class="text-sm text-wrap">
                                    {{ h.formCode }}
                                </div>
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ h.formName }}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ h.date }}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ h.formApproved}}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ h.companyName }}
                            </td>
                            <td class="text-start px-3 col">
                                <div class="mx-auto mt-2">
                                    <button
                                        type="button"
                                        class="btn btn-info btn-sm font-xxs px-3 ms-2 text-white"
                                        v-on:click="editV(h.formCode, h.formName)"    

                                    >
                                    Edit
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-danger btn-sm font-xxs px-3 ms-2 text-white"
                                        data-bs-toggle="modal"
                                        data-bs-target="#deleteModal"
                                        @click="$event=>
                                            pass(
                                                h.formCode,
                                                h.formName
                                            )"
                                    >
                                    Delete
                                    </button>
                                    <!-- <button class="btn btn-success" @click="updateVendors()">Update</button> -->
                                    <button
                                        type="button"
                                        class="btn btn-success btn-sm font-xxs px-3 ms-2 text-white"
                                    >
                                    Evaluate
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
    setPagination() {
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
        // console.log("MOOO2");
        // console.log(this.forms_chunked);
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

    editV(formid, formname){
        localStorage.setItem('edit', 'yes')
        localStorage.setItem('formid', formid)

        if(formname == "Vendor Assessment Form"){
            var redirect = "newvendorform"
        }else if(formname == "Performance Evaluation Form"){
            var redirect = "performanceevaluation"
            console.log(redirect)
        }else if(formname == "Health Evaluation Form"){
            var redirect = "Safety&HealthPreEvaluation"
            console.log(redirect)
        }
        window.location.href = `http://localhost:3000/${redirect}`
        // console.log(this.$refs.formid);
    },
    
    async getAllForms(){
        console.log('USERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR')
        console.log(JSON.parse(localStorage.getItem('specificuser')))

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
        // console.log(this.allForms.length)
        this.setPagination();
        
    }, 

    deleteForm(formName, formCode) {
    //  DELETE HEALTH FORM FROM FORMDB
      if (formName == 'Health Evaluation Form'){
        const axios = require('axios');
        axios.delete('http://localhost:8080/healthEvaluation/' + formCode)
        .then((r)=>{
            console.log(r);

            // DELETE FORM CODE FROM USERDB
            axios.get('http://localhost:8080/users/' + formCode)
            .then((r)=>{
                console.log(r.data.forms);
                console.log("USER OBJECT")
                this.user_obj = r.data
                console.log(this.user_obj)
                let curr_forms = r.data.forms;
                let form_to_remove = "HE" + formCode;
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
            axios.get('http://localhost:8080/users/' + formCode)
            .then((r)=>{
                console.log(r.data.forms);
                console.log("USER OBJECT")
                this.user_obj = r.data
                console.log(this.user_obj)
                let curr_forms = r.data.forms;
                let form_to_remove = "PE" + formCode;
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
            axios.get('http://localhost:8080/users/' + formCode)
            .then((r)=>{
                console.log(r.data.forms);
                console.log("USER OBJECT")
                this.user_obj = r.data
                console.log(this.user_obj)
                let curr_forms = r.data.forms;
                let form_to_remove = "VA" + formCode;
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