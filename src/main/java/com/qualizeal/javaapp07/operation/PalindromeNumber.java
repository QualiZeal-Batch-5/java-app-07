package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	
	public String definePalindromeNumber() {
		return "A palindrome is a sequence of characters that reads the same forward and backward";
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int num) {
		
		if(num < 0) {
			return "-1";
		}
		
		if(num == 0) {
			return "-2";
		}
		
		if(num < 10) {
			return "-3";
		}
		
		String NumberasString = String.valueOf(num);
		String reverse = new StringBuilder(NumberasString).reverse().toString();
		
		if(reverse.equals(NumberasString)) {
			return "Palindrome Number";
		}
		
		return "Not a Palindrome Number";
	}
}
