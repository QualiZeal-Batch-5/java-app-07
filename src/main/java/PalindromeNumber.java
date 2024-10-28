package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {

    
    public String definePalindromeNumber() {
        return "A palindrome number is a number that remains the same when its digits are reversed.";
    }

    
    public String verifyIfNumberIsPalindromeOrNot(int number) {
        
       
        if (number < 0) {
            return "-1";
        }
       
        else if (number == 0) {
            return "-2";
        }
       
        else if (number >= 1 && number <= 9) {
            return "-3";
        }

       
        int reverse = 0;
        int temp = number;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

      
        if (temp == reverse) {
            return "Palindrome Number";
        } else {
            return "Not a Palindrome Number";
        }
    }
}
