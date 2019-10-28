package com.sort.example;

public class Selectionsort {

	public static void main(String[] args) {
		int[] arr = {6,3,8,1,3,9,7};
		System.out.println("排序前的数组为：");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		for (int i = 0; i < arr.length -1; i++) {
			int k=i;
			for (int j = k+1; j < arr.length; j++) {
				if (arr[j]<arr[k]) {
					k=j;
				}
			}
			if (i!=k) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
		}
		System.out.println();
		System.out.println("排序后的数组为：");
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
