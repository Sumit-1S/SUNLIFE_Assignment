package com.demo3.model;

public class Grading {
	public enum gradeType{
		A, B, C, D, E;
	}
	
	private gradeType studentGrade;
	
	public Grading(gradeType studentGrade) {
		super();
		this.studentGrade = studentGrade;
	}
	public String getStudentGrade() {
		return studentGrade.toString();
	}
	public void setStudentGrade(gradeType studentGrade) {
		this.studentGrade = studentGrade;
	}
	@Override
	public String toString() {
		return "Grading [studentGrade=" + studentGrade + "]";
	}
}
