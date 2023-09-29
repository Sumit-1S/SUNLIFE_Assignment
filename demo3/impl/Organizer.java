package com.demo3.impl;

import java.util.Optional;

import com.demo3.inter.SchoolDAO;
import com.demo3.model.Exam;
import com.demo3.model.School;

public class Organizer implements SchoolDAO {

	@Override
	public void displayDetails(Optional<School> school) {
		// TODO Auto-generated method stub
		school.flatMap(School::getExam)
		.map(Exam::getStudent).get()	
		.forEach(s->System.out.println("Student ID: "+s.get().getStudentId()
				+"\nStudent Name: "+s.get().getStudentName()+"\nGrades: "
				+s.get().getGrade().get()+"\nShuttle: "+s.get().getShuttle().get()));
	}

}
