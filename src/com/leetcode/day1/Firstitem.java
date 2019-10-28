package com.leetcode.day1;

import java.util.Scanner;

public class Firstitem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		sc.close();
		int N = Integer.valueOf(n);
		int result= fib(N);
		System.out.println(result);
	}
	public static int fib(int n) {
		if (n<=1) 
			return n;
		
		int memo_i_2 = 0;
		int memo_i_1 = 1;
		int memo_i = 1 ;
		for (int i = 2; i <= n; i++) {
			memo_i = memo_i_2 + memo_i_1;
			memo_i_2 = memo_i_1;
			memo_i_1 = memo_i;
		}
		return memo_i;
		
	}
	public static int cut(int[] p,int n) {
		if (n == 0) 
			return 0;
		int q=Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			q = Math.max(q, p[i-1]+cut(p, n-i));
		}
		return q;
		
	}

}
