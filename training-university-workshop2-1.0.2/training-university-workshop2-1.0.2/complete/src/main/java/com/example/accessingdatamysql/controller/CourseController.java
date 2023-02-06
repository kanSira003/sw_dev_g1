package com.example.accessingdatamysql.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.*;

import com.example.accessingdatamysql.model.Course;
import com.example.accessingdatamysql.service.CourseService;

@Controller
public class CourseController {


	@Autowired    
	private CourseService courseService;


	/*
	 * @return list all students in a JSONArray with JSONObjects transfermed from Student models
	 */
	// @RequestMapping(path="/students", method=RequestMethod.GET) 
	@GetMapping(path = "/courses") // Compliant
	public @ResponseBody ResponseEntity<Object> getAllCourses() {

		Iterable<Course> resultList = courseService.findAll();

		return ResponseEntity.status(HttpStatus.OK).body(resultList);
	}

	/*
	 * @param student - the Student model with name and optional email  
	 * @return a JSONObject with description "SAVED ID: <student id>!" and the saved Student model.
	 *         The Student model contains four fields as follows:
	 * <ul>
	 *   <li>id - student id</li>
	 *   <li>isActive - true as a default value for new student</li>
	 *   <li>name - parametered name</li>
	 *   <li>email - parametered email</li>
	 * </ul>
	 */
	/*
	 * @return the number of students
	 */
	// @RequestMapping(path="/students", method=RequestMethod.POST) 
	@PostMapping(path = "/courses") // Compliant
	public @ResponseBody ResponseEntity<Object> addCourses(@RequestBody Course course) {

		Course result = courseService.save(course);

		HashMap<String, Object> map = new HashMap<>();
		map.put("description", String.format("SAVED ID: %s!", result.getId()));
		map.put("course", result);
		return ResponseEntity.status(HttpStatus.OK).body(map);
	}

}
