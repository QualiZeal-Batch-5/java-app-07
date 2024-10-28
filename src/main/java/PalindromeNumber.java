package com.qualizeal.javaapp07.operation;
public class PalindromeNumber{
	public String definePalindromeNumber(){
		return "A palindrome number is a number that remains the same when its digits are reversed.";
	}
	public String verifyIfNumberIsPalindromeOrNot(int num1){
		if(num1 < 0){
			return "-1";
		}
		else if(num1 == 0){
			return "-2";
		}
		else if(num1 <10 && num1>0){
			return "-3";
		}
		else{
			 int originalNumber = num1;
             int reversedNumber = 0;

            while (num1 > 0) {
              int digit = num1 % 10;
              reversedNumber = reversedNumber * 10 + digit;
              num1 /= 10;
            }

            if (originalNumber == reversedNumber) {
              return "Palindrome Number";
            }
		    else {
              return "Not a Palindrome Number";
            }
		}
	}
}