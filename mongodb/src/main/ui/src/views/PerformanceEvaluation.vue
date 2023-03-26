<template>
  <div class="container-fluid">
    <!-- <Navigation></Navigation> -->
    <form v-on:submit.prevent="addToAPI" id="form">

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
                id="inlineRadio1"
                value="1"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio2"
                value="2"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio3"
                value="3"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio4"
                value="4"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second"
                id="inlineRadio5"
                value="5"
                v-model="toolBox"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio2"
                value="2"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio3"
                value="3"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio4"
                value="4"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third"
                id="inlineRadio5"
                value="5"
                v-model="compliance"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio2"
                value="2"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio3"
                value="3"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio4"
                value="4"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth"
                id="inlineRadio5"
                value="5"
                v-model="promotionalActivities"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio2"
                value="2"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio3"
                value="3"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio4"
                value="4"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth"
                id="inlineRadio5"
                value="5"
                v-model="submission"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio2"
                value="2"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio3"
                value="3"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio4"
                value="4"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first1"
                id="inlineRadio5"
                value="5"
                v-model="trainingCourse"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio2"
                value="2"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio3"
                value="3"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio4"
                value="4"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second1"
                id="inlineRadio5"
                value="5"
                v-model="tradeCourse"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio2"
                value="2"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio3"
                value="3"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio4"
                value="4"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third1"
                id="inlineRadio5"
                value="5"
                v-model="safetyTalk"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio2"
                value="2"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio3"
                value="3"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio4"
                value="4"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth1"
                id="inlineRadio5"
                value="5"
                v-model="wshsupervisor"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio2"
                value="2"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio3"
                value="3"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio4"
                value="4"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth1"
                id="inlineRadio5"
                value="5"
                v-model="otherTraining"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio2"
                value="2"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio3"
                value="3"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio4"
                value="4"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first2"
                id="inlineRadio5"
                value="5"
                v-model="effort"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio2"
                value="2"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio3"
                value="3"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio4"
                value="4"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second2"
                id="inlineRadio5"
                value="5"
                v-model="permitToWork"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio2"
                value="2"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio3"
                value="3"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio4"
                value="4"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third2"
                id="inlineRadio5"
                value="5"
                v-model="frequencyRate"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio2"
                value="2"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio3"
                value="3"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio4"
                value="4"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth2"
                id="inlineRadio5"
                value="5"
                v-model="safetyOffence"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio2"
                value="2"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio3"
                value="3"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio4"
                value="4"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth2"
                id="inlineRadio5"
                value="5"
                v-model="safetyRectification"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio2"
                value="2"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio3"
                value="3"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio4"
                value="4"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first3"
                id="inlineRadio5"
                value="5"
                v-model="cuttingTool"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio2"
                value="2"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio3"
                value="3"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio4"
                value="4"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second3"
                id="inlineRadio5"
                value="5"
                v-model="ladder"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio2"
                value="2"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio3"
                value="3"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio4"
                value="4"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third3"
                id="inlineRadio5"
                value="5"
                v-model="liftingGear"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio2"
                value="2"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio3"
                value="3"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio4"
                value="4"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth3"
                id="inlineRadio5"
                value="5"
                v-model="electricalEquipment"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio2"
                value="2"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio3"
                value="3"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio4"
                value="4"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth3"
                id="inlineRadio5"
                value="5"
                v-model="otherMachineries"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio2"
                value="2"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio3"
                value="3"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio4"
                value="4"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="first4"
                id="inlineRadio5"
                value="5"
                v-model="commitmentHS"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio2"
                value="2"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio3"
                value="3"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio4"
                value="4"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="second4"
                id="inlineRadio5"
                value="5"
                v-model="ppecompliance"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio2"
                value="2"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio3"
                value="3"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio4"
                value="4"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="third4"
                id="inlineRadio5"
                value="5"
                v-model="siteCleanliness"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio2"
                value="2"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio3"
                value="3"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio4"
                value="4"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fourth4"
                id="inlineRadio5"
                value="5"
                v-model="storeCleanliness"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
                id="inlineRadio1"
                value="1"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio1">Poor</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio2"
                value="2"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio2"
                >Below Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio3"
                value="3"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio3">Average</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio4"
                value="4"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio4"
                >Above Average</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="fifth4"
                id="inlineRadio5"
                value="5"
                v-model="quarterCleanliness"
              />
              <label class="form-check-label" for="inlineRadio5">Good</label>
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
      <button type="submit" class="btn btn-warning mx-3" >Save</button>
      <button type="submit" class="btn btn-success text-white" >Submit</button>
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
    editingornot(){
      if(localStorage.getItem('edit') == 'yes'){
        return true
      }
      return false
    },
    addToAPI() {
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
      console.log(this.wshsupervisor)
      let newForm = {
        date: toIsoString(dt),
        formName: "Performance Evaluation",
        formCompleted: false,
        formApproved: false,
        companyName: "Nike", //need change

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

      var checker = [this.attendance, this.toolBox, this.compliance, this.promotionalActivities, this.submission, this.trainingCourse, this.tradeCourse, this.safetyTalk, this.wshsupervisor, this.otherTraining, this.effort, this.permitToWork, this.frequencyRate, this.safetyOffence, this.safetyRectification, this.cuttingTool, this.ladder, this.liftingGear, this.electricalEquipment, this.otherMachineries, this.commitmentHS, this.ppecompliance, this.siteCleanliness, this.storeCleanliness, this.quarterCleanliness]
      var editing = localStorage.getItem('edit');
      const axios = require('axios');
      if(editing == "yes"){
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
          newForm.formCode = (Math.floor((Math.random() * 100) + 1)).toString()
          
          for (var item of checker) {
            if (item == 0) {
              alert("Please complete the form before submission.");
              return;
            }
          }
          console.log(newForm)
          alert('successful validation')
          newForm.formCompleted = true;
          axios
          .post("http://localhost:8080/healthEvaluation", newForm)
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

