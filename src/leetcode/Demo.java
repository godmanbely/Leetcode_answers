package leetcode;

import java.util.Scanner;

public class Demo {
//n棵钉子  4 9 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int[] arr= {4,9};
		System.out.println(function(n, 0));
		}
	public static int function(int n,int num) {
	
		if(n==0) {
			return num;
		}
		if(n < 0) {
			return -1;
		}
		int r = function(n-9, num+1);
		if(r == -1) {
			r = function(n-4, num+1);
		}
		return r;
	}
}