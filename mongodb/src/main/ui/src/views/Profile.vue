<template>
    <div class="container-fluid">
      <div
        class="mt-4 page-header min-height-300 border-radius-xl"

      >
        <span class="mask bg-gradient-success opacity-6"></span>
      </div>
      <div class="border rounded m-5 p-5">
        <div class="row gx-4">

          <div class="col-auto my-auto">
            <div class="h-100">
              <h5 class="mb-1 text-center">My Profile</h5>
            </div>
          </div>
          <div
            class="mx-auto mt-3 col-lg-4 col-md-6 my-sm-auto ms-sm-auto me-sm-0"
          ></div>
        </div>
        <div class="row mt-4">
          <div class="col-auto">
            Username: {{ username }}
          </div>
        </div>
        <div class="row mt-4">
          <div class="col-auto">
            Email: {{ email }}
          </div>
        </div>
        <div class="row mt-4">
          <div class="col-auto">
            Access Rights: {{ accessRights }}
          </div>
        </div>
        <div class="row mt-4">
          <div class="col-auto">
            Locations:
            <ul>
              <li v-for="loc in locations">
              {{ loc }}</li>
            </ul>
          </div>
        </div>
        <div class="row mt-4">
          <div class="col-auto">
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#editModal">Edit Profile</button>
          </div>
        </div>
      </div>

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
                            Edit Profile
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
                            <p style="padding-right: 8px;">Username: </p>
                            <input
                                type="text"
                                id="updated_username"
                                v-model="username"
                                class="form-control"
                                aria-label="vendor-name"
                                aria-describedby="basic-addon1"
                                />
                        </div>
                        <div class="input-group mb-3">

                        <!-- <label for="updated_vendor_access">Access Right</label> -->
                        <p style="padding-right: 17px;">Access Right: </p>
                        <select id="updated_access_rights" v-model="accessRights" style="border: 1px black solid; border-radius: 5px; padding: 5px;">
                        <option value="Admin">Admin</option>
                        <option value="Approver">Approver</option>
                        <option value="Vendor">Vendor</option>
                        </select>                     
                        </div>

                        <div class="input-group mb-3">
                            <p style="padding-right: 45px;">Location: </p>
                            <select id="updated_loc" v-model="locations" style="border: 1px black solid; border-radius: 5px; padding: 5px;" multiple>
                            <option value="Singapore">Singapore</option>
                            <option value="Malaysia">Malaysia</option>
                            <option value="USA">USA</option>
                            </select>
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
                        @click="updateVendors"
                        data-bs-dismiss="modal"
                        >
                    Save changes
                    </button>
                </div>
                </div>

            </div>
        </div>
    </div>

    
  </template>

  <script>

  export default {
    name: 'Profile',
    data() {
      return {
        email: "",
        username: "",
        accessRights: "",
        locations: []
      }
    },
    methods: {
      updateVendors() {
        const axios = require('axios');
        var vendor_obj = {
                id: JSON.parse(localStorage.getItem('specificuser'))['id'],
                email: JSON.parse(localStorage.getItem('specificuser'))['email'],
                username: document.getElementById('updated_username').value,
                password: JSON.parse(localStorage.getItem('specificuser'))['password'],
                accessRights: document.getElementById('updated_access_rights').value,
                locations: document.getElementById('updated_loc').value,
                forms: JSON.parse(localStorage.getItem('specificuser'))['forms'],
            };

            console.log(vendor_obj)

            axios.put('http://localhost:8080/users', vendor_obj)
            .then((response) => {
            console.log(response.data);
            location.reload();      
            })
            .catch ((error) => {
            console.log(error);
            })
          }
    },

    mounted() {
      console.log(JSON.parse(localStorage.getItem('specificuser')))
      this.accessRights = JSON.parse(localStorage.getItem('specificuser'))['accessRights'];
      this.username = JSON.parse(localStorage.getItem('specificuser'))['username'];
      this.email = JSON.parse(localStorage.getItem('specificuser'))['email'];
      this.locations = JSON.parse(localStorage.getItem('specificuser'))['locations'];

    }
  }
  </script>
  
  <style>
  
  </style>