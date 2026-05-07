package com.test;

public class Student_score {
	private String name;
	private double score;
	
	public Student_score(String n ,double s) {
		this.name = n;
		this.score = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
}
