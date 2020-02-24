package com.newcoder.day5;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
	private int size;
	private int min = Integer.MAX_VALUE;
	private Stack<Integer> minstack = new Stack<>();
	private Integer[] element = new Integer[10];
	
	public void push(int node) {
		ensureCapacity(size + 1);
		element[size++] = node;
		if (node <= min) {
			minstack.push(node);
			min = minstack.peek();
		}else {
			minstack.push(min);
		}
    }
    
	private void ensureCapacity(int size) {
		int len = element.length;
		if (size > len) {
			int newlen = (len*3)/2 +1;
			element = Arrays.copyOf(element, newlen);
		}
	}
    public void pop() {
        Integer top = top();
        if (top != null) {
			element[size-1] = (Integer) null;
		}
        size -- ;
        minstack.pop();
        min = minstack.peek();
    }
    
    public int top() {
        if (!empty()) {
			if (size - 1 >= 0) {
				return element[size - 1];
			}
		}
        return (Integer)null;
    }
    public boolean empty() {
		return size == 0;
	}
    public int min() {
        return min;
    }

}
