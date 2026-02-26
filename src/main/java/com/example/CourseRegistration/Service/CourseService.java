package com.example.CourseRegistration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseRegistration.Model.Course;
import com.example.CourseRegistration.Model.CourseRegistry;
import com.example.CourseRegistration.Repository.CourseRegistoryRepo;
import com.example.CourseRegistration.Repository.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;
	
	@Autowired
	CourseRegistoryRepo courseRegrepo;

	public  List<Course> availableCourses() {
	
	  return courseRepo.findAll();
     
}

	public List<CourseRegistry> enrolledStudents() {
		return courseRegrepo.findAll();
		
	}

	public void enrollCourse(String name, String emailId, String courseName) {
		
		CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
		courseRegrepo.save(courseRegistry);
		
	}

}

