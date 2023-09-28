package Day2;

public class Student_Assignment10 {
	int studId=550;
	static int studentCount=10;
	char studType;
	String studName;
	public Student_Assignment10() {
		studId=studId+studentCount;
		studentCount+=1;
		// TODO Auto-generated constructor stub
	}
	public Student_Assignment10(char studType, String studFirstName,String studLastName) {
		studId=studId+studentCount;
		studentCount+=1;
		this.studType = studType;
		this.studName = studFirstName + studLastName;
	}
	void displayDetails(Student_Assignment10 s) {
		System.out.println("Student2 [studId=" + studId + ", studType=" + studType + ", studName=" + studName + "]");
	}
	static int getStudentCount() {
		return studentCount;
	}
	public static void main(String[] args) {
		Student_Assignment10 s = new Student_Assignment10('D',"Bony","Thomas");
		s.displayDetails(s);
		Student_Assignment10 s1 = new Student_Assignment10('D',"Dinil","Bose");
		s1.displayDetails(s1);
		Student_Assignment10 s2 = new Student_Assignment10('D',"Bony","Thomas");
		s2.displayDetails(s2);
		
	}
}
