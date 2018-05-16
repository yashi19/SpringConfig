package com.nagarro.repository;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.nagarro.model.Course;
import com.nagarro.model.Student;

@Repository("studentRepository")
public class StudentRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void enrollStudentIntoCourse(Student student) {
		
		entityManager.persist(student);
		entityManager.flush();

	}

	public Student getStudentById(long sid) {
		return entityManager.find(Student.class,sid);
		
//		return  student.getCourses();
	}
	
	
}
