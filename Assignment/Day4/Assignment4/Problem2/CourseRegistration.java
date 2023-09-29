package Day4.Assignment4.Problem2;

public class CourseRegistration {
	protected static int regId;
	protected String courseName;

	CourseRegistration() {
		regId++;
	}

	CourseRegistration(String cName) {
		this.courseName = cName;
	}

	public void displayDetails() {
		System.out.println("Registration ID :" + this.regId);
		System.out.println("CourseName :" + this.courseName);
	}
}
