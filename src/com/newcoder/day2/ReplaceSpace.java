package com.newcoder.day2;

public class ReplaceSpace {
	public static String replaceSpace(StringBuffer str) {
		int n = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				n++;
			}
		}
		char[] chars = new char[n*2 + str.length()];
		for (int i = 0,j = 0; i < str.length(); i++,j++) {
			if (str.charAt(i) == ' ') {
				chars[j] = '%';
				chars[++j] = '2';
				chars[++j] = '0';
			}else {
				chars[j] = str.charAt(i);
			}
		}
		String string = new String(chars);
		return string;
	}
   public static void main(String[] args) {
	StringBuffer stringBuffer = new StringBuffer("hello world");
	String string = replaceSpace(stringBuffer);
	System.out.println(string);
}
}
