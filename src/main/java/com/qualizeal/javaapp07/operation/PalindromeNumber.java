package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		return "The Word or number that should be same when it is reversed is called palindrome ";
	}
	
	public String verifyIfNumberIsPalindromeOrNot (int num) {
		if (num <0) {
			return "-1";
		}
		else if (num ==0 ) {
			return "-2";
		}
		else if (num>0 && num<10) {
			return "-3";
		}
		else {
			int temp = num;
			int result = 0;
			while(temp!=0) {
				result = (result*10) + (temp%10);
				temp = temp/10;
			}
			if (result==num) {
				return "Palindrome Number";
			}
			else {
				return "Not a Palindrome Number";
			}
		}
		
		
	}

}
