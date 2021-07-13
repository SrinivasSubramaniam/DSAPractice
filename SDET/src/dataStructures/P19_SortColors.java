package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P19_SortColors {

	/*
	 * Given an array nums with n objects colored red, white, or blue, sort them
	 * in-place so that objects of the same color are adjacent, with the colors
	 * in the order red, white, and blue.
	 * 
	 * We will use the integers 0, 1, and 2 to represent the color red, white,
	 * and blue, respectively.
	 * 
	 * You must solve this problem without using the library's sort function.
	 * 
	 * 
	 * What is the input(s)? - integer array
	 * String What is the expected output? - integer array 
	 * Do I have constraints to solve the problem? - Shouldn't use library sort 
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [2,0,1] Output: [0,1,2]
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [0] Output: [0]
	 * 
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! 
	 * Positive- [2,0,2,1,1,0]
	 * Negative - []
	 * Edge- [2,2,0,0]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes 
	 * Yes - great, Is there any alternate solution?- Brute force
	 *  No - Can I break down the problem to sub problems?
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
	 */

	@Test
	public void testData1() {
		int[] num={2,0,2,1,1,0};
		
		Assert.assertEquals(Arrays.equals(new int[] {0,0,1,1,2,2},sortColorsUsingThreePointers(num)),true);
	}
	
	/*@Test
	public void testData2() {
		int[] num={};
		
		Assert.assertEquals(Arrays.equals(new int[] {-1,-1},sortColorsUsingThreePointers(num)),true);
	}

	@Test
	public void testData3() {
		int[] num={2,2,0,0};
		Assert.assertEquals(Arrays.equals(new int[] {0,0,2,2},sortColorsUsingThreePointers(num)),true);
	}*/

	/*
	 * Create a count array to store the count of colors 
	 * Traverse the input array and increment the color values in count array 
	 * Initialize numIndex=0
	 * Traverse the count array by outer for loop 
	 * Traverse the each color counts value in a inner loop 
	 * Assign the color counts to input array and then increment the numIndex
	 * 
	 * Time complexity-> O(n)+O(m^2) -> O(n^2)
	 * space complexity -> O(n)
	 */

	private int[] sortColors(int[] num) {
		if (num.length<1) return new int[] {-1,-1};
		int[] count = new int[3];
        for (int i = 0; i < num.length; i++) {
    	   count[num[i]]++;
       	}    
        int numIndex = 0;
        for(int i = 0 ; i < count.length ; i++) {
            for(int j = 0; j < count[i]; j++) {
                num[numIndex++] = i;
            }
        }
        System.out.println(Arrays.toString(num));
        return num;

	}
	
	/*
	 * Create a three pointers left=0,mid=1, right=2
	 * do a while loop to check if left crossed mid
	 * checi if (index=0) then swap and increment left++ and mid++
	 * check if (index=1) then just increment mid++
	 * check if (index=3) then decrement high--
	 */
	
	
	private int[] sortColorsUsingThreePointers(int[] num) {
		int left=0,mid=0,right=num.length-1;
		while (mid<=right)
		{
			if (num[mid]==0) {
				int temp=num[left];
				num[left++]=num[mid];
				num[mid++]=temp;
			}
			else if (num[mid]==1) mid++;
			else{
				int temp=num[mid];
				num[mid]=num[right];
				num[right--]=temp;
			}
		}
		System.out.println(Arrays.toString(num));
		return num;
		
	}
	
	

}
