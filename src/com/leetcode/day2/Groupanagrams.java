package com.leetcode.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Groupanagrams {
	public List<List<String>> groupamagrams(String[] strs) {
		if (strs.length == 0)
			return new ArrayList<>();
		Map<String, List<String>> ans = new HashMap<String, List<String>>();
		for (String s : strs) {
			char[]ca =s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key)) {
				ans.put(key, new ArrayList<>());
				
			}
			ans.get(key).add(s);
		}
		return new ArrayList<List<String>>(ans.values());
		
	}
	
	
	public List<List<String>> groupamgram_2(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		boolean[] used = new boolean[strs.length];
		
		
		
		return 
			
		}
	}

}
