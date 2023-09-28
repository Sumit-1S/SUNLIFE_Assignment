package Day2;

public class UserType {
	String name;

	public UserType(String name) {
		super();
		this.name = name;
	}

	public UserType() {
		this("Student");
	}
	
	public static void main(String[] args) {
		UserType userType1 = new UserType("Faculty");
		UserType userType2 = new UserType();
		
		System.out.println(userType1.name);
		System.out.println(userType2.name);
	}
}
