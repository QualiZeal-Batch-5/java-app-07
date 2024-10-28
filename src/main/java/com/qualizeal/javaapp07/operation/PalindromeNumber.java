package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		return "PalindromeNumber : It is a number that remains the same when its digits are reversed"; 
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int number) {
		if(number < 0) {
			return "-1";
		}
		else if(number == 0) {
			return "-2";
		}
		else if(number%10 == number) {
			return "-3";
		}
		else {
			int temp = number;
			int result = 0;
			while(number > 0) {
				int remainder =number % 10;
				result = result * 10 + remainder;
				number = number / 10;
			}
			if(result == temp) {
				return "Palindrome Number";
			}
			return "Not a Palindrome Number";
		}
		
	}

}