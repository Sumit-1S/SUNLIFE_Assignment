package Day2;

public class paasByVal {
	public static void main(String[] args) {
		int sId=25;
		paasByVal val = new paasByVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are "+sId);
		
		Student stud = new Student();
		System.out.println(stud.studentId);
		val.passTheValueMethodStudent(stud);		
		System.out.println("The sId are "+stud.studentId);
	}
	public void passTheValueMethod(int sId) {
		sId=10;
		System.out.println("The sId are "+sId);
	}
	
	public void passTheValueMethodStudent(Student sId) {
		sId.studentId=10;
		System.out.println("The sId are "+sId.studentId);
	}
}
