package com.leetcode.day1;

import java.util.Scanner;

public class Longestsubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] str1c = str1.toCharArray();
		char[] str2c = str2.toCharArray();
		int result = lcss1(str1c, str2c);
		System.out.println(result);
		
		
	}
	public static int lcss1(char str1[], char str2[]) {
		int len = 0,max = 0;
		int row = 0;
		int col = str2.length-1;
		while (row<str1.length) {
			int i=row;
			int j=col;
			while (i < str1.length && j< str2.length) {
				if (str1[i] == str2[j]) {
					len++;
					max = Math.max(max, len);
				}else {
					len = 0;
				}
				i++;
				j++;
			}
			if (col>0) {
				col--;
			}else {
				row++;
			}
		}
		return max;
	}
	
}

