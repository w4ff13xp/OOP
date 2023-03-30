<template>
  <div class="container-fluid">
    <!-- <Navigation></Navigation> -->
        <h2 id="title" class="text-center pt-3">
          SUBCONTRACTOR’S SAFETY & HEALTH PRE-EVALUATION
        </h2>

        <div class="row bg-light m-5 rounded p-3">
          
                <div class="mb-3">
                    <label for="InputSubcontractorName" class="form-label">Name Of Subcontractor</label>
                    <input v-if="this.useraccess == 'Vendor'" style="width:90%" type="text" class="form-control" name="first" placeholder="Subcontractor's Name" v-model="state.subcontractorName" >        
                    <input v-else disabled style="width:90%" type="text" class="form-control" name="first" placeholder="Subcontractor's Name" v-model="state.subcontractorName" >        
                    
                </div>
                <div class="mb-3">
                    <label for="InputScopeOfWork" class="form-label">Scope of Work</label>
                    <input v-if="this.useraccess == 'Vendor'" style="width:90%" type="text" class="form-control" name="second" placeholder="Scope of Work" v-model="state.scopeOfWork" >        
                    <input v-else disabled style="width:90%" type="text" class="form-control" name="second" placeholder="Scope of Work" v-model="state.scopeOfWork" >        
          
                </div>

                <div class="mb-3">
                    <label for="InputEvaluatedBy" class="form-label">Evaluated By</label>
                    <input v-if="this.useraccess != 'Vendor'" style="width:90%" type="text" class="form-control" name="third" placeholder="Evaluator's Name" v-model="state.evaluatedBy" >        
                    <input v-else disabled style="width:90%" type="text" class="form-control" name="third" placeholder="Evaluator's Name" v-model="state.evaluatedBy" >        
          
                </div>

                <!-- Will fix this date field to be a datepicker -->
                 <div class="mb-3">
                    <label for="InputDate" class="form-label">Date</label>
                    <input v-if="this.useraccess != 'Vendor'" style="width:90%" type="Date" class="form-control" name="fourth" placeholder="Date" v-model="state.todayDate" >        
                    <input v-else disabled style="width:90%" type="Date" class="form-control" name="fourth" placeholder="Date" v-model="state.todayDate" >        
          
                </div>

        </div>

        <div class="row bg-light m-5 rounded p-3">
            <h4 class="text-center">PART I: Safety & Health Policy and Organisation </h4>
            <form>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">a)  Is there a written Safety & Health Policy?</label>
                    <div class="d-flex ms-3 justify-content-between w-30">
                        <div class="form-check form-check-inline ">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1"  class="form-check-input" name="first" v-model="state.shpolicy" value="true">        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.shpolicy" value="true" >        
                          </div>
                          <div class="form-check form-check-inline">
                            
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.shpolicy" value="false" >        
                            <input v-else disabled  type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.shpolicy" value="false" >
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Is there a Safety Organisation with proper delegation of responsibility and accountability for safety and health?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                           
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.safetyOrganisation" value="true" >        
                            <input v-else disabled  type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.safetyOrganisation" value="true"  >     
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" style="width:90%" type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.safetyOrganisation" value="false">        
                            <input v-else disabled  type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.safetyOrganisation" value="false" >  
                          </div>
                    </div>
                </div>

                 <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">c)  Is there a written safety commitment and is it submitted?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="third" v-model="state.safetyCommit" value="true" >        
                            <input v-else disabled type="radio" class="form-check-input" name="third" v-model="state.safetyCommit" value="true" >  
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="third" v-model="state.safetyCommit" value="false" >        
                            <input v-else disabled type="radio" id="inlineRadio2" class="form-check-input" name="third" v-model="state.safetyCommit" value="false"  >  
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
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.toolbox" value="true" >        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.toolbox" value="true" > 
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'"  type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.toolbox" value="false" >        
                            <input v-else disabled  type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.toolbox" value="false"  > 
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
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'"  type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.safetyMgtCourses" value="true" >        
                            <input v-else disabled  type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.safetyMgtCourses" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'"  type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.safetyMgtCourses" value="false">        
                            <input v-else disabled  type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.safetyMgtCourses" value="false">
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Are relevant safety training courses provided for workers?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.safetyWorkersCourses" value="true" >        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.safetyWorkersCourses" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.safetyWorkersCourses" value="false" >        
                            <input v-else disabled type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.safetyWorkersCourses" value="false" >
                          </div>
                    </div>
                </div>

                 <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">c)  Are relevant safety training certificates submitted?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'"  type="radio" id="inlineRadio1" class="form-check-input" name="third" v-model="state.safetyCertificates" value="true" >        
                            <input v-else disabled  type="radio" id="inlineRadio1" class="form-check-input" name="third" v-model="state.safetyCertificates" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'"  type="radio" id="inlineRadio2" class="form-check-input" name="third" v-model="state.safetyCertificates" value="false">        
                            <input v-else disabled  type="radio" id="inlineRadio2" class="form-check-input" name="third" v-model="state.safetyCertificates" value="false" >
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
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.safetyHealthRules" value="true" >        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.safetyHealthRules" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.safetyHealthRules" value="false" >        
                            <input v-else disabled type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.safetyHealthRules" value="false" >
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Are there written safe work procedures/ risk assessment formulated and submitted?</label>
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.safeWorkRisk" value="true" >        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.safeWorkRisk" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.safeWorkRisk" value="false" >        
                            <input v-else disabled type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.safeWorkRisk" value="false" >
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
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.writtenProgram" value="true" >        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.writtenProgram" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.writtenProgram" value="false">        
                            <input v-else disabled type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.writtenProgram" value="false" >
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Is there available Personal Protective Equipment and of proper
                    working condition and comply to safety requirements?</label>

                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.safetyEquipment" value="true" >        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.safetyEquipment" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.safetyEquipment" value="false">        
                            <input v-else disabled type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.safetyEquipment" value="false" >
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
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'"  type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.safetySupervisor" value="true" >        
                            <input v-else disabled  type="radio" id="inlineRadio1" class="form-check-input" name="first" v-model="state.safetySupervisor" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'"  type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.safetySupervisor" value="false" >        
                            <input v-else disabled  type="radio" id="inlineRadio2" class="form-check-input" name="first" v-model="state.safetySupervisor" value="false" >
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">b)  Is there a qualified First Aider?</label>
                    
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.firstAider" value="true" >        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="second" v-model="state.firstAider" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.firstAider" value="false">        
                            <input v-else disabled  type="radio" id="inlineRadio2" class="form-check-input" name="second" v-model="state.firstAider" value="false" >
                          </div>
                    </div>
                </div>

                <div class="m-3 d-flex">
                    <label for="first" class="form-label fw-bold" style="width: 50%">c)  Are there relevant Licensed Electrical Workers, qualified engineers,
                     qualified supervisors, lifting supervisors, qualified JCB Tower /
                    Mobile / Crawler Crane operators?</label>
                    
                    <div class="d-flex justify-content-between w-30">
                        <div class="form-check form-check-inline ms-3">
                            <label class="form-check-label" for="inlineRadio1">Yes</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio1" class="form-check-input" name="third" v-model="state.qualified" value="true" >        
                            <input v-else disabled type="radio" id="inlineRadio1" class="form-check-input" name="third" v-model="state.qualified" value="true" >
                          </div>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label" for="inlineRadio2">No</label>
                            <input v-if="this.useraccess == 'Vendor'" type="radio" id="inlineRadio2" class="form-check-input" name="third" v-model="state.qualified" value="false" >        
                            <input v-else disabled type="radio" id="inlineRadio2" class="form-check-input" name="third" v-model="state.qualified"  value="false">
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
                    <input v-if="this.useraccess == 'Vendor'" type="number" id="InputTempDisabilityCases" class="form-control" name="first" placeholder="0" v-model="state.tempDisabilityCases" min="0">
                    <input v-else disabled  type="number" id="InputTempDisabilityCases" class="form-control" name="first" placeholder="0" v-model="state.tempDisabilityCases" min="0">
                    
                </div>
                <div class="mb-3">
                    <label for="InputPermDisabilityCases" class="form-label">Number of Permanent Disability Cases</label>
                    <input v-if="this.useraccess == 'Vendor'" type="number" id="InputPermDisabilityCases" class="form-control" name="second" placeholder="0" v-model="state.permDisabilityCases" min="0">
                    <input v-else disabled  type="number" id="InputPermDisabilityCases" class="form-control" name="second" placeholder="0" v-model="state.permDisabilityCases" min="0">
                    
                </div>

                <div class="mb-3">
                    <label for="InputFatalCases" class="form-label">Number of Fatal Cases</label>
                    <input v-if="this.useraccess == 'Vendor'" type="number" id="InputFatalCases" class="form-control" name="third" placeholder="0"  v-model="state.fatalCases" min="0">
                    <input v-else disabled type="number" id="InputFatalCases" class="form-control" name="third" placeholder="0"  v-model="state.fatalCases" min="0">
                    
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
                    <input v-if="this.useraccess == 'Vendor'" type="date" id="InputDate" class="form-control" name="first" placeholder="00-00-00" v-model="state.signedDate">
                    <input v-else disabled  type="date" id="InputDate" class="form-control" name="first" placeholder="00-00-00" v-model="state.signedDate">
                    
                </div>
                <div class="mb-3">
                    <label for="InputAcknowledgeBy" class="form-label">Acknowledged By</label>
                    <input v-if="this.useraccess == 'Vendor'" type="text" id="InputAcknowledgedBy" class="form-control" name="first" placeholder="Acknowledged Name" v-model="state.acknowledgedBy">
                    <input v-else disabled type="text" id="InputAcknowledgedBy" class="form-control" name="first" placeholder="Acknowledged Name" v-model="state.acknowledgedBy">
                    
                </div>

                <div class="mb-3">
                   <div class="container">
                    <label for="Signature" class="form-label">Signature</label>
                        <div class="container border border-primary">
                           <VueSignaturePad v-if="this.useraccess == 'Vendor'"
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
                            <button v-if="this.useraccess == 'Vendor'" class="btn btn-danger" @click="clear">Clear</button>
                            <button v-else disabled class="btn btn-danger" @click="clear">Clear</button>
                        </div>
                    </div>
                    
                </div>

             

        </div>

        
        <div class="text-center m-3">
        <button type="button" value="reject" class="btn btn-danger mx-3 text-white" @click="adminAPI($event)" v-if="this.useraccess == 'Admin'">Reject</button>

        <button type="button" value="approve" class="btn btn-success mx-3 text-white" @click="adminAPI($event)" v-if="this.useraccess == 'Admin'">Approve</button>

         <button type="button" value="reject" class="btn btn-danger mx-3 text-white" @click="approverAPI($event)" v-if="this.useraccess == 'Approver'">Reject</button>

        <button type="button" value="approve" class="btn btn-success mx-3 text-white" @click="approverAPI($event)" v-if="this.useraccess == 'Approver'">Approve</button>

        <button type="button" value="save" class="btn btn-warning mx-3 text-white" @click="submit($event)" v-if="this.useraccess == 'Vendor'">Save</button>
        <button type="button" value="submit" class="btn btn-success text-white" @click="submit($event)" v-if="this.useraccess == 'Vendor'">Submit</button>
        
      </div>
        <!-- <Footer></Footer> -->
    </div>

</template>

<script>
import useValidate from '@vuelidate/core'
import {required, helpers} from '@vuelidate/validators'
import {reactive, computed} from 'vue'
import moment from "moment";
export default {
  setup(){
    const state =reactive({
// name:value pairs
        useraccess: "",
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
        signedDate: null,
        acknowledgedBy: "",

    })
    const rules = computed(()=>{
      return{
        subcontractorName : {required},
        scopeOfWork : {required},
        // evaluatedBy : {required},
        // todayDate : {required},
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
    checkuseraccess(){
        console.log("useraccess")
        var useraccess = JSON.parse(localStorage.getItem('specificuser'))['accessRights']
        this.useraccess = useraccess
        console.log(this.useraccess)
        if(useraccess != "Vendor"){
          this.getEditInputs();
        }
    },
    clear() {
      this.$refs.signaturePad.clearSignature();
    },
    submit(e){
      var buttonValue = e.target.value;

      if(buttonValue == "save"){
            const axios = require("axios");
            const { isEmpty, data } = this.$refs.signaturePad.saveSignature();
            console.log("check if its empty:"+isEmpty);
            var email = JSON.parse(localStorage.getItem('specificuser'))['email']
            var fcode = "PE"+ email;

            //prepare the json to be sent in
            let preEval = {
              formCode: fcode,
            subContractorName:this.state.subcontractorName,
            scopeOfWork: this.state.scopeOfWork, 
            //evaluator:this.state.evaluatedBy,
            //evaluatedDate: this.state.todayDate,
            formName: "Pre Evaluation Form",
            status: "incomplete",
            temporaryDisabilityCases:this.state.tempDisabilityCases,
            permanentDisabilityCases:this.state.permDisabilityCases,
            fatalCases:this.state.fatalCases,
            submissionDate:this.state.signedDate,
            signature: data,
            acknowledgedBy:this.state.acknowledgedBy}

            if(this.state.shpolicy ==="true"){
              preEval.safetyHealthPolicy = true;
            }
            else{
              preEval.safetyHealthPolicy = false;
            }
            if(this.state.safetyOrganisation ==="true"){
              preEval.properDelegation = true
            }
            else{
              preEval.properDelegation = false;
            }
            if(this.state.safetyCommit === "true"){
              preEval.safetyCommitment = true
            }
            else{
              preEval.safetyCommitment = false;
            }
            if(this.state.toolbox === "true"){
              preEval.toolBoxMeeting = true
            }
            else{
              preEval.toolBoxMeeting = false
            }
            if(this.state.safetyMgtCourses === "true"){
              preEval.supervisorTraining = true
            }
            else{
              preEval.supervisorTraining = false
            }
            if(this.state.safetyWorkersCourses === "true"){
              preEval.workerTraining = true
            }
            else{
              preEval.workerTraining = false
            }
            if(this.state.safetyCertificates === "true"){
              preEval.certificatesSubmitted = true
            }
            else{
              preEval.certificatesSubmitted = false
            }
            if(this.state.safetyHealthRules === "true"){
              preEval.workerRules = true
            }
            else{
              preEval.workerRules = false
            }
            if(this.state.safeWorkRisk === "true"){
              preEval.riskAssessmentsSubmitted = true
            }
            else{
              preEval.riskAssessmentsSubmitted = false
            }
            if(this.state.writtenProgram === "true"){
              preEval.inspectionGuidelines = true
            }
            else{
              preEval.inspectionGuidelines = false
            }
            if(this.state.safetyEquipment === "true"){
              preEval.ppe = true
            }
            else{
              preEval.ppe = false
            }
            if(this.state.safetySupervisor === "true"){
              preEval.safetySupervisor = true
            }
            else{
              preEval.safetySupervisor = false
            }
            if(this.state.firstAider === "true"){
              preEval.firstAider = true
            }
            else{
              preEval.firstAider = false
            }
            if(this.state.qualified === "true"){
              preEval.relevantLicensedPersonnel = true
            }
            else{
              preEval.relevantLicensedPersonnel = false
            }
  
            console.log(preEval)
            var formid = localStorage.getItem('formid')
            preEval.formCode = formid
            console.log(preEval+"before sending")
            axios
              .put("http://localhost:8080/preEvaluation", preEval)
              .then((response) => {
                console.log(response);
                // localStorage.setItem('edit',false);
                    alert("form saved")
                window.location.href = "http://localhost:3000/home"
              })
              .catch((error) => {
                console.log(error);
              });
            }
            else{
            this.v$.$validate()

            if(!this.v$.$error){
          
              if(this.state.tempDisabilityCases <0 || this.state.permanentDisabilityCases <0 || this.state.fatalCases<0){
                alert("Please fill the Accident Analysis with non negative values")
              }
              else{
                const axios = require("axios");
                const { isEmpty, data } = this.$refs.signaturePad.saveSignature();
                console.log("check if its empty:"+isEmpty);
                console.log("The Image File"+data);
                var email = JSON.parse(localStorage.getItem('specificuser'))['email']
                var fcode = "PE"+ email;

                //prepare the json to be sent in
                let preEval = {formCode: fcode,
                subContractorName:this.state.subcontractorName,
                scopeOfWork: this.state.scopeOfWork, 
                //evaluator:this.state.evaluatedBy,
                //evaluatedDate: this.state.todayDate,
                formName: "Pre Evaluation Form",
                status: "pendingEvaluation",
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
                submissionDate:this.state.signedDate,
                signature: data,
                acknowledgedBy:this.state.acknowledgedBy}
                console.log(preEval)
                  axios
                  .post("http://localhost:8080/preEvaluation", preEval)
                  .then((response) => {
                    console.log(response);
                    if (response.status == 201 && response.data != "") {
                      alert("Pre Evaluation successfully created.");
                      window.location.href = "http://localhost:3000/home"
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
          
        }
      
       
    },
    addToAPI(e){
      let preEval = {formCode: "PEmarcleo97@hotmail.com",
            subContractorName:this.state.subcontractorName,
            scopeOfWork: this.state.scopeOfWork, 
            evaluator:this.state.evaluatedBy,
            evaluatedDate: this.state.todayDate,
            formName: "SUBCONTRACTOR’S SAFETY & HEALTH PRE-EVALUATION",
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
            effectiveDate:this.state.signedDate,
            signature: data,
            acknowledgedBy:this.state.acknowledgedBy}

            var buttonValue = e.target.value;
            const axios = require("axios");
            var formid = localStorage.getItem('formid');
            preEval.formCode = formid

            if(buttonValue == "approve"){
              preEval.status = "pendingApproval";
            }
            else{
              preEval.status = "approverRejected";
            }
            axios
            .put("http://localhost:8080/preEvaluation", preEval)
            .then((response) => {
              console.log(response);
              if (response.status == 201 && response.data != "") {
                alert("Pre Evaluation successfully updated.");
              }
              if (response.data == "") {
                alert(
                  "Something went wrong"
                );
              } else {
                alert("Success")
              }
            })
            .catch((error) => {
              console.log(error);
            });


    },
    
    draw(data){ // this draws back the signature that we saved in the database
      this.$refs.signaturePad.clearSignature();
      console.log("Trying to draw the signature");
      this.$refs.signaturePad.fromDataURL(data); // this draws back the signature that we saved
    //this.$refs.signaturePad.fromData(data);
    },
    async getEditInputs(){
        try {
            const axios = require('axios');
            var formid = localStorage.getItem('formid')
            console.log("retrieving data")
            console.log(formid)
            await axios.get(`http://localhost:8080/preEvaluation/${formid}`)
            .then((response) => {
                console.log(response.data);
                console.log(response.status);
                var data = response.data
                this.state.subcontractorName = data.subContractorName
                this.state.scopeOfWork = data.scopeOfWork
                this.state.evaluatedBy = data.evaluator
                this.state.todayDate = moment(data.evaluatedDate).utc().format('YYYY-MM-DD')
                if(data.safetyHealthPolicy){
                  this.state.shpolicy = "true"
                }
                else{
                  this.state.shpolicy = "false"
                }

                if(data.properDelegation){
                  this.state.safetyOrganisation = "true"
                }
                else{
                  this.state.safetyOrganisation = "false"
                }

                if(data.safetyCommitment){
                  this.state.safetyCommit = "true"
                }
                else{
                  this.state.safetyCommit = "false"
                }

                if(data.toolBoxMeeting){
                  this.state.toolbox ="true"
                }
                else{
                  this.state.toolbox = "false"
                }

                if(data.supervisorTraining){
                  this.state.safetyMgtCourses = "true"
                }
                else{
                  this.state.safetyMgtCourses = "false"
                }

                if(data.workerTraining){
                  this.state.safetyWorkersCourses = "true"
                }
                else{
                  this.state.safetyWorkersCourses = "false"
                }

                if(data.certificatesSubmitted){
                  this.state.safetyCertificates = "true"
                }
                else{
                  this.state.safetyCertificates = "false"
                }

                if(data.workerRules){
                  this.state.safetyHealthRules ="true"
                }
                else{
                  this.state.safetyHealthRules ="false"
                }

                if(data.riskAssessmentsSubmitted) {
                  this.state.safeWorkRisk = "true"
                }
                else{
                  this.state.safeWorkRisk = "false"
                }

                if(data.inspectionGuidelines){
                  this.state.writtenProgram = "true"
                }
                else{
                  this.state.writtenProgram = "false"
                }

                if(data.ppe){
                  this.state.safetyEquipment = "true"
                }
                else{
                  this.state.safetyEquipment = "false"
                }

                if(data.safetySupervisor){
                  this.state.safetySupervisor = "true"
                }
                else{
                  this.state.safetySupervisor = "false"
                }

                if(data.firstAider){
                  this.state.firstAider = "true"
                }
                else{
                  this.state.firstAider ="false"
                }

                if(data.relevantLicensedPersonnel){
                  this.state.qualified = "true"
                }
                else{
                  this.state.qualified = "false"
                }

                this.state.tempDisabilityCases = data.temporaryDisabilityCases
                this.state.permDisabilityCases = data.permanentDisabilityCases
                this.state.fatalCases = data.fatalCases
                this.state.signedDate = moment(data.submissionDate).utc().format('YYYY-MM-DD')
                var signdata = data.signature
                this.state.acknowledgedBy= data.acknowledgedBy
                //input the signature back into the signature pad
                this.draw(signdata);
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error + "Hello");
        };
        
      }
  },
  
  created() {
      this.checkuseraccess();
      this.getEditInputs();
      
      
  },
}
</script>

<style>

</style>