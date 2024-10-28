package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		return "a word, verse, or sentence (such as or a number that reads the same backward or forward ";
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int num) {
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
			int ans = 0;
			while(temp!=0) {
				ans = (ans*10) + (temp%10);
				temp = temp/10;
			}
			if (ans==num) {
				return "Palindrome Number";
			}
			else {
				return "Not a Palindrome Number";
			}
		}
		
		
	}

}
