package Day4.Assignment4.Problem1;

public class Student{ 
	protected int studentId; 
	protected char studentType; 
	protected String studentName; 
	protected int semesterFees; 
	protected int feesPerMonth; 
	public Student(int studentId){ 
		this.studentId=studentId; 
	}
	Student(int studentId, char studentType,String studName,int semFees){  
		super(); 
		studentType=studentType; 
		studentName=studName; 
		semesterFees=semFees; 
	}
	void displayDetails () {
		System.out.println(this.studentId + " " + this.studentType + " " + this.studentName + " " + this.semesterFees
				 + " " + this.feesPerMonth);
	} 
}

