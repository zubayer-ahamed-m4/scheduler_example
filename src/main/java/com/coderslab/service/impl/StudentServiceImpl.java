package com.coderslab.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coderslab.entity.Student;
import com.coderslab.service.StudentService;

/**
 * @author Zubayer Ahamed
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	private List<Student> students = new ArrayList<>();

	@Override
	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public Integer getStudentListSize() {
		return students.size();
	}

	@Override
	public List<Student> getAllStudent() {
		return students;
	}

}
