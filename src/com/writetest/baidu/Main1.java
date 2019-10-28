package com.writetest.baidu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	
public static void main(String[] args) {
	ArrayList<Integer> array = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	int N = Integer.parseInt(str);
	while (N>0) {
		array.add(sc.nextInt());
		N--;
	}
	Integer[]li =  array.toArray(new Integer[array.size()]);
	long result = playGames(li);
	System.out.println(result);
	
}
public static long playGames(Integer[] li) {
    int max=0;
   for(int a:li){
       max=Math.max(a,max);
   }
   long l=0,r=max*2;
   while(l<r){
       long m=(l+r)/2;
       long cnt=0;
       for(int a:li){
           cnt+=Math.max(m-a,0);
       }
       if(m>cnt){
            l=m+1;       
        }else{
            r=m;      
        }
   }
   return Math.max(l,max);
}


}
