package com.leetcode.day1;

import java.util.Stack;

public class Solution {
	Stack<Integer> stacktotal = new Stack<>();
	Stack<Integer> stacklittle = new Stack<>();
	public void push(int node) {
		stacktotal.push(node);
		if (stacklittle.empty()) {
			stacklittle.push(node);
		}else {
			if (node<=stacklittle.peek()) {
				stacklittle.push(node);
			}else {
				stacklittle.push(stacklittle.peek());
			}
		}
	}
	public void pop() {
		stacktotal.pop();
		stacklittle.pop();
	}
	
	public int top() {
		return stacktotal.peek();
	}
	
	public int min() {
		return stacklittle.peek();
	}

}
