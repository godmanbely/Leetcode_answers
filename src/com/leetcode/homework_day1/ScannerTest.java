package com.leetcode.homework_day1;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("按next的方式接受：");
//		if (scan.hasNext()) {
//			String str1 = scan.next();
//			System.out.println("输入的数据为 " + str1);
//		}
//		scan.close();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("按nextline的方式接受： ");
		if (scan.hasNextLine()) {
			String str2 = scan.nextLine();
			System.out.println("输入的数据为： " + str2);
		}
		
		scan.close();
	}

}
