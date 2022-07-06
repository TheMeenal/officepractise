package com.example.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.students.Services.MyService;
import com.example.students.entity.Students;

@RestController
public class Mycontroller {
	@Autowired
	
	private MyService myservice;
	
	@GetMapping("/studentworld")
	public String studentWorld() {
		return "Welcome to student repository";
	}
	
	@PostMapping("/addstudents")
	public Students addStudents(@RequestBody Students student) {
		return this.myservice.addStudents(student);
	}
	@GetMapping("/getstudents/{id}")
	public Students getStudentInfos(@PathVariable int id) {
		return this.myservice.getStudentInfo(id);
	}
	@PutMapping("/updatestudents")
	public Students updateMarks(@RequestBody Students student) {
		return this.myservice.updateMarks(student);
	}
	@GetMapping("/studentbyname/{name}")
	public Students getStudentByName(@PathVariable String name) {
		return this.myservice.getStudentByName(name);
	}
	@PostMapping("/favstudents/{id}")
	void favStudents(int id) {
	    this.myservice.favStudents(id);
	}

}
