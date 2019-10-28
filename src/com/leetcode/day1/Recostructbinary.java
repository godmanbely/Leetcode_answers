package com.leetcode.day1;

import java.util.Arrays;

public class Recostructbinary {
	public static Treenode reconstructbinary(int[] pre,int[] in){
		if (pre.length == 0 || in.length == 0) {
			return null;
		}
		Treenode root = new Treenode(pre[0]);
		for (int i = 0; i < in.length; i++) {
			if(in[i] == pre[0]) {
				root.left=reconstructbinary(Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in, 0, i));
				root.right=reconstructbinary(Arrays.copyOfRange(pre,i+1,pre.length), Arrays.copyOfRange(in, i+1, in.length));
				break;
			}
		}
		return root;
	}
	
}



class Treenode{
	int val;
	Treenode left;
	Treenode right;
	public Treenode(int x) {
		val = x;
	}
}
