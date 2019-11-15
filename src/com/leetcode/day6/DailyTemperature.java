package com.leetcode.day6;

public class DailyTemperature {
	public int[] dailyTemperatures(int[] T) {
		int length = T.length;
		int[] result = new int[length];
		
		for (int i = 0; i < length; i++) {
			int current = T[i];
			if (current < 100) {
				for (int j = i + 1; j < length; j++) {
					if (T[j] > current) {
						result[i] = j - i;
						break;
					}
				}
			}
		}
		return result;
	}
	
	public int[] dailyTemperatures_change(int[] T) {
		int length = T.length;
		int[] result = new int [length];
		
		for (int i = length - 2; i >= 0; i--) {
			for (int j = i + 1; j < length; j+= result[j]) {
				if (T[j] > T[i]) {
					result[i] = j - i;
					break;
				}else if (result[j] == 0) {
					result[i] = 0;
					break;
				}
			}
		}
		
		return result;
	}

}
