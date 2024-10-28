package com.qualizeal;

import com.qualizeal.javaapp07.operation.PalindromeNumber;

public class App {
	public static void main(String[] args) {
		
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		String result = palindromeNumber.verifyIfNumberIsPalindromeOrNot(89);
		System.out.println(result);
		
	}
}