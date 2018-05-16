package com.nagarro.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.model.Course;
import com.nagarro.model.Student;
import com.nagarro.repository.StudentRepository;

@Service("studentService")
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Transactional
	public void enrollStudentIntoCourse(Student student) {
		studentRepository.enrollStudentIntoCourse(student);		
	}

	@Transactional
	public Set<Course> getEnrolledStudent(long sid) {
		Student student=this.studentRepository.getStudentById(sid);
		return student.getCourses();
	}
	
	
	
	
	
}	
