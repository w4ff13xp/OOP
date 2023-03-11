<template>
  <div class="container">
      <div class="mb-4">
        <div class="h4 pb-2 my-4 border-bottom">New Vendor Assessment Form</div>

        <form>
          <div class="form-group">
            <label for="exampleInputEmail1">Company Name</label>
            <input
              type="text"
              class="form-control"
              id="companyName"
              aria-describedby="emailHelp"
              placeholder="Enter company name"
            />
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1"
              >Company Registration Number</label
            >
            <input
              type="text"
              class="form-control"
              id="companyRegistrationNumber"
              placeholder="Registration number"
            />
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Office Address</label>
            <input
              type="text"
              class="form-control"
              id="officeAddress"
              placeholder="Office Address"
            />
          </div>
          <div class="form-group">
            <label for="exampleInputEmail1">Telephone</label>
            <input
              type="text"
              class="form-control"
              id="companyName"
              aria-describedby="emailHelp"
              placeholder="Enter Telephone"
            />
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Fax</label>
            <input
              type="text"
              class="form-control"
              id="companyRegistrationNumber"
              placeholder="Enter Fax"
            />
          </div>
          <div class="form-check">
            <input
              type="checkbox"
              class="form-check-input"
              id="GSTRegistered"
            />
            <label class="form-check-label" for="exampleCheck1"
              >GST Registered</label
            >
          </div><br>
          <strong>Type of Business License</strong><br>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
            <label class="form-check-label" for="inlineRadio1">Sole proprietorship</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
            <label class="form-check-label" for="inlineRadio2">Limited Company</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3">
            <label class="form-check-label" for="inlineRadio3">Partnership Agreement</label>
          </div><br><br>
          <strong>Contact Person</strong><br><br>
          <div class="form-group">
            <label for="exampleInputEmail1">Name</label>
            <input
              type="text"
              class="form-control"
              id="companyName"
              aria-describedby="emailHelp"
              placeholder="Enter name"
            />
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1"
              >Telephone</label
            >
            <input
              type="text"
              class="form-control"
              id="companyRegistrationNumber"
              placeholder="Telephone number"
            />
          </div>
          <div class="form-group">
            <label for="exampleInputEmail1">Desgination</label>
            <input
              type="text"
              class="form-control"
              id="companyName"
              aria-describedby="emailHelp"
              placeholder="Enter Designation"
            />
          </div>
          <br><br>
          <button type="submit" class="btn btn-primary">Submit</button>
        </form>
      </div>
    </div>
</template>

<script>
export default {

}
</script>

<style>

</style>