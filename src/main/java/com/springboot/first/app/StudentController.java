package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("student")
	public Student getStudent() {
		
		return new Student("jon","rusel");
		
	}
	//this return list of object student
	@GetMapping("students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("jojo", "Bisaya"));
		students.add(new Student("uzumaki", "naruto"));
		students.add(new Student("minato", "namikaze"));
		students.add(new Student("toph", "beifong"));
		return students;
	} 

	//http://localhost:8083/jojo/bisaya 
	//add @pathvariable("<text>")  annotation in order to bind the URI{text/text} on the method 
	@GetMapping("/students/{fname}/{lname}") //this is uri path variable "{texxt} "
	public Student studentPathVariable(@PathVariable("fname") String fname, @PathVariable("lname") String lname){
		
		return new Student(fname,lname);
	}

}
