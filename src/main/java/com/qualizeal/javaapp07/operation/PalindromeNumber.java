package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		return "A palindrome number is a number that remains the same when its digits are reversed.";
	}
	
	public String verifyIfNumberIsPalindromeOrNot (int num){
		if(num < 0) return "-1";
		
		else if(num == 0) return "-2";
		
		else if(num < 10) return "-3";
		
		else{
			String result = "";
			int rem;
			int reverse = 0;
			int temp = num;
			
			while(num != 0){
				rem = num % 10;
				num /= 10;
				reverse = (reverse * 10) + rem;
			}
			
			if(temp == reverse){
				result = "Palindrome Number";
			}
			else{
				result = "Not a Palindrome Number";
			}
			
			return result;
		}
	}

}
