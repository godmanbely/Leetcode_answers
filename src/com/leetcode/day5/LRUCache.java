package com.leetcode.day5;

import java.util.HashMap;

public class LRUCache {
	/*LRU缓存算法的核心数据结构是哈希链表，双向链表和哈希表的结合。
	 *借助哈希表的快速进行链表中的查找 
    */
	private HashMap<Integer, Node> map;
	private DoubleList cache;
	private int ca;
	
	public LRUCache(int capacity) {
		this.ca = capacity;
		map = new HashMap<>();
		cache = new DoubleList();
	}
	public int get(int key) {
		if (!map.containsKey(key)) {
			return -1;
		}
		int val = map.get(key).val;
		
		return val;
	}
	public void put(int k, int v) {
		Node xNode = new Node(k, v);
		if (map.containsKey(k)) {
			cache.remove(map.get(k));
			cache.addFirst(xNode);
			map.put(k, xNode);
		}else {
			if (ca == cache.size()) {
				Node last = cache.removeLast();
				map.remove(last.key);
			}
			cache.addFirst(xNode);
			map.put(k, xNode);
		}
	}

}
class Node{
	public int key, val;
	public Node next, pre;
	public Node(int k, int v) {
		this.val = v;
		this.key = k;
	}
}
class DoubleList{
	private Node head, tail;
	private int size;
	
	public DoubleList() {
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.pre = head;
		size = 0;
	}
	public void addFirst(Node x) {
		head = x;
		x.next = head.next;
		x.pre = head;
		head.next.pre = x;
		head.next = x;
		size++;
	}
	public void remove(Node x) {
		x.pre.next = x.next;
		x.next.pre = x.pre;
		size--;
	}
	public Node removeLast() {
		if (tail.pre == head) {
			return null;
		}
		Node last = tail.pre;
		remove(last);
		return last;
	}
	public int size() {
		return size;
	}
}
