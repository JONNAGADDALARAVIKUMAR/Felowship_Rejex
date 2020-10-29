package rejex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegestration {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		String nameRejex = "^[A-Z]{1}+[A-Za-z]{2,}";
		
		System.out.print("Enter First Name : ");
		String firstName = scan.next();
		validate(firstName, nameRejex);
		
		System.out.print("Enter Last Name : ");
		String lastName = scan.next();
		validate(lastName, nameRejex);	
	}
	
	public static void validate(String validationString, String pattern) {
		
		if(Pattern.matches(pattern, validationString))//Checks Matches or not
			System.out.println("Validated");
		else
			System.out.println("Invalid");
	}
	
	@Override
	protected void finalize() throws Throwable {
		scan.close();
	}
}