package com.example.CourseRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseRegistration.Model.Course;

@Repository
public interface CourseRepo extends JpaRepository <Course, String> {

}
