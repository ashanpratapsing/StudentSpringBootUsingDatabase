package com.student.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.demo.entity.Student;
import com.student.demo.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService std ;
	
	@GetMapping("/")
	public String welcome() {
	return "index";	
	}
	
	@PostMapping("/student")
	@ResponseBody
	public Student  createStudent(@RequestBody int roll,
			@RequestBody String name,
			@RequestBody int age,
			@RequestBody String mail
			) {
		
	  Student st = std.getStudent(roll, name, age, mail);
	  return st;
	  
	  
//	  Add GitHub
//	  System.out.println("");
	}

}
