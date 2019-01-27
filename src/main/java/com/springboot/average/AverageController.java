package com.springboot.average;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AverageController {

	@Autowired
	private AverageServiceProxy proxy;

	@Autowired
	private Environment environment;

	@GetMapping("/average-student/name/{name}")
	public AverageStudentBean average(@PathVariable String name) {

		AverageStudentBean averageStudentBean = proxy.averageStudentValue(name);

		List<StudentCourse> studentCourses = averageStudentBean.getCourseStudents();
		float average = 0;
		for (StudentCourse studentCourse : studentCourses) {
			average += studentCourse.getScore();
		}
		average = (studentCourses.size() != 0 ? average / studentCourses.size() : 0);
		int port = Integer.parseInt(environment.getProperty("local.server.port"));

		averageStudentBean.setAverage(average);
		averageStudentBean.setPortArverage(port);

		return averageStudentBean;
	}
}
