package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {

	public String definePalindromeNumber() {
		return "A palindrome number is a number that remains the same when its digits are reversed.";
	}

	public String verifyIfNumberIsPalindromeOrNot(int num) {

		if (num < 0) {
			return "-1";
		}

		if (num == 0) {
			return "-2";
		}

		if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9) {
			return "-3";
		}

		String numStr = String.valueOf(num);
		String reversedStr = new StringBuilder(numStr).reverse().toString();

		if (numStr.equals(reversedStr)) {
			return "Palindrome Number";
		} else {
			return "Not a Palindrome Number";
		}

	}

}
