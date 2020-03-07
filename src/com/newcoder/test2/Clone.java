package com.newcoder.test2;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Clone {
	public RandomListNode clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}
		RandomListNode currenthead = pHead;
		while (currenthead != null) {
			RandomListNode clonenode = new RandomListNode (currenthead.label);
			RandomListNode nextnode = currenthead.next;
			currenthead.next = clonenode;
			clonenode.next = nextnode;
			currenthead = nextnode; 
		}
		currenthead = pHead;
		while (currenthead != null) {
			currenthead.next.random = currenthead.random == null ? null:currenthead.random.next;
			currenthead = currenthead.next.next;
		}
		currenthead = pHead;
		RandomListNode pclonehead = pHead.next;
		while (currenthead != null) {
			RandomListNode clonenode = currenthead.next;
			currenthead.next = clonenode.next;
			clonenode.next = clonenode.next == null ? null : clonenode.next.next;
			currenthead = currenthead.next;
		}
		return pclonehead;
	}

}
