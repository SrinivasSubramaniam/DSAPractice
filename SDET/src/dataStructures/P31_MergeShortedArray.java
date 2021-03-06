package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P31_MergeShortedArray {

	/*
	 * You are given two integer arrays nums1 and nums2, sorted in
	 * non-decreasing order, and two integers m and n, representing the number
	 * of elements in nums1 and nums2 respectively.Merge nums1 and nums2 into a
	 * single array sorted in non-decreasing order.
	 * 
	 * The final sorted array should not be returned by the function, but
	 * instead be stored inside the array nums1. To accommodate this, nums1 has
	 * a length of m + n, where the first m elements denote the elements that
	 * should be merged, and the last n elements are set to 0 and should be
	 * ignored. nums2 has a length of n.   
	 * 
	 * Example 1:
	 * 
	 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output:
	 * [1,2,2,3,5,6] Explanation: The arrays we are merging are [1,2,3] and
	 * [2,5,6]. The result of the merge is [1,2,2,3,5,6] with the underlined
	 * elements coming from nums1.
	 * 
	 * Example 2:
	 * 
	 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1 Output: [1] Explanation:
	 * The arrays we are merging are [] and [1]. The result of the merge is [1].
	 * Note that because m = 0, there are no elements in nums1. The 0 is only
	 * there to ensure the merge result can fit in nums1.
	 * 
	 * 
	 * 
	 * 1)What is the input(s)? - String, Character String What is the expected
	 * output? - integer array Do I have constraints to solve the problem? -
	 * s[i] and c are lowercase English letters,It is guaranteed that c occurs
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
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
	 * Psuedo code
	 *
	 *
	 *
	 *
	 * /
	 */
	
	    @Test
	    public void test1() {
	        int[] nums1={1,2,3,0,0,0};
	        int[] nums2={2,5,6};
	        int m=3;
	        int n=3;
	        
	        mergeSortedArray(nums1, nums2,m,n);
	        
	    }
	    @Test
	    public void test2() {
	        int[] nums1={1};
	        int[] nums2={};
	        int m=1;
	        int n=0;
	        mergeSortedArray(nums1, nums2,m,n);
	        
	    }
	    @Test
	    public void test3() {
	        int[] nums1={0};
	        int[] nums2={1};
	        int m=0;
	        int n=1;
	        mergeSortedArray(nums1, nums2,m,n);
	        
	    }
	    @Test
	    public void test4() {
	        int[] nums1={4,5,6,0,0,0};
	        int[] nums2={1,2,3};
	        int m=3;
	        int n=3;
	        mergeSortedArray(nums1, nums2,m,n);
	        
	    }
	    /*
	     * Pseudo code
	     * Compare the given last index of both the arrays and replace the value from end index
	     * Check in while loop if first Array End index is greater than second Array Last index 
	     * then push the value higher value to the last
	     * then decrement the firstIndex and EndIndex
	     * Else push the second Index higher value to the end index
	     * then decrement both end and right
	     * In another while loop replace the remaining second index if some value is missed out
	     * 
	     * 
	     * Time Complexity-> O(n)
	     * Space Complexity-> O(1)
	     * 
	     */
	    
	private int[] mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {
		int firstEndIndex = m - 1, secondEndIndex = n - 1;
		int endIndex = m + n - 1;
		while (firstEndIndex >= 0 && secondEndIndex >= 0) {
			if (nums1[firstEndIndex] > nums2[secondEndIndex]) {
				nums1[endIndex--] = nums1[firstEndIndex--];
			} else {
				nums1[endIndex--] = nums2[secondEndIndex--];
			}
			
		}
		while (secondEndIndex >= 0) {
			nums1[endIndex--] = nums2[secondEndIndex--];
		}
		System.out.println(Arrays.toString(nums1));

		return nums1;

	}

	/*private int[] mergeSortedArray(int[] nums1, int[] nums2,int m,int n) {
		int leftIndex = 0, rightIndex = 0;
		
		while (leftIndex < nums1.length && rightIndex < n) {

			if (nums1[leftIndex] > nums2[rightIndex]) {
				int temp = nums1[leftIndex];
				nums1[leftIndex++] = nums2[rightIndex];
				nums2[rightIndex] = temp;
			}
			if (nums2[rightIndex] < nums1[leftIndex]) {
				int temp = nums1[leftIndex];
				nums1[leftIndex++] = nums2[rightIndex];
				nums2[rightIndex] = temp;
			}
			
			if (leftIndex>=m) nums1[leftIndex++]=nums2[rightIndex++];
			else leftIndex++;
		}
		System.out.println(Arrays.toString(nums1));
		return nums1;

	}*/
}
