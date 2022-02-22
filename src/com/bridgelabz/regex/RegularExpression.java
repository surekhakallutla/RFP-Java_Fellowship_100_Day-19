package com.bridgelabz.regex;

public class RegularExpression {
	
	public static final String PINCODE_REGEX = "[1-9]{1}[0-9]{2,5}";
	public static final String FNAME_REGEX = "[A-Z]{1}[a-z]{2,}";
	public static final String LNAME_REGEX = "[A-Z]{1}[a-z]{2,}";
	public static final String EMAIL_REGEX = "([a-zA-Z0-9]{1}[a-zA-Z0-9+-_.]{2,})+@([a-zA-Z0-9]{1}[a-zA-Z0-9._])+";
	public static final String MOBILENUMBER_REGEX = "(\\+91)?(-)?\\s*?(91)?\\s*?([6789]{1}[0-9]{4})\\s*?([0-9]{5})";
	public static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[._+=-@#$%^&*])([a-zA-Z0-9._+=-@#$%^&*]{8,})";
	

}
