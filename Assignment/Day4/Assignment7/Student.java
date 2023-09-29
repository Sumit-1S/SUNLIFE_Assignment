package Day4.Assignment7;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees = 12000;
	protected int feesPerMonth;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, char studentType, String studentName, int feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
	}

	public void setStudentId(int sId) {
		this.studentId = sId;
	}

	
	public void setStudentType(char sType) {
		this.studentType = sType;
	}

	public void setStudentName(String sName) {
		this.studentName = sName;
	}

	public void getDetails() {
		System.out.println("Student ID :" + studentId);
		System.out.println("Student Type :" + studentType);
	}
	
	public void calculateFees() {
		this.feesPerMonth = semesterFees/6;
	}
	
	public final void displayDetail() {
		
	}
}
