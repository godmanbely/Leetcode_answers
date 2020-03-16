package com.newcoder.test3;

import java.util.ArrayList;

public class GetUglyNumber_Solution {
	public int getUglyNumber_Solution(int index) {
		if (index <= 0) {
			return 0;
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		int i2=0,i3=0,i5=0;//类似于三个队列的头指针
		while (list.size() < index) {
			int m2 = list.get(i2)*2;//取得当前2队列指针下的值
			int m3 = list.get(i3)*3; //取得当前3队列指针下的值
			int m5 = list.get(i5)*5;//取得当前5队列指针下的值
			int min = Math.min(m2, Math.min(m3, m5));//获取当前三个队列里面的最小值
			list.add(min);
			if (min == m2) {
				i2++;  //如果选取的话，当前指针后移
			}
			if (min == m3) {
				i3++;
			}
			if (min == m5) {
				i5++;
			}
		}
		return list.get(list.size()-1);
	}
}
