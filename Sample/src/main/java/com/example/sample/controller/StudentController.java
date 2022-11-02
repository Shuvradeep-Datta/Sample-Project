package com.example.sample.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entities.Student;
import com.example.sample.service.StudentService;



@RestController
public class StudentController {
	
	Logger logger=LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	public StudentService studentService;
	
	@PostMapping("/students")
	public Student SaveStudent(@RequestBody Student student) {
		
		logger.info("Successfully Saved");
		return studentService.SaveStudent(student);
		
		
	}
	@GetMapping("/students")
	public List<Student> fetchStudent(){
		
		
		logger.info("Found the Student List");
		return studentService.fetchStudent();
		
	}
	

}
