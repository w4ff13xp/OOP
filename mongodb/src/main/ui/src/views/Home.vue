<template>     
    <div class="container">
        <div class="mb-4">
          <div class="h4 pb-2 my-4 border-bottom text-center">Forms</div>
            <div class="table-responsive p-0">
                <table class="table align-items-center mb-0">
                    <thead>
                        <tr>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7">
                                Form Code
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Form Name
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Date
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Status
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Company
                            </th>
                            <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                                Change
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="h in healthForms" >
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
                                    add status (completed/approved etc)
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ h.companyName }}
                            </td>
                            <td class="text-start px-3 col">
                                <div class="mx-auto mt-2">
                                    <button
                                        type="button"
                                        class="btn btn-info btn-sm font-xxs px-3 ms-2 text-white"
                                        data-bs-toggle="modal"
                                        data-bs-target="#editModal"   
                                    >
                                    Edit
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-danger btn-sm font-xxs px-3 ms-2 text-white"    
                                    >
                                    Delete
                                    </button>
                                    <!-- <button class="btn btn-success" @click="updateVendors()">Update</button> -->
                                </div>
                            </td>
                        </tr>
                        <tr v-for="p in preForms" >
                            <td class="px-4 col-5">
                                <div class="text-sm text-wrap">
                                    {{ p.formCode }}
                                </div>
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ p.formName }}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ p.date }}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    add status (completed/approved etc)
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ p.companyName }}
                            </td>
                            <td class="text-start px-3 col">
                                <div class="mx-auto mt-2">
                                    <button
                                        type="button"
                                        class="btn btn-info btn-sm font-xxs px-3 ms-2 text-white"
                                        data-bs-toggle="modal"
                                        data-bs-target="#editModal"
                                        
                                    >
                                    Edit
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-danger btn-sm font-xxs px-3 ms-2 text-white"
                                    >
                                    Delete
                                    </button>
                                    <!-- <button class="btn btn-success" @click="updateVendors()">Update</button> -->
                                </div>
                            </td>
                        </tr>
                        <tr v-for="v in vendorForms" >
                            <td class="px-4 col-5">
                                <div class="text-sm text-wrap" >
                                    {{ v.formCode }}
                                </div>
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ v.formName }}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ v.date }}
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    add status (completed/approved etc)
                            </td>
                            <td class="text-sm text-wrap fs-6 col-5 px-2">
                                    {{ v.companyName }}
                            </td>
                            <td class="text-start px-3 col">
                                <div class="mx-auto mt-2">
                                    <button
                                        type="button"
                                        class="btn btn-info btn-sm font-xxs px-3 ms-2 text-white"
                                        v-on:click="editV(v.formCode, v.formName)"
                                    >
                                    Edit
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-danger btn-sm font-xxs px-3 ms-2 text-white"
                                        
                                    
                                    >
                                    Delete
                                    </button>
                                    <!-- <button class="btn btn-success" @click="updateVendors()">Update</button> -->
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
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
    
    //   vendors_chunked: [],
    //   CHANGE THIS IF U WANT TO DISPLAY MORE RESULTS PER PAGE
      results_per_page: 12,
    //   
      start_index: 0,
      end_index: 0,
      current_page: 0,

    }
  },
  methods: {
    editV(formid, formname){
        localStorage.setItem('edit', 'yes')
        localStorage.setItem('formid', formid)


        if(formname == "vendor assessment"){
            var redirect = "newvendorform"
        }
        window.location.href = `http://localhost:3000/${redirect}`
        // console.log(this.$refs.formid);
    },
    async getHealthforms() {
        console.log(JSON.parse(localStorage.getItem('specificuser')))
        try {
            const axios = require('axios');

            await axios.get('http://localhost:8080/healthEvaluation')
            .then((response) => {
                console.log(response.data);
                this.healthForms = response.data
                console.log("HEALTHFORMS")
                console.log(this.healthForms)
                // this.setPagination();
                // console.log("CALLING PAGINATION")
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
    },

    async getPreforms() {
        try {
            const axios = require('axios');

            await axios.get('http://localhost:8080/preEvaluation')
            .then((response) => {
                console.log(response.data);
                this.preForms = response.data
                console.log("PREFORMS")
                console.log(this.preForms)
                // this.setPagination();
                // console.log("CALLING PAGINATION")
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
    },

    async getVendorforms() {
        try {
            const axios = require('axios');

            await axios.get('http://localhost:8080/vendorAssessment')
            .then((response) => {
                console.log(response.data);
                this.vendorForms = response.data
                console.log("VENDORFORMS")
                console.log(this.vendorForms)
                // this.setPagination();
                // console.log("CALLING PAGINATION")
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
    },
    
  },
    created() {
      this.getHealthforms();
      this.getPreforms();
      this.getVendorforms();
  },
};

</script>

<style>

</style>