package com.newcoder.test1;

public class JumpFloor {
	public static int jumpFloor(int target) {
        if(target <= 2){
            return target;
        }else{
            int pre2 = 2;
            int pre1 = 1;
            int rs = 3;
            for(int i=3;i<=target;i++){
                rs = pre1 + pre2;
                pre1 = pre2;
                pre2 = rs;
            }
            return pre2;
        }
	}
	public static void main(String[] args) {
		int target = jumpFloor(5);
		System.out.println(target);
	}
}
