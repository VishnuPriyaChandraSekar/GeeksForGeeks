package com.edu.array;

import java.util.Arrays;

public class WaveForm {
	
	// Time Complexity : O(nlogn)
	public void createWaveForm(int[] nums)
	{
		Arrays.sort(nums);
		int smallest = 0, highest = nums.length -1;
		
		while(smallest < highest) {
			 swap(nums, smallest, highest);
			 smallest = smallest + 2;
			 highest = highest - 2;
		}
		
	}
	
	public void createWaveFormOptimal(int[] nums) {
		int i=1;
		boolean flip = true;
		while(i<nums.length) {
				if(flip && nums[i] > nums[i-1])
					swap(nums, i, i-1);
				else if(!flip && nums[i] < nums[i-1])
					swap(nums, i, i-1);
				i++;
				flip = !flip;
		}
	}
	
	public void swap(int[] nums, int beg, int end) {
		  int tmp = nums[beg];
		  nums[beg] = nums[end];
		  nums[end] = tmp;
	}
	
	public static void main(String[] args) {
		WaveForm form = new WaveForm();
		int[] nums = {2, 2, 8, 8, 8, 20};
				//{10, 5, 6, 3, 2, 20, 100, 80};
				//{20, 10, 8, 6, 4, 2};
		form.createWaveFormOptimal(nums);
		
		for(int i=0;i <nums.length; i++)
				System.out.print(nums[i]+" ");
	}

}
