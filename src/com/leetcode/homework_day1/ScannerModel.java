package com.leetcode.homework_day1;

import java.util.Arrays;
import java.util.Scanner;

//类似
//第一行输入    数列的项数   数列1 n项  数列2 m项
//第二行输入 数列1 的 值（共n项）
//第三行输入 数列2 的 值（共m项）
//输入样例：
//4 5
//1 2 3 4
//1 2 3 4 5
public class ScannerModel {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();
        int[] nums1 = new int[length1];
        int[] nums2 = new int[length2];
        int index = 0;
        while(scanner.hasNext()) {
            nums1[index] = Integer.parseInt(scanner.next());
            index++;
            if(index>length1-1){
                break;
            }
        }
        index = 0;
        while(scanner.hasNext()) {
            nums2[index] = Integer.parseInt(scanner.next());
            index++;
            if(index>length2-1){
                break;
            }
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
