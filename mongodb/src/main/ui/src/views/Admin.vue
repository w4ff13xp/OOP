<template>
  <div class="container">
    <div class="mb-4">
      <div class="h4 pb-2 my-4 border-bottom">Companies</div>
      <!-- per company  -->
      <div v-for="vendor in vendors">
          <div
            class="p-4 bg-info bg-opacity-10 border border-info rounded d-flex justify-content-between my-3"
          >

            <div class="myForm mx-5 d-flex">
              <div id="company-name" class="mx-5 w-50">{{ vendor.username }}</div>
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
            </div>

            <div>
              <svg
                xmlns="http://www.w3.org/2000/svg"
                width="16"
                height="16"
                fill="currentColor"
                class="bi bi-trash3"
                viewBox="0 0 16 16"
              >
                <path
                  d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"
                />
              </svg>
            </div>
          </div>
      </div>









    </div>
  </div>
</template>

<script>
export default {
name:'Admin',
// props: ['vendors'],
  data() {
    return {
      vendors: []
    }
  },
  methods: {
    getVendors() {

      const axios = require('axios');

      axios.get('http://localhost:8080/vendors')
      .then((response) => {
        console.log(response.data);
        this.vendors = response.data
        console.log("AYAYAY")
        console.log(this.vendors)
      })
      .catch ((error) => {
        console.log(error);
      })
    }
  },
  created() {
      this.getVendors();
  }
}
</script>

<style></style>