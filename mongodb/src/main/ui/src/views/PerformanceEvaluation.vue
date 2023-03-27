<template>
  <div class="container-fluid">
    <!-- <Navigation></Navigation> -->
    <!-- <form v-on:submit.prevent="addToAPI($event)" id="form"> -->
      <form id="form">

    <h2 id="title" class="text-center pt-3">
      SUBCONTRACTOR’S SAFETY & HEALTH PERFORMANCE EVALUATION
    </h2>

    <div class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center mb-5">PART I: PARTICIPATION IN SAFETY</h4>
      <!-- <form> -->
        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >1. Attendance in Safety Meeting</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first"
                id="inlineRadio1"
                value="1"
                v-model="attendance"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first"
                id="inlineRadio2"
                value="2"
                v-model="attendance"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first"
                id="inlineRadio3"
                value="3"
                v-model="attendance"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first"
                id="inlineRadio4"
                value="4"
                v-model="attendance"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first"
                id="inlineRadio5"
                value="5"
                v-model="attendance"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >2. Tool Box Meeting</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio11"
                value="1"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio11">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio21"
                value="2"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio21"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio31"
                value="3"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio31">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio41"
                value="4"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio41"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio51"
                value="5"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio51">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >3. Compliance To Rules & Regulation</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio12"
                value="1"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio12">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio22"
                value="2"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio22"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio32"
                value="3"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio32">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio42"
                value="4"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio42"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio52"
                value="5"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio52">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >4. Safety Promotional Activities</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio13"
                value="1"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio13">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio23"
                value="2"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio23"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio33"
                value="3"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio33">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio43"
                value="4"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio43"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio53"
                value="5"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio53">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >5. Document Submission</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio14"
                value="1"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio14">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio24"
                value="2"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio24"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio34"
                value="3"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio34">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio44"
                value="4"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio44"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio54"
                value="5"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio54">Good</label>
            </div>
          </div>
        </div>
      <!-- </form> -->

      <h5 class="text-center my-3">SCORE (I): {{ computeScoreOne }}</h5>
    </div>

    <div class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center mb-5">
        PART II: SAFETY TRAINING AND COMPETENCIES (PERCENTAGE OF ATTENDANCE)
      </h4>
      <!-- <form> -->
        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >6. Statutory Safety Training Course</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio15"
                value="1"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio15">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio25"
                value="2"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio25"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio35"
                value="3"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio35">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio45"
                value="4"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio45"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio55"
                value="5"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio55">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >7. Safety Trade Course</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio16"
                value="1"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio16">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio26"
                value="2"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio26"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio36"
                value="3"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio36">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio46"
                value="4"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio46"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio56"
                value="5"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio56">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >8. Mass Safety Talk</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio17"
                value="1"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio17">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio27"
                value="2"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio27"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio37"
                value="3"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio37">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio47"
                value="4"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio47"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio57"
                value="5"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio57">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >9. WSH Safety Coordinator/ Supervisor</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio18"
                value="1"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio18">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio28"
                value="2"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio28"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio38"
                value="3"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio38">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio48"
                value="4"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio48"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio58"
                value="5"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio58">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >10. Other Safety Training</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio19"
                value="1"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio19">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio29"
                value="2"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio29"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio39"
                value="3"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio39">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio49"
                value="4"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio49"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio59"
                value="5"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio59">Good</label>
            </div>
          </div>
        </div>
      <!-- </form> -->
      <!-- <h5 v-if="editingornot" class="text-center my-3">SCORE (II): {{ score2 }}</h5> -->
      <h5  class="text-center my-3">SCORE (II): {{ computeScoreTwo }}</h5>
    </div>

    <div class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center mb-5">PART III: ACCIDENT/ INCIDENT PREVIEW</h4>
      <!-- <form> -->
        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >11. Effort in Accident Prevention</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio10"
                value="1"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio10">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio20"
                value="2"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio20"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio30"
                value="3"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio30">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio40"
                value="4"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio40"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio50"
                value="5"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio50">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >12. Safe Work Practice/ Permit To Work</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio111"
                value="1"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio111">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio211"
                value="2"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio211"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio311"
                value="3"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio311">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio411"
                value="4"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio411"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio511"
                value="5"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio511">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >13. Incident Severity & Frequency Rate</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio112"
                value="1"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio112">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio212"
                value="2"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio212"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio312"
                value="3"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio312">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio412"
                value="4"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio412"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio512"
                value="5"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio512">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >14. Safety Offence</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio113"
                value="1"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio113">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio213"
                value="2"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio213"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio313"
                value="3"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio313">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio413"
                value="4"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio413"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio513"
                value="5"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio513">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >15. Safety Inspection And Rectification</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio114"
                value="1"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio114">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio214"
                value="2"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio214"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio314"
                value="3"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio314">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio414"
                value="4"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio414"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio514"
                value="5"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio514">Good</label>
            </div>
          </div>
        </div>
      <!-- </form> -->

      <h5 class="text-center my-3">SCORE (III): {{ computeScoreThree }}</h5>
    </div>

    <div class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center mb-5">PART IV: MAINTENANCE OF EQUIPMENT</h4>
      <!-- <form> -->
        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >16. Explosive Powered Tool/ Cutting Tool</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio115"
                value="1"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio115">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio215"
                value="2"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio215"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio315"
                value="3"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio315">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio415"
                value="4"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio415"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio515"
                value="5"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio515">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >17. Ladder</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio116"
                value="1"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio116">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio216"
                value="2"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio216"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio316"
                value="3"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio316">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio416"
                value="4"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio416"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio516"
                value="5"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio516">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >18. Lifting Gear/ Appliance/ Machine</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio117"
                value="1"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio117">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio217"
                value="2"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio217"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio317"
                value="3"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio317">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio417"
                value="4"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio417"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio517"
                value="5"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio517">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >19. Electrical Equipment/ Compressor</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio118"
                value="1"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio118">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio218"
                value="2"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio218"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio318"
                value="3"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio318">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio418"
                value="4"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio418"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio518"
                value="5"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio518">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >20. Other Machineries</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio119"
                value="1"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio119">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio219"
                value="2"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio219"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio319"
                value="3"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio319">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio419"
                value="4"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio419"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio519"
                value="5"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio519">Good</label>
            </div>
          </div>
        </div>
      <!-- </form> -->

      <h5 class="text-center my-3">SCORE (IV): {{ computeScoreFour }}</h5>
    </div>

    <div class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center mb-5">PART V: GENERAL HOUSEKEEPING & Others</h4>
      <!-- <form> -->
        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >21. Subcon Snr Mgt Commitment to HS</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio120"
                value="1"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio120">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio220"
                value="2"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio220"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio320"
                value="3"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio320">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio420"
                value="4"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio420"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio520"
                value="5"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio520">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >22. Compliance with PPE</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio121"
                value="1"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio121">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio221"
                value="2"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio221"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio321"
                value="3"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio321">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio421"
                value="4"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio421"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio521"
                value="5"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio521">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >23. Housekeeping & Cleanliness at Site</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio122"
                value="1"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio122">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio222"
                value="2"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio222"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio322"
                value="3"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio322">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio422"
                value="4"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio422"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio522"
                value="5"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio522">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >24. Housekeeping & Cleanliness at Store</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio123"
                value="1"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio123">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio223"
                value="2"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio223"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio323"
                value="3"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio323">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio423"
                value="4"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio423"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio523"
                value="5"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio523">Good</label>
            </div>
          </div>
        </div>

        <div class="m-3 d-flex">
          <label for="first" class="form-label fw-bold" style="width: 400px"
            >25. Housekeeping & Cleanliness at Quarter</label
          >
          <div class="d-flex justify-content-between w-75">
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio124"
                value="1"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio124">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio224"
                value="2"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio224"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio324"
                value="3"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio324">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio424"
                value="4"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio424"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio524"
                value="5"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio524">Good</label>
            </div>
          </div>
        </div>
      <!-- </form> -->
      <h5 class="text-center my-3">SCORE (V): {{ computeScoreFive }}</h5>
    </div>

    <div class="row bg-light m-5 rounded p-3 border text-center">
      <h3>OVERALL SCORE: {{ computeOverallScore.toFixed(2) }}%</h3>
      <h3>Performance Standard: {{ computePerformanceStandard }}</h3>
    </div>

    <div class="row bg-light m-5 rounded p-3 border">
      <h4 class="text-center">Additional Comments</h4>
      <!-- <form> -->
        <div class="form-floating my-4">
          <textarea
            class="form-control"
            placeholder="Leave a comment here"
            id="floatingTextarea2"
            style="height: 100px"
            v-model="comments"
          ></textarea>
          <label for="floatingTextarea2"></label>
        </div>
      <!-- </form> -->
    </div>


    <div class="text-center m-3">
      <button type="button" @click="addToAPI($event)" value="save" class="btn btn-warning mx-3" >Save</button>
      <button type="button" @click="addToAPI($event)" value="submit" class="btn btn-success text-white" >Submit</button>
    </div>
    <!-- <Footer></Footer> -->
  </form>

  </div>
</template>

<script>
export default {
  name: "Questionnaire",
  data() {
    return {
      // formCode: "formcode1",
      // formDate: "2023-03-07",
      // formName: "health evaluation",
      // formCompleted: false,
      // formApproved: false,
      // companyName: "Nike",

      attendance: 0,
      toolBox: 0,
      compliance: 0,
      promotionalActivities: 0,
      submission: 0,
      score1: 0,

      trainingCourse: 0,
      tradeCourse: 0,
      safetyTalk: 0,
      wshsupervisor: 0,
      otherTraining: 0,
      score2: 0,

      effort: 0,
      permitToWork: 0,
      frequencyRate: 0,
      safetyOffence: 0,
      safetyRectification: 0,
      score3: 0,

      cuttingTool: 0,
      ladder: 0,
      liftingGear: 0,
      electricalEquipment: 0,
      otherMachineries: 0,
      score4: 0,

      commitmentHS: 0,
      ppecompliance: 0,
      siteCleanliness: 0,
      storeCleanliness: 0,
      quarterCleanliness: 0,
      score5: 0,

      overallScore: 0,
      performanceStandard: "",
      comments: "",

      safetyCoordinator: "",
      safetyCoordinatorSignature: "",
      safetyCoordinatorEvaluationDate: "",

      director: "",
      directorSignature: "",
      directorApprovalDate: "",
    };
  },
  methods: {
    // editingornot(){
    //   if(localStorage.getItem('edit') == 'yes'){
    //     return true
    //   }
    //   return false
    // },
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
        date: toIsoString(dt),
        formName: "Performance Evaluation Form",
        status: "incomplete",
        companyName: JSON.parse(localStorage.getItem('specificuser'))['username'], 

        attendance: this.attendance,
        toolBox: this.toolBox,
        compliance: this.compliance,
        promotionalActivities: this.promotionalActivities,
        submission: this.submission,
        score1: this.score1,

        trainingCourse: this.trainingCourse,
        tradeCourse: this.tradeCourse,
        safetyTalk: this.safetyTalk,
        wshsupervisor: this.wshsupervisor,
        otherTraining: this.otherTraining,
        score2: this.score2,

        effort: this.effort,
        permitToWork: this.permitToWork,
        frequencyRate: this.frequencyRate,
        safetyOffence: this.safetyOffence,
        safetyRectification: this.safetyRectification,
        score3: this.score3,

        cuttingTool: this.cuttingTool,
        ladder: this.ladder,
        liftingGear: this.liftingGear,
        electricalEquipment: this.electricalEquipment,
        otherMachineries: this.otherMachineries,
        score4: this.score4,

        commitmentHS: this.commitmentHS,
        ppecompliance: this.ppecompliance,
        siteCleanliness: this.siteCleanliness,
        storeCleanliness: this.storeCleanliness,
        quarterCleanliness: this.quarterCleanliness,
        score5: this.score5,

        overallScore: this.overallScore,
        performanceStandard: this.performanceStandard,
        comments: this.comments,

        safetyCoordinator: this.safetyCoordinator,
        safetyCoordinatorSignature: this.safetyCoordinatorSignature,
        safetyCoordinatorEvaluationDate: this.safetyCoordinatorEvaluationDate,

        director: this.director,
        directorSignature: this.directorSignature,
        directorApprovalDate: this.directorApprovalDate,
      };
      var buttonValue = e.target.value;
      console.log(buttonValue)
      var checker = [this.attendance, this.toolBox, this.compliance, this.promotionalActivities, this.submission, this.trainingCourse, this.tradeCourse, this.safetyTalk, this.wshsupervisor, this.otherTraining, this.effort, this.permitToWork, this.frequencyRate, this.safetyOffence, this.safetyRectification, this.cuttingTool, this.ladder, this.liftingGear, this.electricalEquipment, this.otherMachineries, this.commitmentHS, this.ppecompliance, this.siteCleanliness, this.storeCleanliness, this.quarterCleanliness]
      // var editing = localStorage.getItem('edit');
      const axios = require('axios');
      if(buttonValue == "save"){
        console.log(newForm)
        var formid = localStorage.getItem('formid')
        newForm.formCode = formid
        console.log(newForm)
          axios
              .put("http://localhost:8080/healthEvaluation", newForm)
              .then((response) => {
                console.log(response);
                // localStorage.setItem('edit',false);
                    alert("form saved")
                window.location.href = "http://localhost:3000/home"
              })
        }else{
          var formid = localStorage.getItem('formid')
          newForm.formCode = formid
          for (var item of checker) {
            if (item == 0) {
              alert("Please complete the form before submission.");
              return;
            }
          }
          console.log(newForm)
          alert('successful validation')
          newForm.status = "pendingEvaluation";
          axios
          .put("http://localhost:8080/healthEvaluation", newForm)
          .then((response) => {
            console.log(response);
            // localStorage.setItem('edit',false);
            // localStorage.setItem('form','');
                alert("form submitted")
            window.location.href = "http://localhost:3000/home"
          })
          .catch((error) => {
            alert('form failed')
            console.log(error);
          });
          
          localStorage.clear();
        }
      
    },
    async getEditInputs(){
        try {
            const axios = require('axios');
            var formid = localStorage.getItem('formid')
            console.log(typeof this.wshsupervisor)
            await axios.get(`http://localhost:8080/healthEvaluation/${formid}`)
            .then((response) => {
                console.log(response.data);
                var data = response.data
                console.log( data.score2)
                this.attendance = data.attendance
                this.toolBox = data.toolBox
                this.compliance = data.compliance
                this.promotionalActivities = data.promotionalActivities
                this.submission = data.submission
                this.score1 = data.score1

                this.trainingCourse= data.trainingCourse
                this.tradeCourse= data.tradeCourse
                this.safetyTalk= data.safetyTalk
                this.wshsupervisor= data.wshsupervisor
                this.otherTraining= data.otherTraining
                this.score2= data.score2
              console.log(this.wshsupervisor)
                this.effort= data.effort
                this.permitToWork= data.permitToWork
                this.frequencyRate= data.frequencyRate
                this.safetyOffence= data.safetyOffence
                this.safetyRectification= data.safetyRectification
                this.score3= data.score3

                this.cuttingTool= data.cuttingTool
                this.ladder= data.ladder
                this.liftingGear= data.liftingGear
                this.electricalEquipment= data.electricalEquipment
                this.otherMachineries= data.otherMachineries
                this.score4= data.score4

                this.commitmentHS= data.commitmentHS
                this.ppecompliance= data.ppecompliance
                this.siteCleanliness= data.siteCleanliness
                this.storeCleanliness= data.storeCleanliness
                this.quarterCleanliness= data.quarterCleanliness
                this.score5= data.score5

                this.overallScore=  data.overallScore
                this.performanceStandard= data.performanceStandard
                this.comments= data.comments

                this.safetyCoordinator= data.safetyCoordinator
                this.safetyCoordinatorSignature= data.safetyCoordinatorSignature
                this.safetyCoordinatorEvaluationDate= data.safetyCoordinatorEvaluationDate

                this.director= data.director
                this.directorSignature= data.directorSignature
                this.directorApprovalDate= data.directorApprovalDate
                
            })
            .catch ((error) => {
                console.log(error);
            })
        } catch (error) {
            console.log(error);
        };
      }
  },
  computed: {
    computeScoreOne() {
      this.score1 =
        parseInt(this.attendance) +
        parseInt(this.toolBox) +
        parseInt(this.compliance) +
        parseInt(this.promotionalActivities) +
        parseInt(this.submission);
      if(Number.isNaN(this.score1)){
        return 0
      }
      console.log( this.score1)
      return this.score1;
    },
    computeScoreTwo() {
      console.log(this.wshsupervisor)

      this.score2 =
        parseInt(this.trainingCourse) +
        parseInt(this.tradeCourse) +
        parseInt(this.safetyTalk) +
        parseInt(this.wshsupervisor) +
        parseInt(this.otherTraining)
      console.log(this.wshsupervisor)
      if(Number.isNaN(this.score2)){
        return 0
      }
      return this.score2;
    },
    computeScoreThree() {
      this.score3 =
        parseInt(this.effort) +
        parseInt(this.permitToWork) +
        parseInt(this.frequencyRate) +
        parseInt(this.safetyOffence) +
        parseInt(this.safetyRectification);
      if(Number.isNaN(this.score3)){
        return 0
      }
      return this.score3;
    },
    computeScoreFour() {
      this.score4 =
        parseInt(this.cuttingTool) +
        parseInt(this.ladder) +
        parseInt(this.liftingGear) +
        parseInt(this.electricalEquipment) +
        parseInt(this.otherMachineries);
        if(Number.isNaN(this.score4)){
        return 0
      }
      return this.score4;
    },
    computeScoreFive() {
      this.score5 =
        parseInt(this.commitmentHS) +
        parseInt(this.ppecompliance) +
        parseInt(this.siteCleanliness) +
        parseInt(this.storeCleanliness) +
        parseInt(this.quarterCleanliness);
        if(Number.isNaN(this.score5)){
        return 0
      }
      return this.score5;
    },
    computeOverallScore() {
      this.overallScore =
        (((this.score1 + this.score2 + this.score3 + this.score4 + this.score5) /
          (25 * 5)) *
        100);
        console.log(this.overallScore)
        if(Number.isNaN(this.overallScore)){
        return 0
      }
      return this.overallScore;
    },
    computePerformanceStandard() {
      if (this.overallScore <= 39) {
        this.performanceStandard = "Poor";
      } else if (this.overallScore <= 49) {
        this.performanceStandard = "Below Average";
      } else if (this.overallScore <= 64) {
        this.performanceStandard = "Average";
      } else if (this.overallScore <= 84) {
        this.performanceStandard = "Above Average";
      } else {
        this.performanceStandard = "Good";
      }
      if(Number.isNaN(this.performanceStandard)){
        return 0
      }
      return this.performanceStandard;
    },
  },
  created() {
      this.getEditInputs();
  },
};
</script>

