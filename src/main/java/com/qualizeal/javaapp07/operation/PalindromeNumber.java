package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	
	public String definePalindromeNumber() {
		
		return "Palindrome is a number that remains the same when it's digits are reversed.";
		
	}
	
	public String verifyIfNumberIsPalindromeOrNot(int number) {
		
		if (number < 0) 
		{
            return "-1";
        } 
		else if (number == 0) 
        {
            return "-2";
        }
		else if (number >= 0 && number < 10) 
        {
            return "-3";
        }
		else 
        {
        	int original_Number = number;
            int reversed_Number = 0;

            while (number > 0) 
            {
                int lastDigit = number % 10;
                reversed_Number = reversed_Number * 10 + lastDigit;
                number /= 10;
            }

            if (original_Number == reversed_Number) 
            {
                return "Palindrome Number";
            } 
            else 
            {
                return "Not a Palindrome Number";
            }
        }	
	}
}