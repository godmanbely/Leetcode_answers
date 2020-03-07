package com.newcoder.test2;

import java.util.ArrayList;
import java.util.Arrays;



;

public class Permutation {
	public static ArrayList<String> permutation(String str) {
		if (str == null) {
			return null;
		}
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		char[] cr = str.toCharArray();
		int n = cr.length ;
		 
		
		
		
		for (int i = 0; i < n; i++) {
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer = stringBuffer.append(cr[i]) ;
			
			char[] xs = remove(i, cr);
			
			input(arrayList, xs, stringBuffer);
		}
		return arrayList;
		
	}
	
	public static void input(ArrayList<String> arrayList ,char[] cr,StringBuffer stringBuffer) {
		if (cr.length == 0) {
			arrayList.add(stringBuffer.toString());
			stringBuffer = null;
			return;
		}
		
		for (int j = 0; j < cr.length; j++) {
				stringBuffer.append(cr[j]);
				char[] xs = remove(j, cr);
				
				input(arrayList, xs, stringBuffer);
			}
	
	}
	  public static char[] remove(int index, char array[]) {
	        //数组的删除其实就是覆盖前一位
	        char[] arrNew = new char[array.length - 1];
	        
	        for (int i = 0; i < array.length - 1; i++) {
	            if (i<index) {
					arrNew[i] = array[i];
				}else {
					arrNew[i] = array[i + 1];
				}
	        	
	        	
	        }
	     
	        return arrNew;
	    }

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList = permutation("ab");
		for (String string : arrayList) {
			System.out.println(string);
		}
		
	}
}
