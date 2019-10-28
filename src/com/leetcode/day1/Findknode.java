package com.leetcode.day1;


class listnode{
	int val;
	listnode next=null;
	public listnode(int x) {
		this.val=x;
	}
}
public class Findknode {
	public listnode FindKnode(listnode head,int k) {
		if (head == null || k<=0) {
			return null;
		}
		listnode llistnode = head,rListnode= head;
		for (int i = 0; i < k-1; i++) {
			if (rListnode.next == null) {
				return null;
			}
			rListnode = rListnode.next;
		}
		while (rListnode.next!=null) {
			rListnode=rListnode.next;
			llistnode=llistnode.next;
		}
		return llistnode;
	}
	
	public listnode reverselist(listnode head) {
		if (head == null || head.next==null) {
			return head;
		}
		
		listnode pre = null;
		listnode next = null;
		while (head != null) {
			next =head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	public listnode merge(listnode l1,listnode l2) {
		listnode h = new listnode(-1);
		listnode cur = h;
		while (l1 != null && l2!= null) {
			if (l1.val <= l2.val) {
				cur.next = l1;
				l1 = l1.next;
			}else {
				cur.next = l2;
				l2=l2.next;
			}
			cur = cur.next;
		}
		if (l1.next != null) {
			cur.next=l1;
		}
		if (l2.next != null) {
			cur.next=l2;
		}
		return h.next;
			
		}
	}


