package com.newcoder.test2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers_Solution {
	public ArrayList<Integer> getLeastNumbers_Solution(Integer[] arr, int k) {
		ArrayList<Integer> result = new  ArrayList<>();
		int length = arr.length;
		if (k > length || k == 0) {
			return result;
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		for (int i = 0; i < length; i++) {
			if (maxHeap.size() != k){
				maxHeap.offer(arr[i]);
			}else if (maxHeap.peek() > arr[i]) {
				Integer temp = maxHeap.poll();
				temp = null;
				maxHeap.offer(arr[i]);
			} 
		}
		for (Integer integer : maxHeap) {
			result.add(integer);
		}
		return result;
	}
}
