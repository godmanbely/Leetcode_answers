package com.newcoder.day4;

import com.leetcode.day4.ListNode;

public class Merge {
	public ListNode merge(ListNode list1,ListNode list2) {
		ListNode head = new ListNode(-1);
		head.next = null;
		ListNode root = head;
		while (list1 != null && list2 != null ) {
			if (list1.val < list2.val ) {
				head.next = list1;
				head = list1;
				list1 = list1.next;
			}else {
				head.next = list2;
				head= list2;
				list2 = list2.next;
			}	
			
		}
		if (list1 != null) {
			head.next = list1;
		}
		if (list2 != null) {
			head.next = list2;
		}
		return root.next;
	}

}
