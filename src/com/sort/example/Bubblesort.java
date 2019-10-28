package com.sort.example;

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr = {6,3,8,1,3,9,7};
		System.out.println("排序前的数组为：");
		for(int num:arr) {
			System.out.print(num+" ");
		}
//		for (int i = arr.length-1; i >=0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (arr[j]>arr[j+1]) {
//					int temp = arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("排序后的数组为：");
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
