package com.example.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sample.entities.Student;


@Service
public interface StudentService {

	public Student SaveStudent(Student student);

	public List<Student> fetchStudent();

	public Student fetchById(Long studentId);
//Solve
	public Student fetchByName(String studentName);

	public Student updateStudentById(Long studentId, Student student);

	

	



}
