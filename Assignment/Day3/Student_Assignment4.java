package Day3;

import Day2.Student;

public class Student_Assignment4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(101);
		s.setName("SUMIT","SINGH");
		s.setStudentType('F');
		
		System.out.println(s.getStudentId());
		System.out.println(s.getName());
		System.out.println(s.getStudentType());
		
		Student s1 = new Student(102,"Saumya","Singh",'F');

		System.out.println(s1.getStudentId());
		System.out.println(s1.getName());
		System.out.println(s1.getStudentType());
	}
}
