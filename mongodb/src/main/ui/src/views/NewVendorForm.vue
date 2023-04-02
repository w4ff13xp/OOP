<template>
  <div class="container-fluid" ref="printme">
    <!-- <form action="http://localhost:8080/home" method="post"> -->
    <!-- <form v-on:submit.prevent="addToAPI" id="form"> -->
      <form id="form">

      
    <!-- <Navigation></Navigation> -->
    <h2 id="title" class="text-center pt-3">
      NEW VENDOR FORM EVALUATION
    </h2>

    <div class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center mb-5">PART I: NEW VENDOR FORM</h4>
      <!-- <form action="customer/customerinput.php" method="post"> -->
        <div class="m-3 d-flex">
          <div class="d-flex w-100">
            <div class="form-check form-check-inline col-md-6">
              <label class="form-check-label"  for="inlineCompanyName">Company Name*</label>
              <input v-if="this.useraccess == 'Vendor'" style="width:90%" type="text" class="form-control" name="first" placeholder="Company's Name" v-model="state.companyName" >        
              <input v-else disabled style="width:90%" type="text" class="form-control" name="first" placeholder="Company's Name" v-model="state.companyName" >        

              <span class="text-danger" v-if="v$.companyName.$error">{{ v$.companyName.$errors[0].$message }}</span>
            </div>
            <div class="form-check form-check-inline col-md-6"> 
              <label class="form-check-label"  for="inlineCompanyName">Company Registration No.*</label>
              <input v-if="this.useraccess == 'Vendor'"  style="width:90%" type="number" class="form-control" name="second" placeholder="Company's Registration No." v-model="state.registrationNo" >        
              <input v-else disabled style="width:90%" type="number" class="form-control" name="second" placeholder="Company's Registration No." v-model="state.registrationNo" >        

              <span class="text-danger" v-if="v$.registrationNo.$error">{{ v$.registrationNo.$errors[0].$message }}</span>

            </div>   
          </div>
        </div>
        <div class="m-3 d-flex">
          <div class="d-flex justify-content-between w-100">
              <div class="form-check form-check-inline ">
                  <div>
                      <label class="form-check-label"  for="gstRegistered">GST Registered</label>
                  </div>
                  <div class="form-check form-check-inline">
                      <label class="form-check-label "  for="inlineRadio1">Yes</label>
                      <input v-if="this.useraccess == 'Vendor'" type="radio" class="form-check-input" name="third" id="inlineRadio1" value="true" v-model="state.getRegistered">        
                      <input v-else disabled type="radio" class="form-check-input" name="third" id="inlineRadio1" value="true" v-model="state.getRegistered">        

                  </div>
                  <div class="form-check form-check-inline">
                      <label class="form-check-label"  for="inlineRadio1">No</label>
                      <input v-if="this.useraccess == 'Vendor'" type="radio" class="form-check-input" name="third" id="inlineRadio1" value="false" v-model="state.getRegistered">        
                      <input v-else disabled type="radio" class="form-check-input" name="third" id="inlineRadio1" value="false" v-model="state.getRegistered">        
                  </div>
              <span class="text-danger" v-if="v$.getRegistered.$error">{{ v$.getRegistered.$errors[0].$message }}</span>

            </div>   
      
          </div>
        </div>
        <div class="m-3 d-flex">
          <div class="d-flex justify-content-between w-100">
            <div class="form-check form-check-inline col-md-6">
              <label class="form-check-label"  for="inlineCompanyName">Office Address</label>
              <input v-if="this.useraccess == 'Vendor'" style="width:90%" type="text" class="form-control" name="fourth" placeholder="1234 Main St" v-model="state.officeAddress">        
              <input v-else disabled style="width:90%" type="text" class="form-control" name="fourth" placeholder="1234 Main St" v-model="state.officeAddress">        

              <span class="text-danger" v-if="v$.officeAddress.$error">{{ v$.officeAddress.$errors[0].$message }}</span>
            </div>  
            <div class="form-check form-check-inline col-md-3" >
              <label class="form-check-label" for="inputPhone">Tel</label>
              <input v-if="this.useraccess == 'Vendor'" style="width:75%" type="number" class="form-control" name="fifth" placeholder="9123 4567" v-model="state.vendorTel">
              <input v-else disabled style="width:75%" type="number" class="form-control" name="fifth" placeholder="9123 4567" v-model="state.vendorTel">
              
              <span class="text-danger" v-if="v$.vendorTel.$error">{{ v$.vendorTel.$errors[0].$message }}</span>

            </div>
            <div class="form-check form-check-inline col-md-3">
              <label class="form-check-label" for="inputPhone">Fax</label>
              <input v-if="this.useraccess == 'Vendor'" style="width:75%" type="number" class="form-control" name="sixth" placeholder="6123 4567" v-model="state.vendorFax">
              <input v-else disabled style="width:75%" type="number" class="form-control" name="sixth" placeholder="6123 4567" v-model="state.vendorFax">
              <!-- <span class="text-danger" v-if="v$.vendorFax.$error">{{ v$.vendorFax.$errors[0].$message }}</span> -->
            </div>
            
          </div>
        </div>
        <div class="m-3 d-flex">
          <div class="d-flex justify-content-between w-100">
            <div class="form-check form-check-inline col-md-6">
              <label class="form-check-label"  for="inlineCompanyName">Types of business License/ Registration</label>
              <input v-if="this.useraccess == 'Vendor'" style="width:90%" type="text" class="form-control" name="seventh" placeholder="Company's Name" v-model="state.businessType">        
              <input v-else disabled style="width:90%" type="text" class="form-control" name="seventh" placeholder="Company's Name" v-model="state.businessType">        
              <span class="text-danger" v-if="v$.businessType.$error">{{ v$.businessType.$errors[0].$message }}</span>

            </div>
            <div class="form-check form-check-inline col-md-6">
              <div >Nature of Business {{ businessNature }}</div>
              <select style="width:90%" v-model="state.businessNature" class="btn btn-outline-secondary dropdown-toggle col-md-12">
                  <option value="" disabled>Please select one</option>
                  <option value="Manufacturing">Manufacturing</option>
                  <option value="Agent/dealer">Agent/dealer</option>
                  <option value="Distributor">Distributor</option>
                  <option value="Others">Others</option>
              </select>
              <span class="text-danger" v-if="v$.businessNature.$error">{{ v$.businessNature.$errors[0].$message }}</span>

            </div>   
          </div>
        </div>
        <div class="m-3 d-flex">
          <div class="d-flex justify-content-between w-100">
            <div class="form-check form-check-inline col-md-6">
              <label class="form-check-label"  for="inlineCompanyName">Contact Person</label>
              <input v-if="this.useraccess == 'Vendor'" style="width:90%" type="text" class="form-control" name="ninth" placeholder="Company's Name" v-model="state.contactName">        
              <input v-else disabled style="width:90%" type="text" class="form-control" name="ninth" placeholder="Company's Name" v-model="state.contactName">        
              <span class="text-danger" v-if="v$.contactName.$error">{{ v$.contactName.$errors[0].$message }}</span>

            </div>
            <div class="form-check form-check-inline col-md-3">
              <label class="form-check-label" for="inputPhone">Tel</label>
              <input v-if="this.useraccess == 'Vendor'" style="width:75%" type="number" class="form-control" name="tenth" placeholder="6123 4567" v-model="state.contactTel">
              <input v-else disabled style="width:75%" type="number" class="form-control" name="tenth" placeholder="6123 4567" v-model="state.contactTel">
              
              <span class="text-danger" v-if="v$.contactTel.$error">{{ v$.contactTel.$errors[0].$message }}</span>

            </div>
            <div class="form-check form-check-inline col-md-3">
              <label class="form-check-label"  for="inlineCompanyName">Designation</label>
              <input v-if="this.useraccess == 'Vendor'" style="width:75%" type="text" class="form-control" name="eleventh" placeholder="e.g. Manger " v-model="state.contactDesignation">        
              <input v-else disabled style="width:75%" type="text" class="form-control" name="eleventh" placeholder="e.g. Manger " v-model="state.contactDesignation">        
              <span class="text-danger" v-if="v$.contactDesignation.$error">{{ v$.contactDesignation.$errors[0].$message }}</span>

            </div>   
          </div>
        </div>
        <div class="m-3 d-flex">
          <div class="d-flex justify-content-between w-100">
            <div class="form-check form-check-inline col-md-12">
              <label class="form-check-label"  for="product">Product/ Services</label>
              <input v-if="this.useraccess == 'Vendor'" type="text" class="form-control" name="seventh" placeholder="Submit company's profile, brochure on product/service, if available" v-model="state.products">        
              <input v-else disabled type="text" class="form-control" name="seventh" placeholder="Submit company's profile, brochure on product/service, if available" v-model="state.products">        
              
              <span class="text-danger" v-if="v$.products.$error">{{ v$.products.$errors[0].$message }}</span>

            </div>

          </div>
        </div>
      <!-- </form> -->

    </div>

    <div v-if="this.useraccess!='Vendor'" class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center mb-5">
        PART II: EVALUATION
      </h4>
      <!-- <form> -->
          <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline col-md-6">
                      <input  v-if="this.useraccess == 'Admin'"  class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.iso9001Certification">
                      <input  v-else disabled  class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.iso9001Certification">

                      <label class="form-check-label" for="flexCheckDefault">ISO 9001 Certification{{ iso9001Certification }}</label>
                      
                      <span class="text-danger" v-if="v$.iso9001Certification.$error">{{ v$.iso9001Certification.$errors[0].$message }}</span>

                  </div>
              
                  <div class="form-check form-check-inline col-md-6">
                      <input v-if="this.useraccess == 'Admin'" style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Certification Body" v-model="state.certificationBody">
                      <input v-else disabled style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Certification Body" v-model="state.certificationBody">
              
                      <span class="text-danger" v-if="v$.certificationBody.$error">{{ v$.certificationBody.$errors[0].$message }}</span>

                  </div>
              </div>
          </div>
          <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline col-md-6">
                      <input v-if="this.useraccess == 'Admin'" class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.accrediationOfLaboratory">
                      <input v-else disabled class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.accrediationOfLaboratory">
                      
                      <label class="form-check-label" for="flexCheckDefault">Accredition of Laboratory</label>
              <!-- <span class="text-danger" v-if="v$.accrediationOfLaboratory.$error">{{ v$.accrediationOfLaboratoryc.$errors[0].$message }}</span> -->

                  </div>
              
                  <div class="form-check form-check-inline col-md-6">
                    <input v-if="this.useraccess == 'Admin'" style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Accredition Body" v-model="state.accrediationBody">  
                    <input v-else disabled style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Accredition Body" v-model="state.accrediationBody">
              <!-- <span class="text-danger" v-if="v$.accrediationBody.$error">{{ v$.accrediationBody.$errors[0].$message }}</span> -->
                      
                  </div>
              </div>
          </div>
          <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline col-md-6">
                      <input v-if="this.useraccess == 'Admin'" class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.productCertification">
                      <input v-else disabled class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.productCertification">
                      <label class="form-check-label" for="flexCheckDefault">Product Certification</label>
                      <!-- <span class="text-danger" v-if="v$.productCertification.$error">{{ v$.productCertification.$errors[0].$message }}</span> -->

                  </div>
              
                  <div class="form-check form-check-inline col-md-6">
                    <input v-if="this.useraccess == 'Admin'" style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Product Markings (e.g. PSB, UL, TUV)" v-model="state.productMarkings">
                      
                    <input v-else disabled style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Product Markings (e.g. PSB, UL, TUV)" v-model="state.productMarkings">
                      <!-- <span class="text-danger" v-if="v$.productMarkings.$error">{{ v$.productMarkings.$errors[0].$message }}</span> -->

                  </div>
              </div>
          </div>
          <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline col-md-6">
                      <input v-if="this.useraccess == 'Admin'" class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.siteEvaluationResults">
                      <input v-else disabled class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.siteEvaluationResults">
                      <label class="form-check-label" for="flexCheckDefault">Site Evaluation Results</label>
                      <span class="text-danger" v-if="v$.siteEvaluationResults.$error">{{ v$.siteEvaluationResults.$errors[0].$message }}</span>

                  </div>
              
                  <div class="form-check form-check-inline col-md-6">
                      <input v-if="this.useraccess == 'Admin'" style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                      <input v-else disabled style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                  </div>
              </div>
          </div>
          <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline col-md-6">
                    <input v-if="this.useraccess == 'Admin'" class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.resultsOfProductEvaluation">
                    <input v-else disabled class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.resultsOfProductEvaluation">
                      <label class="form-check-label" for="flexCheckDefault">Results of Sample/Product Evaluation</label>
                      <span class="text-danger" v-if="v$.resultsOfProductEvaluation.$error">{{ v$.resultsOfProductEvaluation.$errors[0].$message }}</span>

                  </div>
              
                  <div class="form-check form-check-inline col-md-6">
                    <input v-if="this.useraccess == 'Admin'"  style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">  
                    <input v-else disabled style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                  </div>
              </div>
          </div>
          <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline col-md-6">
                      <input v-if="this.useraccess == 'Admin'"   class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.resultsOfFirstDeal">
                      <input  v-else disabled class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.resultsOfFirstDeal">
                      
                      <label class="form-check-label" for="flexCheckDefault">Results of First Deal</label>
                      <span class="text-danger" v-if="v$.resultsOfFirstDeal.$error">{{ v$.resultsOfProdresultsOfFirstDealuctEvaluation.$errors[0].$message }}</span>
                      
                  </div>
              
                  <div class="form-check form-check-inline col-md-6">
                    <input v-if="this.useraccess == 'Admin'" style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">  
                    <input v-else disabled style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                  </div>
              </div>
          </div>
          <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline col-md-6">
                    <input v-if="this.useraccess == 'Admin'" class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.trackRecordReview">
                    <input v-else disabled class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.trackRecordReview">
                      <label class="form-check-label" for="flexCheckDefault">Track Record Review/ Customer Reference</label>
                      <span class="text-danger" v-if="v$.trackRecordReview.$error">{{ v$.trackRecordReview.$errors[0].$message }}</span>

                  </div>
              
                  <div class="form-check form-check-inline col-md-6">
                    <input v-if="this.useraccess == 'Admin'" style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">  
                    <input v-else disabled style="width:90%" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="Satisfactory/ Unsatisfactory">
                  </div>
              </div>
          </div>
          <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline col-md-12">
                    <input  v-if="this.useraccess == 'Admin'"  class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.evaluationOthers">
                    <input v-else disabled class="form-check-input" type="checkbox" value="false" id="flexCheckDefault" v-model="state.evaluationOthers">
                      <label class="form-check-label" for="flexCheckDefault">Others(e.g. commercial, sole supplier, customer specified, franchise etc.)</label>
                      <span class="text-danger" v-if="v$.trackRecordReview.$error">{{ v$.evaluationOthers.$errors[0].$message }}</span>

                  </div>
              </div>
          </div>
          <div class="m-3 d-flex justify-content-center">
            <div class="form-check form-check-inline ">
              <label class="form-check-label"  for="inlineCompanyName">Evaluated by</label>
              <input v-if="this.useraccess == 'Admin'" type="text" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="state.evaluatedBy">
              <input v-else disabled type="text" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="state.evaluatedBy">
              <span class="text-danger" v-if="v$.evaluatedBy.$error">{{ v$.evaluatedBy.$errors[0].$message }}</span>
            </div>
          </div>
          <div class="mb-3">
                   <div class="container">
                    <label for="Signature" class="form-label">Signature</label>
                        <div class="container border border-primary">
                           <VueSignaturePad v-if="this.useraccess == 'Admin'"
                            id="signature"
                            width="100%"
                            height="200px"
                            ref="signaturePad"
                            :options="{onBegin: () => {$refs.signaturePad.resizeCanvas()}}"
                          />
                          <VueSignaturePad v-else
                            id="signature"
                            width="100%"
                            height="200px"
                            ref="signaturePad"
                            :options="{onBegin: () => {$refs.signaturePad.lockSignaturePad()}}"
                          />
                        </div>
                        <div class="buttons">
                            <button v-if="this.useraccess == 'Admin'" class="btn btn-danger" @click="clear">Clear</button>
                            <button v-else disabled class="btn btn-danger" @click="clear">Clear</button>
                        </div>
                    </div>
                    
                </div>
      <!-- </form> -->

      <!-- <h5 class="text-center my-3">SCORE (II): {{ computeScoreTwo }}</h5> -->
    </div>

    <div v-if="this.useraccess=='Approver' || this.useraccess=='Admin'" class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center mb-5">PART III: RESULT OF EVALUATION</h4>
      <!-- <form> -->
          <div class="m-3 d-flex ">
             
                  <div class="form-check form-check-inline ">
                      <label class="form-check-label"  for="inlineCompanyName">Approved by</label>
                      <input v-if="this.useraccess == 'Approver'" type="text" class="form-control form-check-inline" name="companyaddress" placeholder="Approver name" v-model="state.approvedByDirector">
                      <input v-else disabled type="text" class="form-control form-check-inline" name="companyaddress" placeholder="evaluator name" v-model="state.approvedByDirector">
              <span class="text-danger" v-if="v$.approvedByDirector.$error">{{ v$.approvedByDirector.$errors[0].$message }}</span>
                  </div>
                  <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline ">
                      <label class="form-check-label"  for="inlineCompanyName">Effective Date</label>
                      <input v-if="this.useraccess == 'Approver'" type="date" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="state.effectiveDate">
                      <input v-else disabled type="date" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="state.effectiveDate">
              <span class="text-danger" v-if="v$.effectiveDate.$error">{{ v$.effectiveDate.$errors[0].$message }}</span>
                      
                  </div>
              </div>
              </div>
              <div class="mb-3">
                   <div class="container">
                    <label for="Signature" class="form-label">Signature</label>
                        <div class="container border border-primary">
                           <VueSignaturePad v-if="this.useraccess == 'Approver'"
                            id="signature"
                            width="100%"
                            height="200px"
                            ref="signaturePadApprove"
                            :options="{onBegin: () => {$refs.signaturePadApprove.resizeCanvas()}}"
                          />
                          <VueSignaturePad v-else
                            id="signature"
                            width="100%"
                            height="200px"
                            ref="signaturePadApprove"
                            :options="{onBegin: () => {$refs.signaturePadApprove.lockSignaturePad()}}"
                          />
                        </div>
                        <div class="buttons">
                            <button v-if="this.useraccess == 'Approver'" class="btn btn-danger" @click="clearapprove">Clear</button>
                            <button v-else disabled class="btn btn-danger" @click="clearapprove">Clear</button>
                        </div>
                    </div>
                    
                </div>
          <!-- </div> -->
          <!-- <div class="m-3 d-flex">
              <div class="d-flex justify-content-between w-100">
                  <div class="form-check form-check-inline ">
                      <label class="form-check-label"  for="inlineCompanyName">Effective Date</label>
                      <input v-if="this.useraccess == 'Approver'" type="date" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="state.effectiveDate">
                      <input v-else disabled type="date" class="form-control form-check-inline " name="companyaddress" placeholder="evaluator name" v-model="state.effectiveDate">
              <span class="text-danger" v-if="v$.effectiveDate.$error">{{ v$.effectiveDate.$errors[0].$message }}</span>
                      
                  </div>
              </div>
          </div> -->
      <!-- </form> -->

      <!-- <h5 class="text-center my-3">SCORE (III): {{ computeScoreThree }}</h5> -->
    </div>

    <div class="text-center m-3">
      <button type="button" value="save" class="btn btn-warning mx-3" @click="addToAPI($event)" v-if="this.useraccess == 'Vendor'">Save</button>
      <button type="button" value="submit" class="btn btn-success text-white" @click="addToAPI($event)" v-if="this.useraccess == 'Vendor'">Submit</button>        
      <button type="button" value="evaluation rejected" class="btn btn-danger mx-3 text-white" data-bs-toggle="modal" data-bs-target="#deleteModal" v-if="this.useraccess == 'Admin'">Reject Evaluation</button>
      <button type="button" value="evaluation approved" class="btn btn-success mx-3 text-white" @click="addToAPI($event)" v-if="this.useraccess == 'Admin'">Approve Evaluation</button>
      <button type="button" class="btn btn-info mx-3 text-white" @click="print" id="printButton" v-if="this.useraccess == 'Admin' && this.status== 'approved'">Print</button>
      <button type="button" value="reject" class="btn btn-danger mx-3 text-white" data-bs-toggle="modal" data-bs-target="#deleteModal" v-if="this.useraccess == 'Approver'">Reject</button>
      <button type="button" value="approve" class="btn btn-success mx-3 text-white" @click="addToAPI($event)" v-if="this.useraccess == 'Approver'">Approve</button>
        
    </div>

    <!--modal-->
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
            <p>Are you sure you want to reject the form?</p>
            <div class="form-floating">
              <p>Please state the reason(s) for rejection.</p>
              <textarea
                class="form-control border rounded"
                placeholder="Leave a comment here"
                id="rejectionReason"
                v-model="rejectionReason"
              ></textarea>
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
              value="evaluation rejected"
              @click="addToAPI($event)" 
              v-if="this.useraccess == 'Admin'"
            >
              <!--put @click here-->
              Reject
            </button>
            <button
              type="button"
              class="btn bg-gradient-custom btn-danger text-white"
              data-bs-dismiss="modal"
              value="reject"
              @click="addToAPI($event)" 
              v-if="this.useraccess == 'Approver'"
            >
              <!--put @click here-->
              Reject
            </button>
          </div>
        </div>
      </div>
    </div>

  </form>
    <!-- <Footer></Footer> -->
  </div>
</template>

<script>
import html2pdf from 'html2pdf.js';

import useValidate from '@vuelidate/core'
import {required, helpers} from '@vuelidate/validators'
import {reactive, computed} from 'vue'
export default {
  name: "NewVendorForm",
  setup(){
    const state = reactive({
      // formDate: "2023-03-07",
      // formName: "vendor assessment",
      // formCompleted: false,
      // status: "",
      useraccess: "",
      // formApproved: false,
      status: "",
      companyName: "",
      registrationNo: "",
      officeAddress: "",
      getRegistered: false,
      vendorTel: "",
      vendorFax: "",

      businessType: "",
      contactName: "",
      contactTel: "",
      contactDesignation: "",
      businessNature: "",
      products: "",

      iso9001Certification: "",
      accrediationOfLaboratory: false,
      productCertification: false,
      resultsOfProductEvaluation: false,
      siteEvaluationResults: false,
      resultsOfFirstDeal: false,
      trackRecordReview: false,

      evaluationOthers: "",
      certificationBody: "",
      accrediationBody: "",
      productMarkings: "",
      // resultOfEvaluation: null,
      rejectionReason: "",

      evaluatedBy: "",
      approvedByDirector: "",
      effectiveDate: "",
      signature: "",
      signaturetwo: "",
      formName: "Vendor Assessment Form",
    })

    const rules = computed(() => {
      return {
      // formDate: "2023-03-07",
      // formName: "vendor assessment",
      // formCompleted: false,
      // formApproved: false,
    //   status: "",
      
      companyName: {required},
      registrationNo:  {required},
      officeAddress:  {required},
      getRegistered:  false,
      vendorTel:  {required},
      vendorFax: "",

      businessType: {required},
      contactName: {required},
      contactTel: {required},
      contactDesignation: {required},
      businessNature: "",
      products: {required},

      iso9001Certification: false,
      accrediationOfLaboratory: false,
      productCertification: false,
      resultsOfProductEvaluation: false,
      siteEvaluationResults: false,
      resultsOfFirstDeal: false,
      trackRecordReview: false,

      evaluationOthers: "",
      certificationBody: "",
      accrediationBody: "",
      productMarkings: "",
      resultOfEvaluation: "",

      evaluatedBy: "",
      approvedByDirector: "",
      effectiveDate: "",
      signature: "",
      signaturetwo: "",
      

      }
    })
    const v$ = useValidate(rules,state)
    return {
      state, 
      v$
    }
  },
  
  methods: {
    // approve(){
    //   this.status = "approve"
    //   console.log('approveeee')
    // },
    async email(formCode, companyName, formName, rejectionReason) {
      var email = formCode.slice(2);
      try {
        console.log("emailing");
        const axios = require("axios");
        let newEmail = {
          recipient: email,
          msgBody:
            "Dear " +
            this.companyName +
            "," +
            "\n\nI am writing to inform you that unfortunately, we have had to reject the " +
            this.formName +
            " that you submitted to us due to the following reason:\n\n" +
            rejectionReason +
            "\n\nWe kindly request that you review the reason for the rejection and make any necessary changes to the form. Once the changes have been made, please resubmit the form to us as soon as possible.\n\nIf you have any questions or concerns regarding the reason for the rejection, please do not hesitate to contact us. We are happy to help and provide any clarification that you may need.\n\nWe value your partnership and thank you for your prompt attention to this matter." +
            "\n\nBest Regards,\nQuantum Leap\nEmail: grp1oop@gmail.com\nQuantum Leap Incorporation Pte Ltd\n114 Lavender Street CT Hub 2, 09-50 Lobby, #3, 338729",
          subject:
            "Rejection Notification for " +
            companyName +
            "'s " +
            formName +
            " - " +
            rejectionReason,
        };

        await axios
          .post("http://localhost:8080/sendMail", newEmail)
          .then((response) => {
            console.log(response.data);
            alert("reminder sent");
          })
          .catch((error) => {
            console.log(error);
          });
      } catch (error) {
        console.log(error);
      }
    },
    print(){
        // console.log(this.state.signaturetwo)
        setTimeout(function(){
          window.location.href = "http://localhost:3000/home";
        }, 2000);
        console.log("PRINTING")
        html2pdf(this.$refs.printme, {
            margin: 1,
            filename: 'New Vendor Assessment Form.pdf',
            image: { type: 'jpeg', quality: 0.98 },
            html2canvas: { dpi: 192, letterRendering: true },
            jsPDF: { unit: 'in', format: 'letter', orientation: 'landscape' }
        })
        setTimeout();
    },
    checkuseraccess(){
      console.log("useraccess")
      var useraccess = JSON.parse(localStorage.getItem('specificuser'))['accessRights']
      this.useraccess = useraccess
      console.log(this.useraccess)
  },
  clear() {
      this.$refs.signaturePad.clearSignature();
    },
    clearapprove() {
      this.$refs.signaturePadApprove.clearSignature();
    },
    addToAPI(e) {
      
      function toIsoString(date) {
        var tzo = -date.getTimezoneOffset(),
            dif = tzo >= 0 ? '+' : '-',
            pad = function(num) {
                return (num < 10 ? '0' : '') + num;
            };
        return date.getFullYear() +
            '-' + pad(date.getMonth() + 1) +
            '-' + pad(date.getDate()) +
            'T' + pad(date.getHours()) +
            ':' + pad(date.getMinutes()) +
            ':' + pad(date.getSeconds()) +
            dif + pad(Math.floor(Math.abs(tzo) / 60)) +
            ':' + pad(Math.abs(tzo) % 60);
      }
      
      var dt = new Date();
      let newForm = {
        
        // formCode: (Math.floor((Math.random() * 100) + 1)).toString(),
        deadline: toIsoString(dt),
        formName: "Vendor Assessment Form",
        // formCompleted: false,
        // formApproved: this.state.formApproved,

        companyName: this.state.companyName,
        registrationNo: this.state.registrationNo, 
        officeAddress: this.state.officeAddress, 
        getRegistered: this.state.getRegistered, 
        vendorTel: this.state.vendorTel, 
        vendorFax: this.state.vendorFax, 
        businessType: this.state.businessType, 

        contactName: this.state.contactName, 
        contactTel: this.state.contactTel, 
        contactDesignation: this.state.contactDesignation, 
        businessNature: this.state.businessNature, 
        products: this.state.products, 

        iso9001Certification: this.state.iso9001Certification, 
        accrediationOfLaboratory: this.state.accrediationOfLaboratory, 
        productCertification: this.state.productCertification, 
        resultsOfProductEvaluation: this.state.resultsOfProductEvaluation,
        siteEvaluationResults: this.state.siteEvaluationResults,
        resultsOfFirstDeal: this.state.resultsOfFirstDeal,
        trackRecordReview: this.state.trackRecordReview,
        evaluationOthers: this.state.evaluationOthers,

        certificationBody: this.state.certificationBody,
        accrediationBody: this.state.accrediationBody,
        productMarkings: this.state.productMarkings,
        resultOfEvaluation: this.state.resultOfEvaluation,

        evaluatedBy: this.state.evaluatedBy,
        approvedByDirector: this.state.approvedByDirector,
        effectiveDate: this.state.effectiveDate,
        rejectionReason: this.rejectionReason
      };
      var buttonValue = e.target.value;

      if(this.useraccess =="Admin"){
        const { isEmpty, data } = this.$refs.signaturePad.saveSignature();
        console.log(data)
        newForm.signature = data
      }
      if(this.useraccess =="Approver" ){
        const { isEmpty, data } = this.$refs.signaturePadApprove.saveSignature();
        console.log(data)
        newForm.signaturetwo = data
        newForm.signature = this.state.signature
      }

      console.log(newForm)
      const axios = require("axios");
      this.v$.$validate()
      var formid = localStorage.getItem('formid')
      newForm.formCode = formid
      if(buttonValue != "submit"){
        if(buttonValue == "save"){
          newForm.status = "incomplete";
        }
        if(buttonValue == "evaluation rejected"){
          newForm.status = "adminRejected";
          console.log(formid, this.state.companyName, "Vendor Assessment Form", this.rejectionReason);
          this.email(formid, this.state.companyName, "Vendor Assessment Form", this.rejectionReason);
        }
        if(buttonValue == "evaluation approved"){
          newForm.status = "pendingApproval";
        }
        else if(buttonValue == "approve"){
          newForm.status = "approved";
        }
        else if(buttonValue == "reject"){
          newForm.status = "approverRejected";
          console.log(formid, this.state.companyName, "Vendor Assessment Form", this.rejectionReason);
          this.email(formid, this.state.companyName, "Vendor Assessment Form", this.rejectionReason);
        }
        axios
            .put("http://localhost:8080/vendorAssessment", newForm)
            .then((response) => {
              console.log(response);
              alert(`form ${buttonValue}`)
              window.location.href = "http://localhost:3000/home"
            })
          }
      else{
        if(!this.v$.$error){
            newForm.status = "pendingEvaluation";
            console.log(this.formApproved)
            alert('successful validation')
            axios
            .put("http://localhost:8080/vendorAssessment", newForm)
            .then((response) => {
              console.log(response);
                  alert("form submitted")
              window.location.href = "http://localhost:3000/home"
            })
            .catch((error) => {
              console.log(error);
            });
        }else{
            alert('form failed')
        }
      }
    },
    draw(data){ // this draws back the signature that we saved in the database
      this.$refs.signaturePad.clearSignature();
      console.log("Trying to draw the signature");
      this.$refs.signaturePad.fromDataURL(data); // this draws back the signature that we saved
    //this.$refs.signaturePad.fromData(data);
    },
    drawapprove(data){ // this draws back the signature that we saved in the database
      console.log(data)
      this.$refs.signaturePadApprove.clearSignature();
      console.log("Trying to draw the signature");
      this.$refs.signaturePadApprove.fromDataURL(data); // this draws back the signature that we saved
    //this.$refs.signaturePad.fromData(data);
    },
    async getEditInputs(){
      try {
          const axios = require('axios');
          var formid = localStorage.getItem('formid')
          console.log(formid)
          await axios.get(`http://localhost:8080/vendorAssessment/${formid}`)
          .then((response) => {
              console.log(response.data);
              var data = response.data
              this.status= data.status
              this.state.companyName = data.companyName
              this.state.registrationNo =  data.registrationNo
              this.state.officeAddress =  data.officeAddress
              this.state.getRegistered =  data.getRegistered
              this.state.vendorTel =  data.vendorTel
              this.state.vendorFax =  data.vendorFax
              this.state.businessType =  data.businessType
              this.state.contactName =  data.contactName
              this.state.contactTel =  data.contactTel
              this.state.contactDesignation =  data.contactDesignation
              this.state.businessNature =  data.businessNature
              this.state.products =  data.products
        
              this.state.iso9001Certification= data.iso9001Certification
              this.state.accrediationOfLaboratory= data.accrediationOfLaboratory
              this.state.productCertification= data.productCertification
              this.state.resultsOfProductEvaluation= data.resultsOfProductEvaluation
              this.state.siteEvaluationResults= data.siteEvaluationResults
              this.state.resultsOfFirstDeal= data.resultsOfFirstDeal
              this.state.trackRecordReview= data.trackRecordReview

              this.state.evaluationOthers= data.evaluationOthers
              this.state.certificationBody= data.certificationBody
              this.state.accrediationBody= data.accrediationBody
              this.state.productMarkings= data.productMarkings
              this.state.resultOfEvaluation= data.resultOfEvaluation
        
              this.state.evaluatedBy= data.evaluatedBy
              this.state.approvedByDirector= data.approvedByDirector
              this.state.effectiveDate= data.effectiveDate
              this.state.signature = data.signature
              this.state.signaturetwo = data.signaturetwo

              var signdata = data.signature
              this.draw(signdata);
              var signdataapprove = data.signaturetwo
              this.drawapprove(signdataapprove);
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
    this.getEditInputs();
    this.checkuseraccess();
},
};
</script>

<style></style>
