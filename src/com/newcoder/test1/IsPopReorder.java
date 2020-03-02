package com.newcoder.test1;

import java.util.Stack;

public class IsPopReorder {
	public static boolean isPopOrder(int[] pushA, int[] popA) {
		Stack<Integer> stack = new Stack<>();
		int temp = 0;
		for (int i = 0; i < popA.length; i++) {
			if (popA[temp] == pushA[i] ) {
				
				temp++;
				continue;
			}
			stack.push(pushA[i]);
		}
		while (temp < popA.length) {
			if (stack.peek() != popA[temp] ) {
				return false;
			}
			temp ++;
			stack.pop();
		}
		
		return true;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5} ;
		int[] b = {4,5,3,2,1} ;
		boolean t = isPopOrder(a, b);
		System.out.println(t);
	}
}
