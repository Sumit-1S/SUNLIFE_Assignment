package com.demo3.model;

import java.util.Optional;

public class Student {
	private int studentId;
	private String studentName;
	private Optional<Grading> grade;
	private Optional<Shuttle> shuttle;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Optional<Grading> getGrade() {
		return grade;
	}
	public void setGrade(Optional<Grading> grade) {
		this.grade = grade;
	}
	public Optional<Shuttle> getShuttle() {
		return shuttle;
	}
	public void setShuttle(Optional<Shuttle> shuttle) {
		this.shuttle = shuttle;
	}
	public Student(int studentId, String studentName, Optional<Grading> grade, Optional<Shuttle> shuttle) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		this.shuttle = shuttle;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", grade=" + grade.get() + ", shuttle="
				+ shuttle.get() + "]";
	}
	
	
}
