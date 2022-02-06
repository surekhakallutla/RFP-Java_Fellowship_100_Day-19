package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Enter Valid First Name");
		String fName = ScannerUtility.StringInput();
		System.out.println(fName + ":" + isMatch(RegularExpression.fNameRegex,fName));
		
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
