package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	 public String definePalindromeNumber() {
	        return "A palindrome number is a number that remains the same when it is in reverse order.";
	    }

	    public String verifyIfNumberIsPalindromeOrNot(int number) {
	        
	        if (number < 0) {
	            return "-1";
	        }
	       
	        if (number == 0) {
	            return "-2";
	        }
	       
	        if (number < 10) {
	            return "-3";
	        }

	        String strNum = String.valueOf(number);
	        String reversedStrNum = new StringBuilder(strNum).reverse().toString();

	        if (strNum.equals(reversedStrNum)) {
	            return "Palindrome Number";
	        }  else {
	        	return "Not a Palindrome Number";
	        }
	    }

}
