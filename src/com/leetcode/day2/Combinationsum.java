package com.leetcode.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Combinationsum {
	public  List<List<Integer>> combinationsum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Map<Integer, Set<List<Integer>>> map = new HashMap<Integer, Set<List<Integer>>>();
		Arrays.sort(candidates);
		int len =  candidates.length;
		for (int i = 0; i <= target; i++) {
			map.put(i, new HashSet<>());
			for (int j = 0; j < len && candidates[j]<=target; j++) {
				if (i == candidates[j]) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(i);
					map.get(i).add(temp);
				}else if (i > candidates[j]) {
					int key = i-candidates[j];
					for (Iterator<List<Integer>> iterator=map.get(key).iterator(); iterator.hasNext();) {
						List<Integer> list= (List<Integer>) iterator.next();
						List<Integer> templist = new ArrayList<>();
						templist.addAll(list);
						templist.add(candidates[j]);
						Collections.sort(templist);
						map.get(i).add(templist);
					}
				}
			}
		}
		result.addAll(map.get(target));
		return result;
	}

}
