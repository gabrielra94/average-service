package com.springboot.average;

public class StudentCourse {

	private Long id;
	private String name;
	private String student;
	private float score;

	public StudentCourse() {
		super();
	}

	public StudentCourse(Long id, String name, String student, float score) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStudent() {
		return student;
	}

	public float getScore() {
		return score;
	}
}
