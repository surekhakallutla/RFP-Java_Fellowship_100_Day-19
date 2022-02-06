package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
/*
		System.out.println("Enter mail id 2nd part");
		String eMailUC1 = ScannerUtility.StringInput();
		String eMailRegexUC1 = "[@]{1}[a-z]{2,}";
		System.out.println(eMailUC1 +":"+Pattern.matches(eMailRegexUC1, eMailUC1));
		
		System.out.println("Enter mail id 3rd part");
		String eMailUC2 = ScannerUtility.StringInput();
		String eMailRegexUC2 = "[a-z]{1,}[.]{1}[c]{1}[o]{1}";
		System.out.println(eMailUC2 +":"+Pattern.matches(eMailRegexUC2, eMailUC2));
		
		System.out.println("Enter mail id 1st part");
		String eMailUC3 = ScannerUtility.StringInput();
		String eMailRegexUC3 = "[a-z]{1,}[a-z_+.-]{2,}";
		System.out.println(eMailUC3 +":"+Pattern.matches(eMailRegexUC3, eMailUC3));
*/		
		System.out.println("Enter complete mail id");
		String eMail = ScannerUtility.StringInput();
		String eMailRegex = "[a-z]{1}[a-z_+-.]{2,}[@]{1}[a-z]{2,}[.]{1}[c]{1}[o]{1}[m]{1}";
		System.out.println(eMail +":"+Pattern.matches(eMailRegex, eMail));



	
	}

}
