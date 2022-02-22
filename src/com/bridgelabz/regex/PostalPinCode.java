package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class PostalPinCode {

	public static void main(String[] args) {
		System.out.println("Enter the Pincode");
		String pinCode = ScannerUtility.StringInput();
//		System.out.println(pinCode + " : "+ Pattern.matches(RegularExpression.pinCodeRegex, pinCode));
		System.out.println(pinCode + " :" + isMatch(RegularExpression.PINCODE_REGEX, pinCode));
	}
	
	private static boolean isMatch(String regex,String userInput) {
		if(Pattern.matches(regex, userInput))
			System.out.println("The given input is valid");
		else
			System.out.println("The given input is invalid");
		return Pattern.matches(regex, userInput);
	}
	
}
