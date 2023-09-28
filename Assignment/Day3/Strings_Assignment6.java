package Day3;

import java.util.Scanner;

public class Strings_Assignment6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		System.out.println(userName.length());
		System.out.println("Hi "+userName);
		System.out.println(userName.toLowerCase());
		System.out.println(userName.toUpperCase());
		System.out.println(userName.startsWith("a"));
	}
}
