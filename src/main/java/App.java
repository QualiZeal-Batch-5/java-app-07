package com.qualizeal.javaapp07.operation;

import com.qualizeal.javaapp07.operation.PalindromeNumber;

public class App{
	public static void main(String[] args){
		
		PalindromeNumber palindromeNumber =  new PalindromeNumber();
		
		String result1 = palindromeNumber.verifyIfNumberIsPalindromeOrNot(44);
		
		System.out.println(result1);
		
	}
}