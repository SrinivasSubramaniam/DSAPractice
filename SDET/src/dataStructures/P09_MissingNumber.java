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
 * Given an array nums containing n distinct numbers in the range [0, n],
 *  return the only number in the range that is missing from the array.

Input: nums = [3,0,1]
Output: 2

         * 1) Did I understand the problem? Yes or No !! - 
         * -> If No, Ask the person to provide more detail with example(s) 
         * -> If yes, go to next step !!
         * 
         * What is the input(s)? - Integer Array
         * What is the expected output? - integer
         * Do I have constraints to solve the problem? -  input array can have numbers anywhere between [0,n] and array can be unsorted array
         * Do I have all informations to go to next step!!
         * How big is your test data set will be?
         *
         *
         *2) Test Data Set
         *  Minimum of 3 data set !! Positive, Edge and Negative
         *  Validate the data set with the interviewer 
         *
         *3) Do I know how to solver it?
         *    Yes - great, Is there any alternate solution?- Brute Force
         *    No - Can I break down the problem to sub problems?
         *
         *4) Ask for the hint (If you don't know how to solve it) 
         *
         *
         *5) Do I know alternate solution to solve this problem?-Sum of 0 to n is n*(n-1)/2
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

public class P09_MissingNumber {

	@Test
	public void testData1() {
		int[] num1 = {0,1,3};
		System.out.println(missingSequenceUsingSum(num1));
		Assert.assertEquals(2, missingSequenceUsingSum(num1));
		

	}

	@Test
	public void testData2() {
		int[] num1 = {2,3,4};
		System.out.println(missingSequenceUsingSum(num1));
		Assert.assertEquals(-1, missingSequenceUsingSum(num1));

	}

	@Test
	public void testData3() {
		int[] num1 = {4,8,9,5,6};
		System.out.println(missingSequenceUsingSum(num1));
		Assert.assertEquals(7, missingSequenceUsingSum(num1));

	}
	/*Psuedo code
	 *1)To check if the array is empty or length 1 and return -1
	 *2)Traverse the array and find minimum and maximum value
	 *3)Find the mathematical sum with maximum value by using n*(n-1)/2
	 *4)Find the sum of values missing before minimum value and subtract with the some
	 *5)After subtracting we will get sum of input array
	 *6)Traverse the array and subtract each number from the sum 
	 *7)return the sum value which will be the missing number 
	 */
	

	/*
	 * Time Complexity O(2n)-> O(n)
	 * Space Complexity O(1)
	 */
	private int missingSequenceUsingSum(int[] num1) {
		if (num1.length>1) {
			int max=num1[0];
			int min=num1[0];
			for (int i = 1; i < num1.length; i++) {
				if (num1[i]>max) max=num1[i];
				if (num1[i]<min) min=num1[i]; 
				
			}		
			int sum = ((max) * (max + 1) / 2) -((min-1)*(min)/2) ;
			for (int i = 0; i < num1.length; i++) {
				sum -= num1[i];

			}
			if (sum!=0) return sum;
			return -1;
		}
		return -1;
		
	}
	
	
	/*Psuedo Code
	 *1)Check if the length of the array is more than 0 else return -1
	 *2)Sort the array
	 *3)Assign Missed Number to -1
	 *3)Traverse the array from the length 1 and check if difference between the adjacent numbers are >1
	 *4)if greater than 1 then do n-1 and assign the value to the missed Number and break the loop 
	 *5)Return missed number;
	 *
	 *
	 * Space Complexity O(n)
	 * Time Complexity O(1)
	 */
	
	private int missingSequence(int[] num1) {
		if (num1.length>1) {
			Arrays.sort(num1);
			int missedNumber=-1;
			for (int i =1; i < num1.length; i++) {
				if (num1[i] - num1[i-1] > 1) {
					missedNumber = num1[i] - 1;
					break;
				}
			}
			return missedNumber;
		}
		
		return -1;		
	}
	
	/*private int missingSequenceBubbleSort(int[] num1) {
		if (num1.length>0) {
			boolean flag;
			int temp;
			for (int i = 0; i < num1.length-1; i++) {
				flag=false;
				for (int j = 0; j < num1.length-i-1; j++) {
					if (num1[j]>num1[j+1])
					{
						temp=num1[j];
						num1[j]=num1[j+1];
						num1[j+1]=temp;
						flag=true;
					}
					if (flag==false) break;
					
				}
			}
			if (num1[num1.length-1]-num1[0]==num1.length-1) return -1;
			int missedNumber = 0;
			for (int i = 0; i < num1.length - 1; i++) {
				if (num1[i + 1] - num1[i] > 1) {
					missedNumber = num1[i + 1] - 1;
					break;
				}

			}
			return missedNumber;
		}
		return -1;
		
		
	}*/
	
	
	/*private int missingSequence(int[] num1) {
		if (num1.length>0) {
			Arrays.sort(num1);
			if (num1[num1.length-1]-num1[0]==num1.length-1) return -1;
			int missedNumber = 0;
			for (int i = 0; i < num1.length - 1; i++) {
				if (num1[i + 1] - num1[i] > 1) {
					missedNumber = num1[i + 1] - 1;
					break;
				}

			}
			return missedNumber;
		}
		return -1;
		
		
	}*/
	/*Psuedo code
	 *1)Check if the length is >0 else return -1
	 *2)Sort the array
	 *2)Check in while whether left < right
	 *3)heck if the middle position is higher than the middle number
	 *4. If yes assign middle to right so that we can avoid the other numbers 
	 *5. Else assign middle+1 to left
	 *6. Finally we will have left and right will have same position, now value next to left is missing
	 */
	/*
	 * Time Complexity O(n) 
	 * Space Complexity O(1)
	 */
	
	/*
	 *  {4,8,9,5,6}
	 *  After sorting {4,5,6,8,9}
	 */
	
	/*
	 * private int missingSequenceUsingMid(int[] num1) {
		if (num1.length>0) {
			Arrays.sort(num1);
			int leftPos = 0;
			int rightPos = num1.length-1;
			int midPos;
			while (leftPos < rightPos) {
				midPos = num1[leftPos]+num1[rightPos]/ 2;
				if (num1[midPos] > midPos) {
					rightPos = midPos;
				} else {
					leftPos = midPos + 1;
				}
			}
			return leftPos;
		}
		return -1;
		
	}
	 */

	
	
	
	

	
}
