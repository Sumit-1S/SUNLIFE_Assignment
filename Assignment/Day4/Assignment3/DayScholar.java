package Day4.Assignment3;

public class DayScholar extends Student {
	private String ResidentialAddress;

	public String getResidentialAddress() {
		return ResidentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		ResidentialAddress = residentialAddress;
	}

	public DayScholar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DayScholar(int studentId, String studentFirstName, String studentLastName, String studentType, String address, double feesMonthly) {
		super(studentId, studentFirstName, studentLastName, studentType);
		// TODO Auto-generated constructor stub
		this.setFeesPerMonth(feesMonthly);
		this.ResidentialAddress = address;
	}
	
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println(this.getResidentialAddress());
	}
	
}
