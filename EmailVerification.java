package rejex;

import java.util.regex.Pattern;

public class EmailVerification {
	
	public void verifyEmail(String emailRejex) {
	String[] emailExamples = {"abc@yahoo.com",
			"abc-100@yahoo.com",
			"abc.100@yahoo.com",
			"abc111@abc.com",
			"abc-100@abc.net",
			"abc.100@abc.com.au",
			"abc@1.com",
			"abc@gmail.com.com",
			"abc+100@gmail.com",
			"abc",
			"abc@.com.my",
			"abc123@gmail.a",
			"abc123@.com",
			"abc123@.com.com",
			".abc@abc.com",
			"abc()*@gmail.com",
			"abc@%*.com",
			"abc..2002@gmail.com",
			"abc.@gmail.com",
			"abc@abc@gmail.com",
			"abc@gmail.com.1a",
			"abc@gmail.com.aa.au"};
	
		for(int i=0;i<emailExamples.length;i++)
		{
			if(Pattern.matches(emailRejex, emailExamples[i]))//Checks Matches or not
				System.out.println((i+1)+": Validated");
			else
				System.out.println((i+1)+": Invalid");
		}
	}

}
