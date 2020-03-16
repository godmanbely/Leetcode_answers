package com.newcoder.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintMinNumber {
	public String printMinNumber(int[] number) {
		int n ;
		String s = "";
		ArrayList<Integer> array = new ArrayList<>();
		n = number.length;
	
		for (int i = 0; i < n; i++) {
			array.add(number[i]); 
		}
		
		Collections.sort(array, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String s1 = o1 +""+o2;
				String s2 = o2 +""+o1;
				return s1.compareTo(s2);
			}
		});
		for (Integer integer : array) {
			s+=integer;
		}
		
		return s;
	}
}
