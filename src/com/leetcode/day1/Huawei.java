package com.leetcode.day1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;


public class Huawei {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		for (int i = 0; i < k; i++) {
			   int length  = sc.nextInt();
			   sc.nextLine();
			   String str = sc.nextLine();
			   String s = sortstring(str,length);
			   System.out.println(s);
			  }
		


	}
	public static String sortstring(String str,int nlength) {
		
		int t=0,j=0;
		String str1=""; 
		int[] judge= new int[nlength];
		ArrayList<Character> arr = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		
		for (int i = 0; i < nlength; i++) {
			char c = str.charAt(i);
			if ((c >= 'a' && c <= 'z' )) {
	            judge[i]=1;
	            arr.add(c);
	        }else{
				judge[i]=0;
				arr2.add(c-'0');
			}
		}
		
		Collections.sort(arr);
		Collections.sort(arr2);
		for (int i = 0; i < nlength; i++) {
			if (judge[i]==1) {
				str1=str1+arr.get(t++);
				
			}else {
				str1=str1+arr2.get(j++);
			
			}
		}
		return str1;
	}

}
