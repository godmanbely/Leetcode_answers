package com.sort.example;

public class Sort {
	public static void sort(int[]arr,int low,int high) {
		int l=low;
		int h=high;
		int basenum=arr[low];
		
		while(l<h) {
			while (l<h && arr[h] >= basenum) {
				h--;
			}
			if (l<h) {
				int temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
				l++;
			}
			
			while (l<h && arr[l]<=basenum) {
				l++;
			}
			if (l<h) {
				int temp=arr[h];
				arr[h]=arr[l];
				arr[l]=temp;
				h--;
			}
		}
		if (l>low) {
			sort(arr, low, l-1);
		}
		if (h<high) {
			sort(arr, l+1, high);
		}
	}

}
