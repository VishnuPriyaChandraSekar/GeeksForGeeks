package com.edu.array;

import java.util.Arrays;

public class AlternateNumbers {
	/*  Sort the array
	 *  swap the alternate positive and negative numbers
	 * Time Complexity O(nlogn)
	 */
	public void alternateNumber1(int[] nums) {
		if(nums != null || nums.length > 1){
			Arrays.sort(nums);
			int beg = 0, end = nums.length-1;
			
			for(; beg<nums.length; beg++) {
				if(nums[beg] > 0)
					break;
			}
			for(int i=0; i<beg && beg <= end; i = i+2) {
				 swap(nums, i, beg);
				 beg++;
			}
		}
	}
	
	/**
	 * 
	 * Move the negative numbers to the front => O(n)
	 * Swap the alternate positive and negative numbers O(n)
	 * Time complexity 
	 */
	public void alternateNumber2(int[] nums) {
		 if(nums != null || nums.length > 1) {
			 moveNegative(nums);
			 int beg = 0, end = nums.length-1;
				
			 for(; beg<nums.length; beg++) {
					if(nums[beg] > 0)
						break;
				}
		     for(int i=0; i<beg && beg <= end; i = i+2) {
					 swap(nums, i, beg);
					 beg++;
				}
		 }
	}
	
	public void moveNegative(int[] nums) {
		int negative = 0;
		int positive = nums.length -1;
		int index = 0;
		
		while(index <= positive) {
			if(nums[index] < 0) {
				swap(nums, negative, index);
				negative++;
				index++;
			}
			else {
				 swap(nums,positive, index);
				 positive--;
			}
		}
	}
	
	
	public void swap(int[] nums, int beg, int end) {
		  int tmp = nums[beg];
		  nums[beg] = nums[end];
		  nums[end] = tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AlternateNumbers a = new AlternateNumbers();
        int[] nums = //{-8,-6,-7};
        		 {-1, 2, -3, 4, 5, 6, -7, 8, 9}; //{-2,4,-1,-7};
        a.alternateNumber2(nums);
        
        for(int i=0; i<nums.length; i++)
        	System.out.print(nums[i]+" ");
	}

}
