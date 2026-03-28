package com.student.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.entity.Student;
import com.student.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;
	
	public Student getStudent(int roll, String name, int age, String mail) {
		
		Student st  = new Student(roll, name, age, mail);
       return stuRepo.save(st);
	}

}
