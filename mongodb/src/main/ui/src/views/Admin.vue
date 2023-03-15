<template>
  <div class="container">
    
    <!-- Alerts here -->
    <div v-if="delete_success" class="alert alert-primary" role="alert">
        DELETE SUCCESSFUL: Vendor was successfully deleted!
    </div>
    <div v-if="delete_error" class="alert alert-danger" role="alert">
        DELETE ERROR: Vendor was not successfully deleted!
    </div>
    <!-- End alerts -->

    <div class="mb-4">
      <div class="h4 pb-2 my-4 border-bottom text-center">Companies</div>
      <!-- per company  -->
        <div class="table-responsive p-0">
            <table class="table align-items-center mb-0">
                <thead>
                    <tr>
                        <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7">
                            Vendor Name
                        </th>
                        <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                            Email
                        </th>
                        <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                            Access Rights
                        </th>
                        <th class="col-5 text-uppercase text-xs font-weight-bolder opacity-7 ps-2">
                            Change
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="vendor in vendors_chunked[current_page]" >
                        <td class="px-4 col-5">
                            <div class="text-sm text-wrap">
                                {{ vendor.username }}
                            </div>
                        </td>
                        <td class="text-sm text-wrap fs-6 col-5 px-2">
                            {{ vendor.email }}
                        </td>
                        <td class="text-sm text-wrap fs-6 col-5 px-2">
                            {{ vendor.accessRights }}
                        </td>
                        <td class="text-start px-3 col">
                            <div class="mx-auto mt-2">
                                <button
                                    type="button"
                                    class="btn btn-info btn-sm font-xxs px-3 ms-2 text-white"
                                    data-bs-toggle="modal"
                                    data-bs-target="#editModal"
                                    @click="$event=>
                                        passVendortoChange(
                                            vendor.username,
                                            vendor.email,
                                            vendor.accessRights
                                        )"
                                >
                                Edit
                                </button>
                                <button
                                    type="button"
                                    class="btn btn-danger btn-sm font-xxs px-3 ms-2 text-white"
                                    @click="deleteVendors(vendor.id)"
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
                            <input
                                type="text"
                                id="updated_vendor_access"
                                :value="accessTochange"
                                class="form-control"
                                aria-label="vendor-access"
                                aria-describedby="basic-addon1"
                                />
                        </div>
                        <input type="hidden" id="vendor_email" :value="vendorEmail"/>
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
<!-- END EDIT MODAL -->

      <!-- <div v-for="vendor in vendors">
          <div
            class="p-4 bg-info bg-opacity-10 border border-info rounded d-flex justify-content-between my-3"
          >

            <div class="myForm mx-5 d-flex">
              <div id="company-name" class="mx-5 w-25">Username: {{ vendor.email }}</div>
              <div id="accessRights">Current access right: {{ vendor.accessRights }}</div>
              <div class="form-check mx-5">
                <input
                  class="form-check-input"
                  type="radio"
                  name="flexRadioDefault"
                  id="flexRadioDefault1"
                  checked
                />
                <label class="form-check-label" for="flexRadioDefault1">
                  Vendor
                </label>
              </div>
              <div class="form-check mx-5">
                <input
                  class="form-check-input"
                  type="radio"
                  name="flexRadioDefault"
                  id="flexRadioDefault2"
                />
                <label class="form-check-label" for="flexRadioDefault2">
                  Admin
                </label>
              </div>
              <div class="form-check mx-5">
                <input
                  class="form-check-input"
                  type="radio"
                  name="flexRadioDefault"
                  id="flexRadioDefault1"
                />
                <label class="form-check-label" for="flexRadioDefault1">
                  Approver
                </label>
              </div>
              <div>
                <button class="btn btn-success" @click="updateVendors()">Update</button>
                <button class="btn btn-success" @click="deleteVendors(vendor.id)">Delete</button>
              </div>
            </div>

          </div>
      </div> -->
    </div>
  </div>
</template>

<script>



export default {
name:'Admin',
// props: ['vendors'],
  data() {
    return {
      vendors: [],
      vendors_chunked: [],
      delete_success: false,
      delete_error: false,
    //   CHANGE THIS IF U WANT TO DISPLAY MORE RESULTS PER PAGE
      results_per_page: 5,
    //   
      start_index: 0,
      end_index: 0,
      current_page: 0,
      vendorTochange: '',
      vendorEmail: '',
      accessTochange: '',
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

    passVendortoChange(vendorChange, email, accessChange){
        this.vendorTochange = vendorChange;
        this.vendorEmail= email;
        this.accessTochange = accessChange;
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

    deleteVendors(vendorID) {
    //   alert("Delete successful");
      console.log(vendorID);
      const axios = require('axios');
      axios.delete('http://localhost:8080/users/' + vendorID)
      .then((r)=>{
        console.log(r);
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
        let curr_vendor_email = document.getElementById('vendor_email').value;
        var vendor_obj = {
            vendor_name: new_vendor_name,
            vendor_access: new_vendor_access,
        };

        console.log("YIPPEEEEEEEEEEEEE")
        console.log(vendor_obj)
        // axios.put('http://localhost:8080/users')
        // .then((response) => {
        // console.log(response.data);
        
        // })
        // .catch ((error) => {
        // console.log(error);
        // })
        },
  },
  created() {
      this.getVendors();
  }
}
</script>

<style></style>