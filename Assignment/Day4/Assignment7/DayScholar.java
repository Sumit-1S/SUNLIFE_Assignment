package Day4.Assignment7;

public class DayScholar extends Student{
	private String residentialAddress;

	public DayScholar() {
		
	}
	
	

	public DayScholar(int studentId, char studentType, String studentName, int feesPerMonth, String residentialAddress) {
		super(studentId, studentType, studentName, feesPerMonth);
		this.residentialAddress = residentialAddress;
	}



	public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}

	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name " + studentName);
		System.out.println("Residential Address" + residentialAddress);
	}
	
	public void displayDaySDetails() {
		System.out.println(this.studentId + " " + this.studentName + " " + this.studentType + " " + this.feesPerMonth + " "
				+ this.residentialAddress);
	}
}
