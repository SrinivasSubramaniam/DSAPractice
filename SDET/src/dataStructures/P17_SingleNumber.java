package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P17_SingleNumber {

	/*
		Given a non-empty array of integers nums, every element appears twice except for one. 
		Find that single one. You must implement a solution with a linear runtime complexity
		 and use only constant extra space.


		Example 1:
		Input: nums = [2,2,1]
		Output: 1
		
		Example 2:
		Input: nums = [4,1,2,1,2]
		Output: 4
	 * What is the input(s)? - int array[]
	 * String What is the expected output? - integer 
	 * Do I have constraints to solve the problem? - linear runtime complexity and use only constant extra space
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! 
	 * Positive-{1,1,2,3,3}
	 * Negative -{1,1,2,2}
	 * Edge-{4,1,2,1,2}
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes
	 * Yes - great, Is there any alternate solution?- Brute force and two pointer
	 * No - Can I break down the problem to sub problems?
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem? 6) If you know
	 * alternate solutions-> find out the O notations (performance) Then explain
	 * the both or the best (depends on the time) 1
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
	 */

	@Test
	public  void testData1() {
		int[] num={1,1,2,3,3};
		System.out.println(getSingleNumber(num));
		Assert.assertEquals(getSingleNumber(num),2 );
	}
	
	@Test
	public  void testData2() {
		int[] num={1,1,2,2};
		System.out.println(getSingleNumber(num));
		Assert.assertEquals(getSingleNumber(num),-1 );
	}
	
	@Test
	public  void testData3() {
		int[] num={4,1,2,1,2};
		System.out.println(getSingleNumber(num));
		Assert.assertEquals(getSingleNumber(num),4 );
	}
	@Test
	public  void testData4() {
		int[] num={2,2,1};
		System.out.println(getSingleNumber(num));
		Assert.assertEquals(getSingleNumber(num),1 );
	}
	

	/*
	 * Pseudo code
	 * Initialize a hash set
	 * Traverse the array
	 * if set doesn't contain value then add
	 * else remove that value from the set
	 * check if the set size is != 1 return -1
	 * else return the only value in the set
	 * 
	 * Time complexity- --> O(n)
	 * Space Comlexity --> O(n)
	 */


	private int getSingleNumber(int[] num) {
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (!set.contains(num[i])) set.add(num[i]);
			else set.remove(num[i]);
		}
		if(set.size()!=1) return -1;
		Integer value = set.iterator().next();		
		return value;
			
	}
	
	/*
	 * Pseudo code
	 * Sort the input array
	 * initialize the left value with 0 and right value with 1
	 * Do a while loop and check if i<j
	 * check if num[left]!= num[right] then return num[left]
	 * To check in pairs first check if length+2>array length then return -1
	 * else assign left+2
	 * check if right+2>array length then return num[left]
	 * else assign right+2
	 * 
	 * Time complexity -->  O(n log n)
	 * Space complexity --> O(n)
	 */
	private int getSingleNumberUsingTwoPointer(int[] num) {
		Arrays.sort(num);
		int left=0,right=1;	
		while (left<right){
			if(num[left]!=num[right])return num[left];
			if (left+2>=num.length) return -1;
			left+=2;
			if (right+2>=num.length) return num[left]; 	
			right+=2;
		}
		return -1;
	}
	
	/*
	 * 
	 * 
	 */
	
	private int getSingleNumberUsingTwoPointerOpposite (int[] num)
	{
		
		Arrays.sort(num);
		int left=0, right =num.length-1;
		
		while (left<=right)
		{
			if(num[left]!=num[left+1]) return num[left];
			if(num[right]!=num[right+1]) return num[right];
			left+=2;
			right-=2;
			
		}
		return -1;
		
	}
	
	


}
