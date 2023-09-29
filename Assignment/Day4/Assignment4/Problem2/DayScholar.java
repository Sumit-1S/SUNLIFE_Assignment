package Day4.Assignment4.Problem2;

public class DayScholar extends Student {
	private String residentialAddress;

	DayScholar(int studentId, char studentType, String studName, int semFees, int feesPerMonth, String residentialAddress,
			String cName) {
		super(studentId, studentType, studName, semFees, feesPerMonth, cName);
		this.residentialAddress = residentialAddress;
	}

	@Override
	public void displayDetails() { 
		// need to display the Details of the Student and //DayScholar
		super.displayDetails();
		System.out.println("Student ID: " + this.studentId);
		System.out.println("Student Type: " + this.studentType);
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Semester Fees: " + this.semesterFees);
		System.out.println("Fees per month: " + this.feesPerMonth);
		System.out.println("Residential Address: " + this.residentialAddress);
	}
}
