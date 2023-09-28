package Day2;

public class CourseManagement {
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(10);
		s.setStudentType('J');
		Student stud = new Student();
		stud.setStudentId(s.getStudentId());
		stud.setStudentType(s.getStudentType());
		System.out.println(stud.getStudentId());
		System.out.println(stud.getStudentType());
		Student studTemp = new Student();
		System.out.println(studTemp.getStudentId());
		System.out.println(studTemp.getStudentType());
		
	}
}
