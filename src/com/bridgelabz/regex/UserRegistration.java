package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
/*
		System.out.println("Enter Valid First Name");
		String fName = ScannerUtility.StringInput();
		System.out.println(fName + ":" + isMatch(RegularExpression.fNameRegex,fName));
		
		System.out.println("Enter Valid Last Name");
		String lName = ScannerUtility.StringInput();
		System.out.println(lName + ":" + isMatch(RegularExpression.lNameRegex,lName));
		
		System.out.println("Enter email id");
		String eMail = ScannerUtility.StringInput();
		System.out.println(eMail + ":" + isMatch(RegularExpression.eMailRegex,eMail));

		System.out.println("Enter mobile number");
		String mobileNum = ScannerUtility.StringInput();
		System.out.println(mobileNum + ":" + isMatch(RegularExpression.mobileNumRegex,mobileNum));

		System.out.println("Enter password");
		String passwordR1 = ScannerUtility.StringInput();
		String passwordR1Regex = "[a-zA-Z0-9._+=-@#$%^&*]{8,20}";
		System.out.println(passwordR1 + ":" + isMatch(passwordR1Regex,passwordR1));

		System.out.println("Enter password");
		String passwordR2 = ScannerUtility.StringInput();
		String passwordR2Regex = "(?=.*[A-Z])([a-zA-Z0-9._+=-@#$%^&*]{8,})";
		System.out.println(passwordR2 + ":" + isMatch(passwordR2Regex,passwordR2));
*/		
		System.out.println("Enter password");
		String passwordR3 = ScannerUtility.StringInput();
		String passwordR3Regex = "(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9._+=-@#$%^&*]{8,})";
		System.out.println(passwordR3 + ":" + isMatch(passwordR3Regex,passwordR3));


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
