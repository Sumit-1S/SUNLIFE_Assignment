package Day4.Assignment4.Problem2;

public class Student extends CourseRegistration{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;

	Student(String cName){ 
		super(cName); 
	}
	
	Student() {
		super();
	}

	Student(int studentId,char studentType,String studName,int semFees, int feesPerMonth,String cName){
		super(cName); 
		this.feesPerMonth=feesPerMonth;
		this.studentType=studentType;
		this.studentId=studentId;
		this.studentName=studName; 
		this.semesterFees=semFees; 
	}
}
