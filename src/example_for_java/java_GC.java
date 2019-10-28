package example_for_java;


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.EmptyStackException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class java_GC<T> {
//	
//	private T[] elements;
//    private int size = 0;
// 
//    private static final int INIT_CAPACITY = 16;
//    
//    public java_GC() {
//        elements = (T[]) new Object[INIT_CAPACITY];
//    }
//    public void push(T elem) {
//        ensureCapacity();
//        elements[size++] = elem;
//    }
// 
//    public T pop() {
//        if(size == 0) 
//            throw new EmptyStackException();
//        return elements[--size];
//    }
// 
//    private void ensureCapacity() {
//        if(elements.length == size) {
//            elements = Arrays.copyOf(elements, 2 * size + 1);
//        }
//    }
//
//
//
//}
//
//
//class Employee {
//    private String name;//姓名
//    private double salary;//薪水
//    private int age;
//    //----菱形语法------编辑器会自动识别变量类别
//    ArrayList<Employee> staff = new ArrayList<Employee>(100);
//    Employee manager [] = new Employee[100];
//    //构造函数
//    public Employee(String name,int age,double salary){
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++)
//        {
//	        for(int j=i+1; j< nums.length;j++)
//	        {
//	        	if (nums[j]==target-nums[i]) 
//	        	{
//	        		return new int[] {i,j};	
//				}	
//	        }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//}
//
//class Solution2{
//	public int[] towSum(int[] nums,int target) {
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for(int i=0;i<nums.length;i++)
//		{
//			map.put(nums[i], i);
//		}
//		
//		for(int i=0;i<nums.length;i++)
//		{
//			int remain = target - nums[i];
//			if (map.containsKey(remain) && map.get(remain)!=i) 
//			{
//				return new int[] {map.get(remain),i};	
//			}
//		}
//		throw new IllegalArgumentException("No two sum solution");
//	}
//}
//
//
//
// class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
//
//class Solution4 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    	double l1number = 0,l2number = 0;
//    	while (l1.next !=null) {
//    	    double i = 0;
//			l1number = l1.val*(Math.pow(10.0, i));
//			i++;
//			l1= l1.next;
//		}
//    	while (l2.next !=null) {
//    	    double j = 0;
//			l2number = l2.val*(Math.pow(10.0, j));
//			j++;
//			l2= l2.next;
//		}
//        int sumnumber = (int) (l1number + l2number);
//        ListNode l3;
//        for(int k=0;)
//        
//    }
//}