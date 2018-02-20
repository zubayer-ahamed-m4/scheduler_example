package com.coderslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Zubayer Ahamed
 *
 */
@SpringBootApplication
@EnableScheduling
public class SchedulerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerExampleApplication.class, args);
	}
}
