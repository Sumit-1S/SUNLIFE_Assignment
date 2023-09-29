package Day4.Assignment7;

public class DynamicEx {
	public static void main(String args[]) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		dayScholar.setResAddress("NO 32/3 Vijyanagar");
		dayScholar.calculateFees();
		dayScholar.displayDaySDetails();
	}
}
