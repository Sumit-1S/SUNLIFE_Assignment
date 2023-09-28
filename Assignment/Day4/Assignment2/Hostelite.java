package Day4.Assignment2;

public class Hostelite extends Student {
	String hostelName;
	int roomnumber;
	public String getHostelName() {
		return hostelName;
	}
	public int getRoomnumber() {
		return roomnumber;
	}
	public Hostelite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hostelite(int studentId, String studentFirstName, String studentLastName, String studentType,String hostelName, int roomNumber, double feesPerMonth) {
		this.studentId = studentId;
		this.studentName = studentFirstName+" "+studentLastName;
		this.studentType = studentType;
		this.setFeesPerMonth(feesPerMonth);
		this.hostelName = hostelName;
		this.roomnumber = roomNumber;
	}
	
}
