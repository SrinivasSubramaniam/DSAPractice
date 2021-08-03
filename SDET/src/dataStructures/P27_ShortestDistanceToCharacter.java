package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P27_ShortestDistanceToCharacter {

	/*
	 * 
	 * Given a string s and a character c that occurs in s, return an array of
	 * integers answer where answer.length == s.length and answer[i] is the
	 * distance from index i to the closest occurrence of character c in s.
	 * 
	 * The distance between two indices i and j is abs(i - j), where abs is the
	 * absolute value function.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "loveleetcode", c = "e" Output: [3,2,1,0,1,0,0,1,2,2,1,0]
	 * Explanation: The character 'e' appears at indices 3, 5, 6, and 11
	 * (0-indexed). The closest occurrence of 'e' for index 0 is at index 3, so
	 * the distance is abs(0 - 3) = 3. The closest occurrence of 'e' for index 1
	 * is at index 3, so the distance is abs(1 - 3) = 3. For index 4, there is a
	 * tie between the 'e' at index 3 and the 'e' at index 5, but the distance
	 * is still the same: abs(4 - 3) == abs(4 - 5) = 1. The closest occurrence
	 * of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
	 * Example 2:
	 * 
	 * Input: s = "aaab", c = "b" Output: [3,2,1,0]
	 * 
	 *1)What is the input(s)? - String, Character
	 * String What is the expected output? - integer array 
	 * Do I have constraints to solve the problem? - s[i] and c are lowercase English letters,It is guaranteed that c occurs at least once in s
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive- "aaab" Negative -
	 * Edge- "loveleetcode"
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Brute force
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
	 * 10) If it fails, debug them to solve it /* Psuedo code Traverse the array
	 * from the last index check if last index value is less than 9, then
	 * increment last value and return array else put last value as 0 and that
	 * will increment the previous digits create a new array to fit the extra
	 * value like two digit number changed to three digit number assign 1 to
	 * first index of new array Time complexity - O(n) Space complexity - O(n)
	 *
	 *Psuedo code
	 *
	 *
	 *
	 *
	 * /
	 */
	
	    @Test
	    public void test1() {
	        String text="loveleetcodeab";
	        Character ch='e';
	        shortestUsingList(text, ch);
	        
	    }
	    @Test
	    public void test2() {
	        String text="lovglggtcode";
	        Character ch='e';
	        shortestUsingList(text, ch);
	        
	    }
	    
	    @Test
	    public void test3() {
	        String text="abaa";
	        Character ch='b';
	        shortestUsingList(text, ch);
	        
	    }
	    /*
	     * Pseudo code
	     * Create an Output array of same text length
	     * Initialize a previous value to calculate log the distance
	     * Traverse through the text from left to right, 
	     * if character is present then assign assign 0
	     * else increment the previous value
	     * Repeat the same thing for left to right 
	     * While assigning compare the existing value with current distance and assign the minimum value 
	     * 
	     * 
	     * Time Complexity-> O(n)
	     * Space Complexity-> O(n)
	     * 
	     */

	private int[] shortestDistanceBruteForce(String text, char ch) {
		int[] outPut = new int[text.length()];
		int prevValue = text.length();
		for (int i = 0; i < outPut.length; i++) {
			if (text.charAt(i) == ch) prevValue = 0;
			outPut[i] = prevValue++;
		}
		prevValue = text.length();
		for (int i = outPut.length - 1; i >= 0; i--) {
			if (text.charAt(i) == ch) prevValue = 0;
			outPut[i] = Math.min(outPut[i], prevValue++);
		}
		System.out.println(Arrays.toString(outPut));
		return outPut;
	}
	
	/*
     * Pseudo code
     * Create an Output array of same text length
     * Create a list to store the index of character occurrence
     * Traverse through the text and store the character occurence in list
     * Initialize two variable previousIndex and NextIndex and listIndex
     * Traverse through the text and if character is found then assign 0
     * Also swap the index variable of j and k with next one
     * if character is not found then find the minimum absolute difference between i,j and i,k
     * Then store in the output Array
     * 
     * 
     * Time Complexity-> O(n)
     * Space Complexity-> O(n)
     * 
     */
	
	
	private int[] shortestUsingList(String text, char ch) {
		int[] outPut = new int[text.length()];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch)
				list.add(i);
		}
		int previousIndex = list.get(0), nextIndex = list.get(0), listIndex = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch) {
				outPut[i] = 0;
				previousIndex = nextIndex;
				if (listIndex + 1 < list.size()) nextIndex = list.get(++listIndex);					
			}
			outPut[i] = Math.min(Math.abs(i - previousIndex), Math.abs(i - nextIndex));
		}
		System.out.println(Arrays.toString(outPut));
		return outPut;

	}
	
	 /*
     * Pseudo code
     * Create an Output array of same text length
     * Initialize the previous variable to the text length
     * Declare a j variable to keep track of indices
     * Traverse through the text
     * if character is found then make that index zero and make previouValue=1
     * calculate the previous index by subtracting 1
     * in while check if difference of j and i greater than  previous index value
     * then assign the lowest value to previous index and decrement j
     * else increment the index with previousValue
     * 
     * 
     * Time Complexity-> O(n)
     * Space Complexity-> O(n)
     * 
     */


	private int[] shortestDistanceSinglePass(String text, char ch) {
		int[] outPut = new int[text.length()];
		int prevValue = text.length(), j;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch) {
				outPut[i] = 0;
				prevValue = 1;
				j = i - prevValue;
				while (j >= 0 && outPut[j] > i - j) {
					outPut[j] = i - j;
					j--;
				}
			}
			else outPut[i] = prevValue++;
		}
		System.out.println(Arrays.toString(outPut));
		return outPut;
	}
	
	

	private int[] shortestDistance(String text, char ch) {
		int[] leftToRight = new int[text.length()];
		int endIndex = Integer.MAX_VALUE;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch) {
				int k = 0;
				for (int j = i; j >= endIndex; j--) {
					leftToRight[j] = k++;
				}
				endIndex = i + 1;
			}
		}

		int[] rightToLeft = new int[text.length()];
		boolean flag = false;
		int k = 0;
		for (int i = 0; i < text.length(); i++) {
			if (flag == false) {
				rightToLeft[i] = Integer.MAX_VALUE;
				if (text.charAt(i + 1) == ch)
					flag = true;
			} else {
				if (text.charAt(i) == ch) {
					k = 0;
					rightToLeft[i] = k++;
				} else
					rightToLeft[i] = k++;
			}

		}
		for (int i = 0; i < leftToRight.length; i++) {
			leftToRight[i] = Math.min(leftToRight[i], rightToLeft[i]);
		}
		System.out.println("leftToRightis " + Arrays.toString(leftToRight));
		return leftToRight;
	}
    }
