<template>
  <div>
    <header>
      <div>
        <h1>Course</h1>
      </div>
    </header>
    <section id="course-section">
      <v-form>
        <v-text-field v-model="courseDetail.course_id" type="number" label="Course ID"></v-text-field>
        <v-text-field v-model="courseDetail.course_name" type="text" label="Course Name"></v-text-field>
        <v-text-field v-model="courseDetail.course_credit" type="number" label="Credit"></v-text-field>
        <v-text-field v-model="courseDetail.course_maxseat" type="number" label="Max Seat"></v-text-field>
        <v-btn color="error" @click="reset">Reset</v-btn>
        <v-btn color="success" @click="addCourse">Add Course</v-btn>
      </v-form>
    </section>
  </div>
</template>

<script>
  import axios from 'axios';
  export default {
    data() {
      return {
        courseDetail: {
          course_id: 0,
          course_name: "",
          course_credit: 0,
          course_maxseat: 0
        }
      }
    },
    methods: {
      addCourse() {
        const endpoint = "";
        console.log("Add Course");
        const isAllField = this.courseDetail.course_id !== 0 && this.courseDetail.course_name !== "" && this.courseDetail.course_detail !== 0 && this.courseDetail.course_maxseat !== 0;

        if(isAllField) {
          console.log("Add Course Success");
          axios.post(endpoint, {
            course_id: this.courseDetail.course_id,
            course_name: this.courseDetail.course_name,
            course_credit: this.courseDetail.course_credit,
            course_maxseat: this.courseDetail.course_maxseat
          })
          .then(response => {
            console.log(response);
            console.log("[SUCCESS] Post Data Success.");
          })
          .catch(error => {
            console.error(error);
            console.log("[ERROR] Post Data Error.");
          })
        } else {
          alert("Please fill in all the field");
        }
      },
      reset() {
        this.courseDetail.course_id = 0;
        this.courseDetail.course_name = "";
        this.courseDetail.course_credit = 0;
        this.courseDetail.course_maxseat = 0;
      }
    }
  }
</script>

<style scoped>
  header {
    text-align: center;
  }

  #course-section {
    width: 50%;
    margin: 0 auto;
  }
</style>
