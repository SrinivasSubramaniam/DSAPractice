package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P42_PeakElement {
	/*A peak element is an element that is strictly greater than its neighbors.
	Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
	You may imagine that nums[-1] = nums[n] = -∞.
	You must write an algorithm that runs in O(log n) time.
	 
	Example 1:
	Input: nums = [1,2,3,1]
	Output: 2
	Explanation: 3 is a peak element and your function should return the index number 2.
	Example 2:
	Input: nums = [1,2,1,3,5,6,4]
	Output: 5
	Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.*/

	@Test
    public void Test1(){
    	int[] nums={1,7,1,3,5,6,4};
    	peakElement(nums);
    }
	
		
	/*
	 * Sort the array
	 * Initialize low, high and mid variable
	 * check in the while if low<=high
	 * if(mid>
	 * 
	 * 
	 */
	
	  
	
	
	
	private int peakElement(int[] target){
		int left=0,right=target.length-1;
		while (left<right){
			int mid=(left+right)/2;
			if (target[mid]>target[mid+1]) right=mid;
			else left=mid+1;
			/*if (target[mid]>target[mid+1]&&target[mid]>target[mid-1]) return mid;
			else if (target[mid]<target[mid+1]) left=mid+1;
			else right=mid;*/
		}
		System.out.println(right);
		return left;
		
		
	}
	
	
	  
}
	    
	    
	    
	    
	
