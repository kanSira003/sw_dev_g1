<template>
  <div>
    <header>
      <div>
        <h1>Course</h1>
      </div>
    </header>
    <section id="credit-section">
      <div>
        <h3>Credit (Max 12): </h3>
      </div>
    </section>
    <section id="course-section">
      <v-form>
        <v-text-field label="Student ID"></v-text-field>
        <v-text-field label="Course 1"></v-text-field>
        <v-text-field label="Course 2"></v-text-field>
        <v-text-field label="Course 3"></v-text-field>
        <v-text-field label="Course 4"></v-text-field>
        <v-btn color="error">Reset</v-btn>
        <v-btn color="primary">New Course</v-btn>
        <v-btn color="success">Enroll</v-btn>
      </v-form>
    </section>
  </div>
</template>

<script>
  // import axios from 'axios';
  export default {
    data() {
      return {

      }
    },
    methods: {

    }
  }
</script>

<style scoped>
  header {
    text-align: center;
  }

  #credit-section, #course-section {
    width: 50%;
    margin: 0 auto;
  }
</style>
