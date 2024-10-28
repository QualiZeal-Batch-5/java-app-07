package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		return "A palindromic number is a number that remains the same when its digits are reversed";	
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int num1) {
		int temp = num1 , rev = 0;
		if(num1 < 0) {
			return "-1";
		}
		else if(num1 == 0) {
			return "-2";
		}
		else if(num1 < 10) {
			return "-3";
		}
		while(temp != 0) {
			rev = (rev*10) + (temp%10);
			temp=temp/10;
		}
		if(rev == num1) {
			return "Palindrome Number";
		}
		else {
			return "Not a Palindrome Number";
		}
		
	}

}
