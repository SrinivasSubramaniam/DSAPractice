package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P22_Assesment1ArrayIntersection {

	/*
	 * 
	 *  What is the input(s)? - two integer array
	 * String What is the expected output? - integer array 
	 * Do I have constraints to solve the problem? - 1 <= nums1.length, nums2.length <= 1000, array can be unsorted array
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive- [1,2,2,1] and [2,2]
	 * Negative - [0] [3,2,1] Edge- [4,9,5],[9,4,9,8,4]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Brute force and two pointer
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
     /*
     *Psuedo code
     *Sort the two array
	 *initialize variable i , j and k to 0
	 *do a while loop and check if i and j less than length
     *if num1 of i less than num2 j value then increment j++
     *else if num1 i value greater than num2 j value then j++
	 *else assign i value to the num1 based on k index
	 *
     *Time complexity - O(n log n)
     *Space complexity - O(n)
     *
     /*/

    public int[] intersect(int[] nums1, int[] nums2) {
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
	
	

}
