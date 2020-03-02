package com.newcoder.test1;

public class VerifySquenceOfBST {
	public boolean verifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length <= 0) {
			return false;
		}
		return verifySquenceOfBST(sequence, 0, sequence.length-1);
	}
	public boolean verifySquenceOfBST(int[] sequence, int start, int end) {
		if (start >= end) {
			return true;
		}
		int root = sequence[end];
		
		int i = start;
		while (sequence[i] < root) {
			i++;
		}
		int j = i;
		while (j < end) {
			if (sequence[j] < root) {
				return false;
			}
			j++;
		}
		boolean left = verifySquenceOfBST(sequence, start, i-1);
		boolean right = verifySquenceOfBST(sequence, i, end-1);
		return left&right;
	}

}
