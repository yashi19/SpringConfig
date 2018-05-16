package com.nagarro.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.model.Course;
import com.nagarro.model.Student;
import com.nagarro.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/enrollStudent")
	public void enrollStudentIntoCourse() {
		
		Student student =new Student("yashika");
		Course course1 =new Course("Angular");
		Course course2 =new Course("Node");
		
		Set<Course> courses=new HashSet<>();
		courses.add(course1);
		courses.add(course2);
		student.setCourses(courses);
		
		studentService.enrollStudentIntoCourse(student);		
	}
	
	
	
	@RequestMapping("/seeStudent")
	public void seeEnroledStudent() {
		
		long sid=1;
		
		Set<Course> courses=studentService.getEnrolledStudent(sid);
		
		for(Course course : courses) {
			System.out.println(course);
		}
	}
}
