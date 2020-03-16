package com.newcoder.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class FirstNotRepeatingChar {
	public static int firstNotRepeatingChar(String str) {
		HashMap<Character, Integer> result = new HashMap<>();
		ArrayList<Integer> array = new ArrayList<>();
		char[] cr = str.toCharArray();
		for (int i = 0; i < cr.length; i++) {
			if (result.containsKey(cr[i])) {
				result.put(cr[i], Integer.MAX_VALUE);
			}else {
				result.put(cr[i], i);
			}
		}
		
			Set<Character> set= result.keySet();
			for (Character character : set) {
				if (result.get(character) != Integer.MAX_VALUE) {
					array.add(result.get(character)); 
				}
			}
			
			if (array.size() != 0) {
				Collections.sort(array);
				return array.get(0);
			}else {
				return -1;
			}
			
			
	}
	public static void main(String[] args) {
		int i = firstNotRepeatingChar("google");
	}
}
