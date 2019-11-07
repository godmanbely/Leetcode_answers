package com.leetcode.day1;

import java.util.ArrayList;

public class Printlistfromtail {

	public static void main(String[] args) {
		

	}
	public static ArrayList<Integer> printlistfromtail(listNode_1 listNode_1){
		ArrayList<Integer> list = new ArrayList<Integer>();
		listNode_1 temp =listNode_1;
		while (temp!=null) {
			list.add(0,temp.val);
			temp = temp.next;
		}
		return list;
	}
	public static ArrayList<Integer> printlistfrom(listNode_1 listNode_1){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (listNode_1!=null) {
			printlistfrom(listNode_1.next);
			list.add(listNode_1.val);
		}
		return list;
	}

}


class listNode_1{
	int val;
	listNode_1 next = null;
	public listNode_1(int val) {
		this.val = val;
	}
}
