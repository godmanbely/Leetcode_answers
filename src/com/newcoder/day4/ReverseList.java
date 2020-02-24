package com.newcoder.day4;

import com.leetcode.day4.ListNode;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
		 ListNode pre = null;
		 ListNode next = null;
	       
			if (head == null) {
				return null;
			}
			while (head != null) {
				next = head.next;
				head.next = pre;
	            pre = head;
				head = next;
			}
			return pre;
	}

}
