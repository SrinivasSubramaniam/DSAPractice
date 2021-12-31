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

public class P42_SingleElementSortedArray {
	/*
	 * You are given a sorted array consisting of only integers where every
	 * element appears exactly twice, except for one element which appears
	 * exactly once. Find this single element that appears only once.
	 * 
	 * Follow up: Your solution should run in O(log n) time and O(1) space.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,1,2,3,3,4,4,8,8] Output: 2 Example 2:
	 * 
	 * Input: nums = [3,3,7,7,10,11,11] Output: 10
	 */

	@Test
    public void Test1(){
    	int[] nums={1,1,2,3,3,4,4,8,8};
    	singleElementSortedArray(nums);
    }
	@Test
    public void Test2(){
    	int[] nums={1,1,4,4,5,8,8};
    	singleElementSortedArray(nums);
    }
	@Test
    public void Test3(){
    	int[] nums={1,1,2,2,3};
    	singleElementSortedArray(nums);
    }
	@Test
    public void Test4(){
    	int[] nums={2,2,4,4,6,6,7,8,8};
    	singleElementSortedArray(nums);
    }
	@Test
    public void Test5(){
    	int[] nums={2,2,3};
    	singleElementSortedArray(nums);
    }
	@Test
    public void Test6(){
    	int[] nums={2,2,3};
    	singleElementSortedArray(nums);
    }
	
		
	/*
	 * Sort the array
	 * Initialize low, high and mid variable
	 * check in the while if low<=high
	 * if(mid>
	 * 
	 * 
	 */
	
	  
	
	
	//1 1 2 2 3 
	private int singleElementSortedArray(int[] nums){
		int left=0,right=nums.length-1;
		while (left<right){
			int mid=(left+right)/2;
			/*if (nums[mid]==nums[mid+1]){
				if ((right-left)%2==1) left=mid+1;
				else right=mid;
			}else if ((left-mid)%2==0){
				left=mid+1;
			}else right=mid;*/
			if ((mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1 && nums[mid]==nums[mid-1])){
				left=mid+1;
			}else right=mid;
		}
		System.out.println(nums[right]);
		return right;
		
	}
	
	
	  
}
	    
	    
	    
	    
	
