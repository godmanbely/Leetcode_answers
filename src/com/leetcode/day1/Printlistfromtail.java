package com.leetcode.day1;

import java.util.ArrayList;

public class Printlistfromtail {

	public static void main(String[] args) {
		

	}
	public static ArrayList<Integer> printlistfromtail(listNode listNode){
		ArrayList<Integer> list = new ArrayList<Integer>();
		listNode temp =listNode;
		while (temp!=null) {
			list.add(0,temp.val);
			temp = temp.next;
		}
		return list;
	}
	public static ArrayList<Integer> printlistfrom(listNode listnode){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (listnode!=null) {
			printlistfrom(listnode.next);
			list.add(listnode.val);
		}
		return list;
	}

}


class listNode{
	int val;
	listNode next = null;
	
	
	public listNode(int val) {
		this.val = val;
	}
}
