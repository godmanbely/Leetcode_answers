package com.writetest.baidu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=2;
		int N = 0,M = 0;
		while(k>0) {
			if (k==2) {
				 N = sc.nextInt();
				 k--;
			}else if (k==1) {
				 M = sc.nextInt();
				 k--;
			} 
			
		}
		if (N-M<M) {
			System.out.println(2*M-N);
		}else {
			System.out.println(N-M);
		}

	}

}
