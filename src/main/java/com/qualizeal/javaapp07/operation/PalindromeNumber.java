package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber(){
		return "A palindrome number is a number that remains the same when its digits are reversed";
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int num) {
		if (num < 0) {
            return "-1";
        }
        if (num == 0) {
            return "-2";
        }
        if (num < 10) {
        	return "-3";
        }
        else {
        	int rev = 0, temp = num;
        	while (temp != 0) {
        		rev = rev*10 + temp%10;
        		temp = temp / 10;
        	}
        	if (rev == num) {
        		return "Palindrome Number";
        	}else {
        		return "Not a Palindrome Number";
        	}
        	
        }
	}

}
