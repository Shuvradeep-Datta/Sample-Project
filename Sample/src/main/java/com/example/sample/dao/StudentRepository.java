package com.example.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.entities.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	//Solve
	public Student findByStudentName(String studentName);

}
