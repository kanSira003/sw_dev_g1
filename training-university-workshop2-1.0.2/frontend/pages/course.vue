<template>
  <div>
    <header>
      <div>
        <h1>Course</h1>
      </div>
    </header>
    <section id="course-section">
      <v-form>
        <v-text-field v-model="courseDetail.course_id" label="Course ID"></v-text-field>
        <v-text-field v-model="courseDetail.course_name" label="Course Name"></v-text-field>
        <v-text-field v-model="courseDetail.course_credit" label="Credit"></v-text-field>
        <v-text-field v-model="courseDetail.course_maxseat" label="Max Seat"></v-text-field>
        <v-btn color="error">Reset</v-btn>
        <v-btn color="success">Add Course</v-btn>
      </v-form>
    </section>
  </div>
</template>

<script>
  // import axios from 'axios';
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

    }
  }
</script>
