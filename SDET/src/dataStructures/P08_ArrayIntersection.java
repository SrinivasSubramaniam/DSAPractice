package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
		 *  Given two integer arrays nums1 and nums2, return an array of their intersection. 
		 *  Each element in the result must be unique and you may return the result in any order.
		 
		Example 1:
		Input: nums1 = [1,2,2,1], nums2 = [2,2]
		Output: [2] 

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

public class P08_ArrayIntersection {

	@Test
	public void testData1() {
		/*int[] num1 = { 1, 2, 2,3,3,1 };
		int[] num2 = { 2, 2,3,3 };*/
		
		int[] num1 = { 1,2,2,1};
		int[] num2 = { 1,2};
		
		int[] expected= {1,2};
		System.out.println(Arrays.toString(intersection(num1, num2)));
		Assert.assertArrayEquals(expected, intersection(num1, num2));

	}

	@Test
	public void testData2() {
		int[] num1 = { 1, 2 };
		int[] num2 = { 3, 4 };
		int[] expected= {};
		System.out.println(Arrays.toString(intersection(num1, num2)));
		Assert.assertArrayEquals(expected, intersection(num1, num2));

	}

	@Test
	public void testData3() {
		int[] num1 = { 2, 2, 2, 2 };
		int[] num2 = { 2, 2, 2, 2 };
		
		int[] expected = {2};
		System.out.println(Arrays.toString(intersection(num1, num2)));
		Assert.assertArrayEquals(expected, intersection(num1, num2));

	}

	/*Psuedo Code
	 * 1. Iterate array 1 and put it in a set
	 * 2. Iterate array 2 and put it in a set2
	 * 3. Use Retail all
	 * 4. Create a new array with set size
	 * 5. iterate set and put it in a array*/
	

	/*
	 * Time Complexity O(n) 
	 * Space Complexity O(1)
	 */

	private int[] intersectionUsingSet(int[] num1, int[] num2) {
		if (num1.length > 0 && num2.length > 0) {
			Set<Integer> set1 = new HashSet<Integer>();
			for (int value : num1) {
				set1.add(value);
			}
			Set<Integer> set2 = new HashSet<Integer>();
			for (int value : num2) {
				set2.add(value);
			}
			set1.retainAll(set2);
			if (set1.size() > 0) {
				int[] num3 = new int[set1.size()];
				int k = 0;
				Iterator<Integer> itr = set1.iterator();
				while (itr.hasNext()) {
					num3[k++] = itr.next();
				}
				return num3;
			} else {
				return new int[] {};
			}
		}
		return new int[] {};
	}
	
	/*
	 * Psuedo code
	 * Sort both the input array
	 * initialize a position variable 
	 * Traverse through a outer for loop and a inner for loop
	 * Check if i and j values are same then assign that value to input array in position index
	 * Time Complexity O(n^2) 
	 * Space Complexity O(1)
	 */
	private int[] intersection(int[] num1, int[] num2) {
		if (num1.length>0 && num2.length>0) {
			int previous = -1;
			int pos = 0;
			Arrays.sort(num1);
			Arrays.sort(num2);
			String s="abc";
			StringBuilder sbr=new StringBuilder();
			for (int i = 0; i < num1.length; i++) {
				for (int j = 0; j < num2.length; j++) {
					if (num1[i] == num2[j] && num1[i] != previous) {
						num1[pos++] = num1[i];
						previous = num1[i];
						break;
					}
				}
			}
			System.out.println(pos);
			return Arrays.copyOfRange(num1, 0, pos);
			// return num1;
		}
		return new int[] {};
	}
	
	
	/*private int[] intersectionUsingTwoPointer(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                nums1[k++]=nums1[i];
                i++;
                j++;
            }
        }
		return  Arrays.copyOfRange(nums1, 0, k);
		
	}
	*/

	
}
