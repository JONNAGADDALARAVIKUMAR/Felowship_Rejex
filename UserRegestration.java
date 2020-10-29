package rejex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegestration {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		String nameRejex = "^[A-Z]{1}+[A-Za-z]{2,}";
		String mobileNumberRejex = "[+]{0,1}+91+[ ]+[1-9]{1}+[0-9]{9}";
		String emailRejex = "[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-._+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
							+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}"
							+ "+[a-zA-Z]{2,}){0,1}";
		
		System.out.print("Enter First Name : ");
		String firstName = scan.next();
		validate(firstName, nameRejex);
		
		System.out.print("Enter Last Name : ");
		String lastName = scan.next();
		validate(lastName, nameRejex);
		
		System.out.print("Enter Email : ");
		String email = scan.next();
		validate(email, emailRejex);
		
		System.out.print("Enter Mobile Number : ");
		String mobileNumber = scan.nextLine();
		validate(mobileNumber, mobileNumberRejex);
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