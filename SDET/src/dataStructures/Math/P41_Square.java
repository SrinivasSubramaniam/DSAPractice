package dataStructures.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P41_Square {
	/*
	 * Given an array of positive integers nums and a positive integer target,
	 * return the minimal length of a contiguous subarray [numsl, numsl+1, ...,
	 * numsr-1, numsr] of which the sum is greater than or equal to target. If
	 * there is no such subarray, return 0 instead.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: target = 7, nums = [2,3,1,2,4,3] Output: 2 Explanation: The
	 * subarray [4,3] has the minimal length under the problem constraint.
	 * Example 2:
	 * 
	 * Input: target = 4, nums = [1,4,4] Output: 1 
	 * 
	 * 
	 * 1)What is the input(s)? - integer array 
	 * What is the expected output? -integer
	 * integer Do I have constraints to solve the problem? - 
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- [1,1,1,2,2,3] Negative data-[5,5,5,5] Edge Case-
	 * [2,2,4,4,6,6,6]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Two pointer
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem?
	 * 
	 * 6) If you know alternate solutions-> find out the O notations
	 * (performance) Then explain the both or the best (depends on the time) 1
	 * 
	 * 
	 * Approach 1-> Start with the worst -> Improve to optimize -> End up with
	 * the best Approach 2-> Write down the options and benefits and code the
	 * best
	 * 
	 * 7) Start with the Pseudo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it
	 *
	 *
	 *
	 * /
	 */

	@Test
    public void Test1(){
    	int target=15;
    	squareRoot(target);
    	Assert.assertEquals(squareRootUsingBinary(target), 3);
    	
    }
	
	@Test
    public void Test2(){
    	int target=16;
    	squareRoot(target);
    	Assert.assertEquals(squareRootUsingBinary(target), 4);
    	
    }
	@Test
    public void Test3(){
    	int target=17;
    	squareRoot(target);
    	Assert.assertEquals(squareRootUsingBinary(target), 4);
    	
    }
	@Test
    public void Test4(){
    	int target=167;
    	squareRoot(target);
    	Assert.assertEquals(squareRootUsingBinary(target), 12);
    	
    }
	@Test
    public void Test5(){
    	int target=-17;
    	squareRoot(target);
    	Assert.assertEquals(squareRootUsingBinary(target), 4);
    	
    }
	/*@Test
    public void Test3(){
    	int target=77;
    	squareRoot(target);
    	Assert.assertEquals(squareRoot(target), 4);
    	
    }
	
	@Test
    public void Test4(){
    	int target=77;
    	squareRoot(target);
    	Assert.assertEquals(squareRoot(target), 4);
    	
    }*/
	
	
	
	  
	
	/* 
	 * Initialize the varaible squareroot to hold the value
	 * Iterate the natural numbers until target
	 * Multiply each number by itself and store it in square root
	 * Check if the number is less than the target
	 * If the square root is greater than the target then calculate mid point of i and i-1
	 * */
	
	private int squareRoot(int target){
		int square=0;
		if (target<0) target=target*-1;
		for (int i = 1; i <= target/2; i++) {
			square=i*i;
			if (square==target) return i;
			if (square>target) {
				System.out.println((i+(i-1))/2);
				return (i+(i-1))/2;
			}
		}
		return 0;
		
	}
	
	/*//low->1 high->target/2 mid-> (low+high)/2   1+7->4
	 * Initialize three variables  as low,high and mid
	 * Check in while whether low is greater than or equal to high
	 * calculate the mid with low of high
	 * square the mid and check if it matches the target return mid
	 * if it is less than then assign low to mid+1
	 * if it is greater then assign high to mid-1
	 * return mid
	 * 
	 * */
	private int squareRootUsingBinary(int target){
		if (target<0) target=target*-1;
		int low=2,high=target/2;
		int mid=0;
		while (low<=high){//2 //7 
			mid=(low+high)/2;//4;
			if (target==mid*mid) return mid; //no match
			else if (mid*mid<target) low=mid+1;//16 <15 5
			else high=mid-1;   //3 , 4
		}
		return mid;
		
	}
	  
}
	    
	    
	    
	    
	
