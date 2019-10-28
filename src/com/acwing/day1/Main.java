package com.acwing.day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int V = sc.nextInt();
		int[] v = new int[N+1];
		int[] w = new int[N+1];
		for (int i = 1; i <= N; i++) {
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		sc.close();
		int[][] dp = new int[N+1][V+1];
		dp[0][0] = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= V; j++) {
				if (j>=v[i]) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-v[i]] + w[i]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[N][V]);

	}

}
