<template>
  <div class="container-fluid">
    <!-- <Navigation></Navigation> -->
        <h2 id="title" class="text-center pt-3">SUBCONTRACTOR’S SAFETY & HEALTH PRE-EVALUATION</h2>

        <div class="row bg-light m-5 rounded p-3">
          
                <div class="mb-3">
                    <label for="InputSubcontractorName" class="form-label">Name Of Subcontractor</label>
                    <input v-model="state.subcontractorName" type="text" class="form-control" id="InputSubcontractorName">
                    
                </div>
                <div class="mb-3">
                    <label for="InputScopeOfWork" class="form-label">Scope of Work</label>
                    <input v-model="state.scopeOfWork" type="text" class="form-control" id="InputScopeOfWork">
                    
                </div>

                <div class="mb-3">
                    <label for="InputEvaluatedBy" class="form-label">Evaluated By</label>
                    <input v-model="state.evaluatedBy" type="text" class="form-control" id="InputEvaluatedBy">
                    
                </div>

                <!-- Will fix this date field to be a datepicker -->
                 <div class="mb-3">
                    <label for="InputDate" class="form-label">Date</label>
                    <input v-model="state.todayDate" type="date" class="form-control" id="InputDate">
                    
                </div>

        </div>

        <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">PART I: Safety & Health Policy and Organisation </h4>
            <form>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">a)  Is there a written Safety & Health Policy?</label>
                    <div class="d-flex ms-3 justify-content-between w-30">
                        <div class="form-check form-check-inline ">
                            <input class="form-check-input" v-model="state.shpolicy" type="radio" name="first" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.shpolicy" type="radio" name="first" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Is there a Safety Organisation with proper delegation of responsibility and accountability for safety and health?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <input class="form-check-input" v-model="state.safetyOrganisation" type="radio" name="second" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safetyOrganisation" type="radio" name="second" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

                 <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">c)  Is there a written safety commitment and is it submitted?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <input class="form-check-input" v-model="state.safetyCommit" type="radio" name="third" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safetyCommit" type="radio" name="third" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

              </form>

        </div>


          <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">PART II: Tool Box Meeting </h4>
            <form>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">a)  Are regular tool-box meetings conducted and reports submitted?</label>
                    <div class="d-flex ms-3 justify-content-between w-30">
                        <div class="form-check form-check-inline ">
                            <input class="form-check-input" v-model="state.toolbox"  type="radio" name="first" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.toolbox" type="radio" name="first" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

              </form>

        </div>

         <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">PART III: Safety Training </h4>
            <form>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">a)  Are relevant safety training courses provided for management / Supervisors?</label>
                    <div class="d-flex ms-3 justify-content-between w-30">
                        <div class="form-check form-check-inline ">
                            <input class="form-check-input" v-model="state.safetyMgtCourses" type="radio" name="first" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safetyMgtCourses" type="radio" name="first" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Are relevant safety training courses provided for workers?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <input class="form-check-input" v-model="state.safetyWorkersCourses" type="radio" name="second" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safetyWorkersCourses" type="radio" name="second" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

                 <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">c)  Are relevant safety training certificates submitted?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <input class="form-check-input" v-model="state.safetyCertificates" type="radio" name="third" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safetyCertificates" type="radio" name="third" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

              </form>

        </div>

        <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">PART IV: Safety & Health Rules & Safe Work Procedures/ Risk Assessment </h4>
            <form>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">a)  Are there written safety & health rules for the workers?</label>
                    <div class="d-flex ms-3 justify-content-between w-30">
                        <div class="form-check form-check-inline ">
                            <input class="form-check-input" v-model="state.safetyHealthRules" type="radio" name="first" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safetyHealthRules" type="radio" name="first" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Are there written safe work procedures/ risk assessment formulated and submitted?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <input class="form-check-input" v-model="state.safeWorkRisk" type="radio" name="second" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safeWorkRisk" type="radio" name="second" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

              </form>

        </div>

        <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">PART V: Safety & Health Inspection & Equipment </h4>
            <form>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">a)  Is there a written programme outlining inspection guidelines,
                    frequency and follow-up corrective actions?</label>

                    <div class="d-flex ms-3 justify-content-between w-30">
                        <div class="form-check form-check-inline ">
                            <input class="form-check-input" v-model="state.writtenProgram" type="radio" name="first" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.writtenProgram" type="radio" name="first" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Is there available Personal Protective Equipment and of proper
                    working condition and comply to safety requirements?</label>

                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <input class="form-check-input" v-model="state.safetyEquipment" type="radio" name="second" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safetyEquipment" type="radio" name="second" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

              </form>

        </div>

        <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">PART VI: Responsible Personnel </h4>
            <form>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">a)  Is there a Safety Supervisor working at least 5 hrs / week?</label>

                    <div class="d-flex ms-3 justify-content-between w-30">
                        <div class="form-check form-check-inline ">
                            <input class="form-check-input" v-model="state.safetySupervisor" type="radio" name="first" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.safetySupervisor" type="radio" name="first" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Is there a qualified First Aider?</label>
                    
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <input class="form-check-input" v-model="state.firstAider" type="radio" name="second" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.firstAider" type="radio" name="second" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">c)  Are there relevant Licensed Electrical Workers, qualified engineers,
                     qualified supervisors, lifting supervisors, qualified JCB Tower /
                    Mobile / Crawler Crane operators?</label>
                    
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <input class="form-check-input" v-model="state.qualified" type="radio" name="third" id="inlineRadio1" value="1">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input class="form-check-input" v-model="state.qualified" type="radio" name="third" id="inlineRadio2" value="2">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                          </div>
                    </div>
                </div>

              </form>

        </div>

        <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">PART VII: Accident Analysis </h4>
            <form>

            <div class="m-3">
                    <label for="first" class="form-label fw-bold" style="width: 50%">a)  Accident Records for the last three years:</label>
                

                <div class="mb-3">
                    <label for="InputTempDisabilityCases" class="form-label">Number of Temporary Disability Cases </label>
                    <input type="number" v-model="state.tempDisabilityCases" min="0" class="form-control" id="InputTempDisabilityCases">
                    
                </div>
                <div class="mb-3">
                    <label for="InputPermDisabilityCases" class="form-label">Number of Permanent Disability Cases</label>
                    <input type="number" v-model="state.permDisabilityCases" min="0" class="form-control" id="InputPermDisabilityCases">
                    
                </div>

                <div class="mb-3">
                    <label for="InputFatalCases" class="form-label">Number of Fatal Cases</label>
                    <input type="number" v-model="state.fatalCases" min="0" class="form-control" id="InputFatalCases">
                    
                </div>
                
            </div>
              </form>

        </div>

        <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">Acknowledgement </h4>
           

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 100%">I, representative of the above-named sub-contractor, have understand the various Safety Criteria listed above and hereby acknowledged that the information given above
                         are valid and supporting items/documents are available upon request by the main contractor.</label>
                </div>

                 <div class="mb-3">
                    <label for="InputDate" class="form-label">Date</label>
                    <input type="date" v-model="state.signedDate" class="form-control" id="InputDate">
                    
                </div>
                <div class="mb-3">
                    <label for="InputAcknowledgeBy" class="form-label">Acknowledged By</label>
                    <input type="text" v-model="state.acknowledgedBy" class="form-control" id="InputAcknowledgedBy">
                    
                </div>

                <div class="mb-3">
                   <div class="container">
                    <label for="Signature" class="form-label">Signature</label>
                        <div class="container border border-primary">
                           <VueSignaturePad
                            id="signature"
                            width="100%"
                            height="200px"
                            ref="signaturePad"
                            :options="{onBegin: () => {$refs.signaturePad.resizeCanvas()}}"
                          />
                        </div>
                        <div class="buttons">
                            <button class="btn btn-danger" @click="clear">Clear</button>
                            <button class="btn btn-success" @click="save">Save</button>
                            <button class="btn btn-sucess" @click="draw">Draw</button>
                        </div>
                    </div>
                    
                </div>

             

        </div>

        


        <div class="text-center m-3"><button type="submit" @click="submit" class="btn btn-success">Submit</button></div>
        <!-- <Footer></Footer> -->
    </div>

</template>

<script>
import useValidate from '@vuelidate/core'
import {required, helpers} from '@vuelidate/validators'
import {reactive, computed} from 'vue'
export default {
  setup(){
    const state =reactive({
// name:value pairs
        subcontractorName : "",
        scopeOfWork: "",
        evaluatedBy: "",
        todayDate: "",
        shpolicy: "",
        safetyOrganisation: "",
        safetyCommit: "",
        toolbox: "",
        safetyMgtCourses: "",
        safetyWorkersCourses: "",
        safetyCertificates: "",
        safetyHealthRules: "",
        safeWorkRisk: "",
        writtenProgram : "",
        safetyEquipment: "",
        safetySupervisor: "",
        firstAider: "",
        qualified: "",
        tempDisabilityCases: "",
        permDisabilityCases: "",
        fatalCases: "",
        signedDate: "",
        acknowledgedBy: "",

    })
    const rules = computed(()=>{
      return{
        subcontractorName : {required},
        scopeOfWork : {required},
        evaluatedBy : {required},
        todayDate : {required},
        shpolicy : {required},
        safetyOrganisation : {required},
        safetyCommit : {required},
        toolbox : {required},
        safetyMgtCourses : {required},
        safetyWorkersCourses : {required},
        safetyCertificates : {required},
        safetyHealthRules : {required},
        safeWorkRisk : {required},
        writtenProgram : {required},
        safetyEquipment : {required},
        safetySupervisor : {required},
        firstAider: {required},
        qualified : {required},
        tempDisabilityCases : {required},
        permDisabilityCases : {required},
        fatalCases : {required},
        signedDate : {required},
        acknowledgedBy : {required},
      }
    })

    const v$ = useValidate(rules,state)

    return{
      state,
      v$
    }
  },
  name: 'MySignaturePad',

  /*data(){
        return {
         
        // name:value pairs
        subcontractorName : "",
        scopeOfWork: "",
        evaluatedBy: "",
        todayDate: "",
        shpolicy: "",
        safetyOrganisation: "",
        safetyCommit: "",
        toolbox: "",
        safetyMgtCourses: "",
        safetyWorkersCourses: "",
        safetyCertificates: "",
        safetyHealthRules: "",
        safeWorkRisk: "",
        writtenProgram : "",
        safetyEquipment: "",
        safetySupervisor: "",
        firstAider: "",
        qualified: "",
        tempDisabilityCases: "",
        permDisabilityCases: "",
        fatalCases: "",
        signedDate: "",
        acknowledgedBy: "",

        }
       
    },*/
    
  methods: {
    clear() {
      this.$refs.signaturePad.clearSignature();
    },
    save() {
      const { isEmpty, data } = this.$refs.signaturePad.saveSignature();
      console.log("check if its empty:"+isEmpty);
      console.log("The Image File"+data);
      this.draw(data);
      
    },
    submit(){
      this.v$.$validate()

      if(!this.v$.$error){
        if(this.state.tempDisabilityCases <0 || this.state.permanentDisabilityCases <0 || this.state.fatalCases<0){
          alert("Please fill the Accident Analysis with non negative values")
        }
        else{
          const axios = require("axios");
          const { isEmpty, data } = this.$refs.signaturePad.saveSignature();

            //prepare the json to be sent in
            let preEval = {formCode:"1",
            subContractorName:this.state.subcontractorName,
            scopeOfWork: this.state.scopeOfWork, 
            evaluator:this.state.evaluatedBy,
            date: this.state.todayDate,
            safetyHealthPolicy:Boolean(this.state.shpolicy),
            properDelegation:Boolean(this.state.safetyOrganisation),
            safetyCommitment:Boolean(this.state.safetyCommit),
            toolBoxMeeting:Boolean(this.state.toolbox),
            supervisorTraining:Boolean(this.state.safetyMgtCourses),
            workerTraining:Boolean(this.state.safetyWorkersCourses),
            certificatesSubmitted:Boolean(this.state.safetyCertificates),
            workerRules:Boolean(this.state.safetyHealthRules),
            riskAssessmentsSubmitted:Boolean(this.state.safeWorkRisk),
            inspectionGuidelines:Boolean(this.state.writtenProgram),
            ppe:Boolean(this.state.safetyEquipment),
            safetySupervisor:Boolean(this.state.safetySupervisor),
            firstAider:Boolean(this.state.firstAider),
            relevantLicensedPersonnel:Boolean(this.state.qualified),
            temporaryDisabilityCases:this.state.tempDisabilityCases,
            permanentDisabilityCases:this.state.permDisabilityCases,
            fatalCases:this.state.fatalCases,
            acknowledgementDate:this.state.signedDate,
            signature: data,
            acknowledgedBy:this.state.acknowledgedBy}
            console.log(preEval)
            axios
            .post("http://localhost:8080/preEvaluation", preEval)
            .then((response) => {
              console.log(response);
              if (response.status == 201 && response.data != "") {
                alert("Pre Evaluation successfully created.");
              }
              if (response.data == "") {
                alert(
                  "VALIDATION FAILED. Something went wrong"
                );
              } else {
                alert("Success")
              }
            })
            .catch((error) => {
              console.log(error);
            });
        }
        
      }
      else{
        alert("Please fill up the form with valid details");
      }
       
    },
    draw(data){
      this.$refs.signaturePad.clearSignature();
      console.log("Trying to draw the signature");
      this.$refs.signaturePad.fromData(data);
    //this.$refs.signaturePad.fromData(data);
    }
  }
}
</script>

<style>

</style>