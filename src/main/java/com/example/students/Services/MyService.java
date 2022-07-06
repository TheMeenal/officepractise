package com.example.students.Services;

import com.example.students.entity.Students;

public interface MyService {
	
	
	public Students getStudentInfo(int id);
	
	public Students addStudents(Students student);

	public Students getStudentByName(String name);

	void favStudents(int id);

	public Students updateMarks(Students student);
	
	

}
