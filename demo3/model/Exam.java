package com.demo3.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Exam {
	private String examName;
	private String Subject;
	private List<Optional<Student>> student;
	private LocalDate DOS;
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public LocalDate getDOS() {
		return DOS;
	}
	public void setDOS(LocalDate dOS) {
		DOS = dOS;
	}
	public List<Optional<Student>> getStudent() {
		return student;
	}
	public void setStudent(List<Optional<Student>> student) {
		this.student = student;
	}
	public Exam(String examName, String subject, List<Optional<Student>> student, LocalDate dOS) {
		super();
		this.examName = examName;
		Subject = subject;
		this.student = student;
		DOS = dOS;
	}
	
	
}
