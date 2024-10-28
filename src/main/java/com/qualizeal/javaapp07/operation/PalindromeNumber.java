package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	
	public String definePalindromeNumber() {
		return "A palindromic number is a number that remains the same when its digits are reversed";
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int number){
		if(number < 0) {
			return "-1";
		}
		else if(number == 0) {
			return "-2";
		}
		else if((number / 10) == 0) {
			return "-3";
		}
		else {
			int reminder = 0;
			int reverse = 0;
			int d = number;
			while(number > 0 ) {
				reminder = number % 10;
				reverse = reverse * 10 + reminder;
				number = number / 10;
				
			}
			if(reverse == d) {
				return "Palindrome Number";
			}
			else {
				return "Not a Palindrome Number";
			}
		}
		
	}
	
}
