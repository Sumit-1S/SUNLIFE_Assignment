package com.demo3.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.demo3.impl.Organizer;
import com.demo3.model.Exam;
import com.demo3.model.Grading;
import com.demo3.model.School;
import com.demo3.model.Shuttle;
import com.demo3.model.Student;

public class Main {
	
	private static School school ;
	
	static {
		Grading grade1 = new Grading(Grading.gradeType.A);
		Shuttle shuttle1 = new Shuttle("s101",17,48);
		Student student1 = new Student(2015556, "Sumit Singh", Optional.of(grade1), Optional.of(shuttle1));
		
		Grading grade2 = new Grading(Grading.gradeType.A);
		Shuttle shuttle2 = new Shuttle("s131",15,26);
		Student student2 = new Student(2015550, "Saumya Singh", Optional.of(grade2), Optional.of(shuttle2));
		
		List<Optional<Student>> ls = new ArrayList();
		
		ls.add(Optional.of(student1));
		ls.add(Optional.of(student2));
		
		Exam exam = new Exam("Acturails","Statistics",ls,LocalDate.now());
		
		school = new School("BBMS","Gurgaon Sector 4",Optional.of(exam));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organizer org = new Organizer();
		org.displayDetails(Optional.of(school));
	}

}
