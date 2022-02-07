package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		System.out.println("Enter Valid First Name");
		String fName = ScannerUtility.StringInput();
		System.out.println(fName + ":" + isMatch(RegularExpression.fNameRegex,fName));
		
		System.out.println("Enter Valid Last Name");
		String lName = ScannerUtility.StringInput();
		System.out.println(lName + ":" + isMatch(RegularExpression.lNameRegex,lName));
		
		System.out.println("Enter Valid email id");
		String eMail = ScannerUtility.StringInput();
		System.out.println(eMail + ":" + isMatch(RegularExpression.eMailRegex,eMail));

		System.out.println("Enter Valid mobile number");
		String mobileNum = ScannerUtility.StringInput();
		System.out.println(mobileNum + ":" + isMatch(RegularExpression.mobileNumRegex,mobileNum));

		System.out.println("Enter Valid password");
		String password = ScannerUtility.StringInput();
		System.out.println(password + ":" + isMatch(RegularExpression.passwordRegex,password));

	}
	
	private static boolean isMatch(String regex,String userInput) {
		boolean isValid = Pattern.matches(regex, userInput);
		if(isValid)
			System.out.println("The given input is valid");
		else
			System.out.println("The given input is invalid");
		return Pattern.matches(regex, userInput);
	}

}
