package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 *  Given an array nums of size n, return the majority element. 
 *  you may assume that the majority element always exists in the array.
 *  The majority element is the element that appears more than n/2 times. 

         * 1) Did I understand the problem? Yes or No !! - Yes 
         * -> If No, Ask the person to provide more detail with example(s) 
         * -> If yes, go to next step !!
         * 
         * What is the input(s)? - integer Array
         * What is the expected output? - integer
         * Do I have constraints to solve the problem? - majority element is the element that appears more than n/2 times. 
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

public class P07_MaxOccurence {

	@Test
	public void testData1() {
		int[] array = { 6, 6, 2, 2, 2 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(2, maxOccurenceUsingMid(array));

	}

	@Test
	public void testData2() {
		int[] array = { 2, 2, 4, 4 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(-1, maxOccurenceUsingMid(array));

	}

	@Test
	public void testData3() {
		int[] array = { 2,2,2,2,2 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(2, maxOccurenceUsingMid(array));

	}
	@Test
	public void testData4() {
		int[] array = { 1,2,2,2 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(2, maxOccurenceUsingMid(array));

	}

	/*@Test
	public void testData4() {
		int[] array = { 2, 2 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(2, maxOccurenceUsingMid(array));

	}

	@Test
	public void testData5() {
		int[] array = { 1, 2 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(-1, maxOccurenceUsingMid(array));

	}

	@Test
	public void testData6() {
		int[] array = { 2, 2, 2, 4 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(2, maxOccurenceUsingMid(array));

	}

	@Test
	public void testData8() {
		int[] array = { 2, 4, 4, 4 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(4, maxOccurenceUsingMid(array));

	}

	@Test
	public void testData9() {
		int[] array = { 1, 2, 2, 4 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(-1, maxOccurenceUsingMid(array));

	}

	@Test
	public void testData10() {
		int[] array = { 1, 2, 2, 5, 6 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(-1, maxOccurenceUsingMid(array));

	}

	@Test
	public void testData7() {
		int[] array = { 6, 6, 3, 2, 2 };
		System.out.println(maxOccurenceUsingMid(array));
		Assert.assertEquals(-1, maxOccurenceUsingMid(array));

	}*/
	/*
	 * Psuedo Code 
	 * 1)Do a for loop with lenght/2 
	 * 2)Create a count variable to get the max Occurence 
	 * 3)Create nested for loop and check whether i+1 element is matching the previous value 
	 * 4)If matching increment it 
	 * 5)Check if the count is more than length/2
	 */

	/*
	 * Time Complexity O(m*n) Space Complexity O(n)
	 */
	private int maxOccuerence(int[] array) {
		for (int i = 0; i <= array.length / 2; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count > array.length / 2) {
				return array[i];
			}
		}
		return -1;

	}
	/*
	 * Psuedo Code 
	 * 1)Create a HashMap to store the value and occurrences
	 * 2)Traverse through an array 
	 * 3)Put the value and occurences 
	 * 4)if the value is greater than n/2 return the array 
	 * 5)Check if the count is more than length/2
	 */

	/*
	 * Time Complexity Worst case ->O(n), Best case -> O(1) Space Worst case
	 * ->O(n), Best case -> O(1))
	 */

	private int maxOccurenceUsingMap(int[] array) {
		if (array.length > 0) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < array.length; i++) {
				map.put(array[i], map.getOrDefault(array[i], 0) + 1);

				if (map.get(array[i]) > (array.length) / 2) {
					return array[i];
				}

			}
		}
		return -1;

	}
	/*
	 * Psuedocode 
	 * 1)Check if the length is greater than 0 return -1
	 * 2)Check if the length is 1 return the value
	 * 3)Sort the array
	 * 4)For array with odd length check if the mid value, mid-1 and mid-2 are same
	 * 5)For array with even length check if the mid value, mid-1 and mid value+ 1 are same
	 */

	private int maxOccurenceUsingMid(int[] array) {
		if (array.length > 0) {
			if (array.length == 1)
				return array[0];
			if (array.length == 2) {
				if (array[0] == array[1])
					return array[0];
				return -1;
			}
			Arrays.sort(array);
			int mid = array.length / 2;
			if (/* array[mid] == array[mid - 1]&& */array[mid] == array[mid - 2]
					|| array[mid] == array[mid - 1] && array[mid] == array[mid + 1])
				return array[mid];
			return -1;

		}
		return -1;

	}
}
