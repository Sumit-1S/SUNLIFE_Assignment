package Day4.Assignment4.Problem1;

class DayScholar extends Student{ 
	private String residentialAddress; 
	DayScholar(int studentId, char studentType ,String studName,int semFees, String residentialAddress){ 
		super(studentId, studentType, studName, semFees); 
		this.residentialAddress=residentialAddress; 
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println(" " + this.residentialAddress);
	}
}