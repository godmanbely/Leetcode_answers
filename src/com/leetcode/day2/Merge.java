package com.leetcode.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
	public int[][] merge(int[][] intervals) {
		List<int[]> res= new ArrayList<int[]>();
		if (intervals.length == 0 || intervals == null) {
			return res.toArray(new int[0][]);
		}
		Arrays.sort(intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}	
		});
		int i = 0;
		while (i < intervals.length) {
			int left = intervals[i][0];
	     	int right = intervals[i][1];
			while (i<intervals.length-1 && right >= intervals[i+1][1]) {
				i++;
				right = Math.max(right, intervals[i][1]);
			}
			res.add(new int[] {left,right});
			i++;
		}
		return res.toArray(new int[0][]);
		
	}
public static void main(String[] args) {
	
	
}
}
