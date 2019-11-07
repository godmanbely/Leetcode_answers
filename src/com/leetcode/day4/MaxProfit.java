package com.leetcode.day4;

public class MaxProfit {
	public int maxProfit(int[] price) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < price.length; i++) {
			if (price[i] < minprice) {
				minprice = price[i];
			}else if (price[i] - minprice > maxprofit) {
				maxprofit = price[i] - minprice;
			}
		}
		return maxprofit;
	}

}
