package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

/*
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.

Input: nums = [3,0,1]
Output: 2

         * 1) Did I understand the problem? Yes or No !! - Yes 
         * -> If No, Ask the person to provide more detail with example(s) 
         * -> If yes, go to next step !!
         * 
         * What is the input(s)? - integer Array
         * What is the expected output? - integer
         * Do I have constraints to solve the problem? -  Input array is distinct numbers and can be only between (0,n)
         * Do I have all informations to go to next step!!
         * How big is your test data set will be?
         *
         *
         *2) Test Data Set
         *  Minimum of 3 data set !! Positive, Edge and Negative
         *  Validate the data set with the interviewer 
         *
         *3) Do I know how to solver it?
         *    Yes - great, Is there any alternate solution?
         *    No - Can I break down the problem to sub problems?
         *
         *4) Ask for the hint (If you don't know how to solve it)
         *
         *
         *5) Do I know alternate solution to solve this problem?
         *6) If you know alternate solutions-> find out the O notations (performance)
         *  Then explain the both or the best (depends on the time)
         *  
         *  Approach 1-> Start with the worst -> Improve to optimize -> End up with the best
         *  Approach 2-> Write down the options and benefits and code the best
         *  
         *7) Start with the Pseudo code
         * 
         *8) Implement them in the code (editor)
         * 
         *9) Test against the different data set
         * 
         *10) If it fails, debug them to solve it        
*/

public class P10_OccurenceUnique {

	@Test
	public void testData1() {
		int[] num1 = {1,2,2,1,1,3};
		System.out.println(occurenceUnique(num1));
		Assert.assertEquals(true, occurenceUnique(num1));
		

	}

	@Test
	public void testData2() {
		int[] num1 = {1,1,2,2};
		System.out.println(occurenceUnique(num1));
		Assert.assertEquals(false, occurenceUnique(num1));

	}

	@Test
	public void testData3() {
		int[] num1 = {1,-2,0,-2,0,0,0,12,1,1};
		System.out.println(occurenceUnique(num1));
		Assert.assertEquals(true, occurenceUnique(num1));

	}
	/*Pseudocode
	 *1. Check if the length is more than 0 else return false
	 *2. Create a Map to store integer value and it's occurrence
	 *3. Iterate the array and store the values in a map
	 *4. Then create a Set to check if all the elements are unique
	 *5. Add all map values to set
	 *6. Check if the size of map values and set if equal then it elements are distinct else false
	 */
	

	/*
	 * Time Complexity O(n) 
	 * Space Complexity O(1)
	 */
	
	private boolean occurenceUnique(int[] num1)
	{
		if (num1.length>0) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i : num1) {
				if (map.containsKey(i)) {
					map.put(i, map.get(i) + 1);
				} else {
					map.put(i, 1);
				}
			}
			return map.size() == new HashSet<Integer>(map.values()).size();
		} return false;
		
		/*Before Optimizing
		 * Set<Integer> unique=new HashSet<Integer>(map.values());

		if (unique.size()==map.size())
		{
			return true;
		}
		return false;*/
	}


	/*private int occurenceUnique(int[] num1) {
		Arrays.sort(num1);
		int previousNumber=num1[0];
		List<Integer> list=new ArrayList<Integer>();
		int count=1;
		int pos=0;
		for (int i = 1; i < num1.length; i++) {
			if (num1[i+1]==num1[i]&& num1[i+1]==previousNumber)
			{
				list.add(pos, list.get(pos)+1);
			}else 
			{
				list.add(pos++,1);
				previousNumber=num1[i+1];
			}	
		}
		*/
}		
		

	

