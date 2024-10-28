package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		return "A palindrome number is a number that reads the same forwards and backwards, like 121 or 1331.";
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int num) {
		if(num < 0) {
			return "-1";
		} 
		else if(num == 0) {
			return "-2";
		}
		else if(num < 10) {
			return "-3";
		}
		else {
			int originalNumber = num;
			int reverseNumber = 0;
			for(int i = 0 ; i < num ; i++) {
				int digit = num % 10;
				reverseNumber = (reverseNumber * 10) + digit;
				num  /= 10;
			}
			if(originalNumber == reverseNumber) {
				return "Palindrome Number";
			}
			else{
				return "Not a Palindrome Number";
			}
		}
		
	}
}