package com.demo3.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class School {
	
	private String schoolName;
	private String Address;
	private Optional<Exam> exam;
	
	public School(String schoolName, String address, Optional<Exam> exam) {
		super();
		this.schoolName = schoolName;
		Address = address;
		this.exam = exam;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Optional<Exam> getExam() {
		return exam;
	}
	public void setExam(Optional<Exam> exam) {
		this.exam = exam;
	}
	
	
}
