package com.example.sample.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.dao.StudentRepository;
import com.example.sample.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	public StudentRepository studentRepository;
	

	@Override
	public Student SaveStudent(Student student) {

		return studentRepository.save(student);
	}


	@Override
	public List<Student> fetchStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public Student fetchById(Long studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	}

//Solve
	@Override
	public Student fetchByName(String studentName) {
		// TODO Auto-generated method stub
		return studentRepository.findByStudentName(studentName);
	}


	@Override
	public Student updateStudentById(Long studentId, Student student) {
		
		Student stu = studentRepository.findById(studentId).get();

        if(Objects.nonNull(student.getStudentName()) &&
        !"".equalsIgnoreCase(student.getStudentName())) {
        	stu.setStudentName(student.getStudentName());
        }

        if(Objects.nonNull(student.getStudentCode()) &&
                !"".equalsIgnoreCase(student.getStudentCode())) {
        	stu.setStudentCode(student.getStudentCode());
        }

        if(Objects.nonNull(student.getStudentAddress()) &&
                !"".equalsIgnoreCase(student.getStudentAddress())) {
            stu.setStudentAddress(student.getStudentAddress());
        }

        return studentRepository.save(stu);
	}


	

}
