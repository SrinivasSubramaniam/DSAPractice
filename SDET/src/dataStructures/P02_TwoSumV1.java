package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P02_TwoSumV1 {
	
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	 * Return the first targ
	 * Problem Solving Techniques :
	 * 1. Do you understand the question?
	 * 		Yes - Go to next step
	 * 		No - Ask the person to provide more detail with example(s).
	 * 
	 *  ->what is the input(s)? --> Integer Array, int
	 * 	->what is the expected output? --> Integer Array
	 *  ->Do i have constraints to solve the problem? --> first match
	 *  ->Do i have all informations to go to next step? -> If all the above mentioned steps (i.e., for Yes) we can proceed
	 *  ->How big is your test data will be? -> 
	 *  
	 *  2. Test Data Set
	 *  -> Minimum of 3 data set !! "Positive" , "Edge" and "Negative" 
	 *  ----> Positive - {2,4,6,8,12} 10
	 *  ----> Negative - {2,4,6,8} 16, {-1,-1 } 4, {} -1
	 *  ----> Edge - {7,3,5,5,7} 10 
	 *  -> Validate with the interviewer if the data set is fine -> its depends on the interviewer
	 *  
	 *  3. Do i know how to solve it?
	 *  
	 *  Yes - Great, is there an alternate? -> Yes
	 *  No - Can i break down the problem into sub problems? 
	 *  then -> 
	 * 
	 * 4. Ask for hint (if you do not know how to solve it?) 
	 *  		-> Ask one time and thank the interviewer
	 *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence 
	 *  		   level to get the next question 
	 *  
	 * 5. Do I know alternate solutions as well?
	 * 	
	 * 	Yes - What are those?
	 *     way of Approach to solve with the following
	 *    -> Brute Force (Standard) --> Yes 
	 *    -> inbuilt approach --> 
	 */

	
	
	@Test
	public void testData1()
	{
		int[] n={2,4,3,2};
		int target=7;
		System.out.println(Arrays.toString(twoSum(n, target)));
		
	}
	@Test
	public void testData2()
	{
		int[] n={2,4,3,2};
		int target=9;
		System.out.println(Arrays.toString(twoSum(n, target)));
		
	}
	@Test
	public void testData3()
	{
		int[] n={1,5,6,7};
		int target=10;
		System.out.println(Arrays.toString(twoSum(n, target)));
		
	}
	
	private int[] twoSum(int[] array, int target)
	
	{
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		   
	    for (int i = 0; i < array.length; i++) {
	    	int sub=target - array[i];
	        if (map.containsKey(sub)) 
	        {
	        	return new int[] {map.get(target-array[i]),i};
	        }
	        map.put(array[i], i);
	    }
		return new int[] {-1,-1};
		
	}
	
	private int[] twoSumBeforeOptimising(int[] array,int target)
	{

		 int[] first = null;
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		   
		    for (int i = 0; i < array.length; i++) {
		        if (map.containsKey(target - array[i])) {
		        	first =new int[2];
		        	first[0] = map.get(target - array[i]);
		            first[1] = i;
		           return first;
		        }
		        map.put(array[i], i);
		    }
			return first;
		    
		    /*if (first!=null)
		    {
		    System.out.println("Pairs are ");
		    for (int i = 0; i < first.length; i++) {
				System.out.print(first[i]+" ");
			}
		    }*/
		  /*  else
		    {
		    	System.out.println("-1");
		    }*/
	
	}
	

}
