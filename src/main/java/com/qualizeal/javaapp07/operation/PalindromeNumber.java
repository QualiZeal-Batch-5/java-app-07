package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
        return "A Palindrome number is a number that remains the same when its digits are reversed.";
    }

	public String verifyIfNumberIsPalindromeOrNot(int num) {
		int result = num;
		int rem = 0;
		int res = 0;
		
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
			
			while(num != 0) {
				rem = num % 10;
				res = res*10 + rem;
				num = num / 10;
			}
			
			if(res == result)
				return "Palindrome Number";
			else
				return "Not a Palindrome Number";
		}
	}

}
