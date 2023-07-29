package Arraylist;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		ArrayList<Integer>evenNums=new ArrayList<>();
		ArrayList<Integer>oddNums=new ArrayList<>();
		nums.add(25);
		nums.add(35);
		nums.add(45);
		nums.add(55);
		nums.add(65);
		nums.set(3,75);
		nums.add(1,10);
		nums.remove(0);
		//System.out.println(nums.size());
		//System.out.println(nums);
		//System.out.println(nums.get(2));
//		for(int i=0;i<nums.size();i++) {
//			//System.out.println(nums.get(i));
//			
//		}
//		for(Integer n:nums) {
//			System.out.println(n);
//		}
//		for(int i=0;i<nums.size();i++) {
//			if(nums.get(i)%2==0) {
//				
//			}
//		}
//		for(Integer n:nums) {
//			if(n%2!=0) {
//				System.out.println(n);
//			}
//		}
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i)%2==0) {
				evenNums.add(nums.get(i));
			}else {
				oddNums.add(nums.get(i));
			}
		}
		System.out.println(evenNums);
		System.out.println(oddNums);
		System.out.println(evenNums+","+oddNums);
		for (int i=0;i<nums.size();i++) {
			
	}
	}
	

}
