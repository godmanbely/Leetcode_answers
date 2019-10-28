package com.leetcode.day1;

public class Cutrope {

	public static void main(String[] args) {
		

	}
	public static int cutrope(int n) {
		if (n == 2) 
			return 1;
		if (n == 3) 
			return 2;
		int []dp = new int[n+1];
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=3;
		int res= 0;
		for(int i =0; i<=n;i++) {
			for(int j = 1;j<=i/2;j++) {
				res = Math.max(res, dp[j]*dp[i-j]);
			}
			dp[i]=res;
		}
		return dp[n];
	}

}
