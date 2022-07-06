package com.example.students.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.students.entity.Students;
@Service
public class ServiceImpl implements MyService {

	
	List<Students> list=new ArrayList<>();

	public Students addStudents(Students student) {
			list.add(student);
			return student;
	}
	
	public Students getStudentInfo(int id) 
	{
		Students s= null;

		for(Students studentinfo:list) 
		{
			if(studentinfo.getId()==id)
			{
				s=studentinfo;
				break;
			}
		}
		return s;
		
	}
	
	@Override
	public Students updateMarks(Students student)
	{
		list.forEach(e-> {
			if(e.getId()==student.getId())
			{
			e.setMarks(student.getMarks());
			}
		});
		return (student);
	}
	@Override
	public Students getStudentByName(String name) 
	{
		Students s= null;

		for(Students studentname:list) 
		{
			if(studentname.getName()==name)
			{
				s=studentname;
				break;
			}
		}
		return s;
		
	}
	@Override
	public void favStudents(int id) {
		Students s=list.get(id);
		s.setFavorite(!s.isFavorite());
		System.out.println(s);
		}
	
}