package com.jwt.demo.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	List<Student> students = new ArrayList<>(
			List.of(new Student(1L, "radhe", "xyz@abc.com"), new Student(2L, "shyam", "pqr@abc.com")));

	@GetMapping("/students")
	public List<Student> getAll() {
		return students;
	}

	@GetMapping("/add")
	public Student save(@RequestBody Student student) {
		students.add(student);
		return student;
	}
}
