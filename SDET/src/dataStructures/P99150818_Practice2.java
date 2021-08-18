package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P99150818_Practice2 {

	/*
	 * Given an int array [1,4,20,3,10,5] and target sum 33.
If target subarray sum is found, return true else false
Time : 20 Minutes 
- Write another 2 test data (edge and neg)
- Pseudo Code for Optimised Solution
- Code, Debug
- Time everything 
- Do it yourself !! 
	 * 
	 * 
	 * 
	 *1) Input-int array
	 *	 Output - boolean
	 *	 Constraints- no
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * [1,4,20,3,10,5]
	 * target = 38
	 * 	Negative data- 
	 * [1,4,20,3]
	 * target -39
	 * 	Edge Case- 
	 * [20,3,22,1,5] 
	 * target - 23
	 * 
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * Create a two pointers with left and right as 0
	 * Create a windowSum as 0
	 * Iterate the loop for right till it reaches the end
	 * Add the sum of the current window from left to right till it reaches end
	 * if the target is found return true
	 * if the target is greater break the window
	 * After completing the iteration if the target is not found return false;
	 * 
	 * 
	 * Time Complexity - O(N)- best case
	 * O(N^2)- worst case
	 * 
	 * PsuedoCode: 6 mins
	 * Code: 6 mins
	 * Debug: 3 mins
	 * 
	 * 
	 * 
	 */
	
	
		
	
	@Test
    public void test1(){
		int[] input={1,4,20,3,10,5};
		int target=38;
		System.out.println(findX(input, target));
		Assert.assertTrue(findX(input, target));
    }
	@Test
    public void test2(){
		int[] input={1,4,20,3};
		int target=21;
		System.out.println(findX(input, target));
		Assert.assertFalse(findX(input, target));
    }
	@Test
    public void test3(){
		int[] input={20,3,22,1,1};
		int target=23;
		System.out.println(findX(input, target));
		Assert.assertTrue(findX(input, target));
    }
	

	private boolean findX(int[] input, int target) {
		int left=0,right=0,windowSum=0;
		while (right<input.length){
			windowSum+=input[right++];
			if (windowSum == target) return true;
			if (windowSum>target){
				right=++left;
				windowSum=0;
			}
		}
		return false;
	}


}
