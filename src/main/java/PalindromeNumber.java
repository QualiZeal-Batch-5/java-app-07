package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		
		return "definePalindromeNumber";
		
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int num) {
		int temp = num , rev = 0;
		
		if (num < 0) {
			
			return "-1";
			
		}
		
		if (num == 0) {
			
			return "-2";
			
		}
		
		if (num > 0 && num <= 9) {
			
			return "-3";
			
		}
		
		while(temp != 0) {
			
			rev = (rev*10) + (temp%10);
			temp=temp/10;
			
		}
		
		if (rev == num) {
			
			return "Palindrome Number";
			
		}
		else {
			
			return "Not a Palindrome Number";
		}
	}
}
