package com.leetcode.day1;

import java.util.Scanner;

public class Replacespace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String str = repalcestace(string);
		System.out.println(str);
	}
	
	
	
	
	public static String repalcestace(String str) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < str.length(); i++) {
		char c = str.charAt(i);
		if (c == ' ' ) {
			sb.append("%20");
		}else {
			sb.append(c);
		}
	}
	return sb.toString();
	}
	
}
