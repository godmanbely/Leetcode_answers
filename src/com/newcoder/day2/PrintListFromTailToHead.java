package com.newcoder.day2;

import java.util.ArrayList;

public class PrintListFromTailToHead {
	    ArrayList<Integer> arr = new ArrayList<>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode == null) {
			return arr;
		}
		if  (listNode.next != null) {
			printListFromTailToHead(listNode.next);
			
		}
		arr.add(listNode.val);
		return arr;
	} 

}


class ListNode {
	int val;
	ListNode next = null;
	 
	 ListNode(int val) {
		 this.val = val;
	 }
 }