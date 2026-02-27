package com.example.CourseRegistration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseRegistration.Model.Course;
import com.example.CourseRegistration.Model.CourseRegistry;
import com.example.CourseRegistration.Service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

	@Autowired
	CourseService courseservice;

  @GetMapping("courses")
	public List<Course> availableCourses(){
		return courseservice.availableCourses();
	}
	
  @GetMapping("courses/enrolled")
  public List<CourseRegistry> enrolledStudentS(){
	  return courseservice.enrolledStudents();
  }
  
  @PostMapping("/courses/register")
  public String enrollCourse(@RequestParam("name") String name, @RequestParam("emailId") String emailId,
		  @RequestParam("courseName") String courseName){
	  
	  
	 courseservice.enrollCourse(name,emailId,courseName);
	 return "Congratulations! " + name + " your "+ courseName + " Course is Enrolled Successfuly ";  
  }
}

