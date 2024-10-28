package com.qualizeal.javaapp07.operation;

public class PalindromeNumber {
	public String definePalindromeNumber() {
		return "Palindrome Number";
	}

	public String verifyIfNumberIsPalindromeOrNo(int num) {
		String s = "";
		if (num < 0) {
			s = "-1";
		} else if (num == 0) {
			s = "-2";
		} else if (num < 10) {
			s = "-3";

		} else if (num >= 10) {
			int sum = 0, r;
			int temp = num;
			while (num > 0) {
				r = num % 10;
				sum = (sum * 10) + r;
				num = num / 10;
			}
			if (temp == sum) {
				s = definePalindromeNumber();
			} else {
				s = "Not a Palindrome Number";
			}
		}
		return s;
	}
}
