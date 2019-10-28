package com.sort.example;

public class Binarysearch {
	public static void main(String[] args) {
		
	}
	public static int binarysearch(int[]arr,int num) {
		int low=0;
		int upper=arr.length-1;
		while (low<=upper) {
			int mid=(low+upper)/2;
			if (arr[mid]>num) {
				upper=mid-1;
			}else if (arr[mid]<num) {
				low=mid+1;
			}else 
				return mid;
		}
		return -1;
	}

}
