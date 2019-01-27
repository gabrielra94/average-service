package com.springboot.average;

import java.util.List;

public class AverageStudentBean {

	private String studentConsulted;
	private float average;
	private int port;
	private int portArverage;
	private List<StudentCourse> studentCourses;

	public AverageStudentBean() {
		super();
	}

	public AverageStudentBean(String studentConsulted, int port, List<StudentCourse> studentCourses) {
		super();
		this.studentConsulted = studentConsulted;
		this.port = port;
		this.studentCourses = studentCourses;
	}

	public String getStudentConsulted() {
		return studentConsulted;
	}

	public float getAverage() {
		return average;
	}

	public int getPort() {
		return port;
	}

	public int getPortArverage() {
		return portArverage;
	}

	public List<StudentCourse> getCourseStudents() {
		return studentCourses;
	}

	public void setStudentConsulted(String studentConsulted) {
		this.studentConsulted = studentConsulted;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setPortArverage(int portArverage) {
		this.portArverage = portArverage;
	}

	public void setCourseStudents(List<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}
}
