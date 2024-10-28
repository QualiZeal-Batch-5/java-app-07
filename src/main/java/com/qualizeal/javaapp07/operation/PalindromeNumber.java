package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	
	public String definePalindromeNumber() {
		
		return "A palindrome is a number which looks same when it is reversed";
		
     }
    
	public String verifyIfNumberIsPalindromeOrNot(int num) {
		 
		if(num < 0) 
				
			return "-1";
			
			
		else if(num == 0) 
			
			return "-2";
		
		
		else if(Integer.toString(num).length() == 1) 
			
			return "-3";
      
		long rem  = 0, rev = 0, temp = (long)num;
			
		while(temp  != 0) {
				
			rem = temp % 10;
			rev = rev*10 + rem;
			temp = temp/10;
			
		}
		
        if(rev == num) {
			
			return "Palindrome Number";
		}
        
        return "Not a Palindrome Number";
		
	       
	        
		
		
		
		
		
		
	}
}
