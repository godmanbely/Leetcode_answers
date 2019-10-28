package com.leetcode.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Findcombinationsum {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	int len = 0;
	int []candidate;
	public void combinationsum(int residue,int start,Stack<Integer> pre) {
		if (residue == 0) {
			result.add(new ArrayList<>(pre));
			return;
		}
		for (int i = start; i < len&&residue-candidate[i] >= 0; i++) {
			pre.add(candidate[i]);
			combinationsum(residue-candidate[i], i, pre);
			pre.pop();
		}
	}
	public List<List<Integer>> findcombinationsum(int[] canadidates, int target) {
		int len=canadidates.length;
		if (len==0) {
			return result;
		}
		Arrays.sort(canadidates);
		this.len=len;
		this.candidate=canadidates;
		combinationsum(target, 0, new Stack<>());
		return result;
	}

}
