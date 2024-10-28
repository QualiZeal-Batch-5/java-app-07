package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		return "A palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards";
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int num) {
		if(num < 0) {
			return "-1";
		}
		
		else if(num == 0) {
			return "-2";
		}
		else if(num % 10 == num) {
			return "-3";
		}
		else {
			int temp = num,result = 0,remainder;
			while(num > 0) {
				remainder = num % 10;
				result = result * 10 +remainder; 
				num = num /10;
				
			}
			if(temp == result) {
				return "Palindrome Number";
			}
			else {
				return "Not a Palindrome Number";
			}
		}
		
	}
}
