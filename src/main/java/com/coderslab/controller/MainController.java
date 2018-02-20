/**
 * Copyright Coderslab Bangladesh
 */
package com.coderslab.controller;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coderslab.entity.Student;
import com.coderslab.service.StudentService;

/**
 * @author Zubayer Ahamed
 *
 */
@Controller
@RequestMapping("/")
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired StudentService studentService;

	@GetMapping
	public String homePage(Model model) {
		model.addAttribute("totalStudents", studentService.getStudentListSize());
		model.addAttribute("students", studentService.getAllStudent());
		return "index";
	}

	@Scheduled(cron = "0 * * * * ?")
	private void scheduleTaskWithFixedRate() {
		Student student = new Student();
		student.setId(new Random().nextInt(100));
		student.setName("student" + student.getId());
		studentService.addStudent(student);
		logger.info("Sheduler method call at {}", new Date());
	}

}
