package com.leetcode.day5;

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class MinStack {
	private Stack<Integer> data;
	private Stack<Integer> helper;
	
	public MinStack() {
		data = new Stack<>();
		helper = new Stack<>();
	}
	public void push(int x) {
		data.add(x);
		if (helper.isEmpty() || helper.peek() >= x) {
			helper.add(x);
		}
		helper.add(helper.peek());
	}
	public void pop() {
		if (!data.isEmpty()) {
			data.pop();
			helper.pop();
		}
	}
	public int top() {
		if (!data.isEmpty()) {
			return data.peek();
		}else {
			return -1;
		}
	}
	public int geiMin() {
		if (!helper.isEmpty()) {
			return helper.peek();
		}else {
			throw new RuntimeErrorException(null, "不存在相应的最小值");
		}
	}

}
