package com.newcoder.test1;

import java.util.Stack;

public class NearMaxNum {
	public static int[] nearMaxNum(int[] num) {
		if (num == null) {
			return null;
		}
		int[] result = new int[num.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i < num.length; i++) {
			while (!stack.isEmpty() && num[i] > num[stack.peek()]) {
					result[stack.pop()] = num[i];
			}
			if (stack.isEmpty() || num[i] < num[stack.peek()]) {
				stack.push(i);
			}
		}

		while(!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
			
		return result;
	}
	public static void main(String[] args) {
		int[] num = {8, 2, 5, 4, 3, 9, 7, 2, 5};
		int[] result = nearMaxNum(num);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
	}

}
