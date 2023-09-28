package Day2;

public class Student {
	int studentId;
	String Name;
	char studentType;
	public Student() {
		super();
		this.studentId = 10;
		this.studentType = 'F';
	}
	public Student(int studentId, String firstName,String lastName, char studentType) {
		super();
		this.studentId = studentId;
		Name = firstName+" "+lastName;
		this.studentType = studentType;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setName(String firstName,String lastName) {
		this.Name = firstName+" "+lastName;
	}
	public String getName() {
		return Name;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
}
