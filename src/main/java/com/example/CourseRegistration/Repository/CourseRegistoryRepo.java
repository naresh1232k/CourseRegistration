package com.example.CourseRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseRegistration.Model.Course;
import com.example.CourseRegistration.Model.CourseRegistry;

@Repository
public interface CourseRegistoryRepo extends JpaRepository<CourseRegistry, Integer > {

}
