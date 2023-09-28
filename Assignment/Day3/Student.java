package Day3;

public class Student {
	private int studentId;
	private String studentName;
	private String residentialAddress;
	private double feesPerMonth;
	private String studentType;
	
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public void setFeesPerMonth(double d) {
		this.feesPerMonth = d;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentFirstName, String studentLastName) {
		this.studentName = studentFirstName+studentLastName;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void calculateFees(double semFees) {
		this.setFeesPerMonth(semFees/6.0);
	}
	
	void calculateFees(double semFees,double hostelFees) {
		this.setFeesPerMonth(hostelFees+semFees/6.0);
	}
	
	public static void main(String[] args) {
		Student student = new Student(101,"sumit","singh","F");
		student.setResidentialAddress("Day Scholar");
		
		if(student.getResidentialAddress().equalsIgnoreCase("Day scholar")) {
			student.calculateFees(100000, 50000);
		}else {
			student.calculateFees(100000);
		}
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getResidentialAddress());
		System.out.println(student.getFeesPerMonth());
	}
	public Student(int studentId, String studentFirstName, String studentLastName, String studentType) {
		super();
		this.studentId = studentId;
		this.studentName = studentFirstName+" "+studentLastName;
		this.studentType = studentType;
	}
}
