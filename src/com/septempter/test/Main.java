package com.septempter.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String K = sc.nextLine();
		int k =Integer.parseInt(K);

		while(k>0)
		{
			list.add(sc.nextInt());
			k--;
		}
		
		Integer[]li =  list.toArray(new Integer[list.size()]);
		Arrays.sort(li);
		int temp = longestArithSeqLength(li);
		System.out.println(temp);

	}

		public static int longestArithSeqLength(Integer[] A) {
			 int N = A.length;

		        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		        for (int i = 0; i < N; i++) {
		            map.putIfAbsent(A[i], new ArrayList<>());
		            map.get(A[i]).add(i);
		        }

		        int ans = 0;
		        for (int i = 0; i < N; i++) {
		            for (int j = i + 1; j < N; j++) {
		                int V = A[j] - A[i];
		                int prev = A[j];
		                int len = 2;
		                int k = j + 1;

		                while (map.containsKey(V + prev)) {
		                    List<Integer> indexs = map.get(V + prev);
							
							// Java BS library is not intuitive to use at all
		                    int res = Collections.binarySearch(indexs, k);
		                    if (res < 0) res = ~res;
		                    if (res == indexs.size()) break;

		                    k = indexs.get(res) + 1;
		                    prev = V + prev;
		                    len++;
		                }

		                ans = Math.max(ans, len);
		            }
		        }
		        return ans;
		    
		}
}
	    


	

