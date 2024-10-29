package com.qualizeal;

import com.qualizeal.javaapp07.operation.PalindromeNumber;

public class App {
	public static void main(String[] args) {
		
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		
		System.out.println(palindromeNumber.definePalindromeNumber());
		
		System.out.println(palindromeNumber.verifyIfNumberIsPalindromeOrNot(44));
	}
}