package com.coderslab.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coderslab.entity.Student;

/**
 * @author Zubayer Ahamed
 *
 */
@Component
public interface StudentService {

	public void addStudent(Student student);

	public Integer getStudentListSize();

	public List<Student> getAllStudent();

}
