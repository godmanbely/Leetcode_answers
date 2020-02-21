package com.leetcode.homework_day1;

public class BinarySearch {
	/*
	  * 范围在[L,R]闭区间中，L = 0、R = arr.length - 1；
          *注意循环条件为 L <= R ，而不是L < R；
	 */
	 static int bs1(int[] arr,int key){
	        int L = 0,R = arr.length - 1; //在[L,R]范围内寻找key
	        int mid;
	        while( L <= R){
	            mid = L + (R - L) / 2;
	            if(arr[mid] == key)
	                return mid;
	            if(arr[mid] > key)
	                R = mid - 1;// key 在 [L,mid-1]内
	            else
	                L = mid + 1;
	        }
	        return -1;
	    }
	 /*
	  * 上面的二分查找是在[L,R]的闭区间中查找，而这个二分查找是在[L,R)的左闭右开区间查找；
	  *所以此时的循环条件是L < R ，因为R本来是一个不可到达的地方，我们定义为了开区间，
	  *所以R是一个不会考虑的数，所以我们循环条件是L < R；
          *同理，当arr[mid] > key的时候，不是R = mid - 1，因为我们定义的是开区间，所以R = mid
          * ，因为不会考虑arr[mid]这个数；
	  */
	 static int bs2(int[] arr,int key){
	        int L = 0, R = arr.length; //注意这里R = arr.length 所以在[L,R)开区间中找
	        int mid;
	        while( L < R){ //注意这里 不是 L <= R
	            mid = L + (R - L)/2;
	            if(arr[mid] == key)
	                return mid;
	            if(arr[mid] > key)
	                R = mid; // 在[L,mid)中找
	            else
	                L = mid + 1;
	        }
	        return -1;
	    }
	 
		/**查找第一个与key相等的元素的下标，　如果不存在返回-1　*/
	    static int firstEqual(int[] arr,int key){
	        int L = 0, R = arr.length - 1; //在[L,R]查找第一个>=key的
	        int mid;
	        while( L <= R){
	            mid = L + (R - L)/2;
	            if(arr[mid] >= key)
	                R = mid - 1;
	            else
	                L = mid + 1;
	        }
	        if(L < arr.length && arr[L] == key)
	            return L;
	        return -1;
	    }
	    
	    /**查找第一个大于等于key的元素的下标*/
	    static int firstLargeEqual(int[] arr,int key){
	        int L = 0, R = arr.length - 1;
	        int mid;
	        while( L <= R){
	            mid = L + (R - L) / 2;
	            if(arr[mid] >= key)
	                R = mid - 1;
	            else
	                L = mid + 1;
	        }
	        return L;
	    }
	    /**查找第一个大于key的元素的下标 */
	    static int firstLarge(int[] arr,int key){
	        int L = 0,R = arr.length - 1;
	        int mid;
	        while(L <= R){
	            mid = L + (R - L) / 2;
	            if(arr[mid] > key)
	                R = mid - 1;
	            else
	                L = mid + 1;
	        }
	        return L;
	    }
	    /**查找最后一个与key相等的元素的下标，　如果没有返回-1*/
	    static int lastEqual(int[] arr,int key){
	        int L = 0, R = arr.length - 1;
	        int mid;
	        while( L <= R){
	            mid = L + (R - L)/2;
	            if(arr[mid] <= key)
	                L = mid + 1;
	            else
	                R = mid - 1;
	        }
	        if(R >= 0 && arr[R] == key)
	            return R;
	        return -1;
	    }
	    /**查找最后一个小于等于key的元素的下标 */
	    static int lastSmallEqual(int[] arr,int key){
	        int L = 0, R = arr.length - 1;
	        int mid;
	        while( L <= R){
	            mid = L + (R - L) / 2;
	            if(arr[mid] <= key)
	                L = mid + 1;
	            else
	                R = mid - 1;
	        }
	        return R;
	    }
	    /**查找最后一个小于key的元素的下标*/
	    static int lastSmall(int[] arr,int key){
	        int L = 0, R = arr.length - 1;
	        int mid;
	        while(L <= R){
	            mid = L + (R - L) / 2;
	            if(arr[mid] < key)
	                L = mid + 1;
	            else
	                R = mid - 1;
	        }
	        return R;
	    }

}
