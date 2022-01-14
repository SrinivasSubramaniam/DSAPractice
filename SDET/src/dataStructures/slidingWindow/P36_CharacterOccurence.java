package dataStructures.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P36_CharacterOccurence {
	/*
	 * Given a sorted array nums, remove the duplicates in-place such that
	 * duplicates appeared at most twice and return the new length. Do not
	 * allocate extra space for another array; you must do this by modifying the
	 * input array in-place with O(1) extra memory.
	 * 
	 * Example 1: Input: nums = [1,1,1,2,2,3] Output: 5, nums = [1,1,2,2,3]
	 * Explanation: Your function should return length = 5, with the first five
	 * elements of nums being 1, 1, 2, 2 and 3 respectively. It doesn't matter
	 * what you leave beyond the returned length.
	 * 
	 * Example 2: Input: nums = [0,0,1,1,1,1,2,3,3] Output: 7, nums =
	 * [0,0,1,1,2,3,3] Explanation: Your function should return length = 7, with
	 * the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3
	 * respectively. It doesn't matter what values are set beyond the returned
	 * length.
	 * 
	 * 
	 * 1)What is the input(s)? - integer array 
	 * What is the expected output? - integer 
	 * Do I have constraints to solve the problem? - Should not allocate extra space
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- [1,1,1,2,2,3]
	 * Negative data-[5,5,5,5]
	 * Edge Case- [2,2,4,4,6,6,6]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Two pointer
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
    public void Test1(){
    	String str="eceba";//kew
    	int k=2;
    	//int max=longestSubString(str,k);
    	//System.out.println("str " + str+ " is "+ max);
    	longestSubString(str,k);
    	//removeDuplicatesTwoPointer(customersArray);
    	
    }
	   

		@Test
	    public void Test2(){
	    	String str="aabaa";//kew
	    	int k=2;
	    	//int max=longestSubString(str,k);
	    	//System.out.println("str " + str+ " is "+ max);
	    	longestSubString(str,k);
	    	//removeDuplicatesTwoPointer(customersArray);
	    	
	    }
	    
		@Test
	    public void Test3(){
	    	String str="abcde";//kew
	    	int k=6;
	    	//int max=longestSubString(str,k);
	    	//System.out.println("str " + str+ " is "+ max);
	    	longestSubString(str,k);
	    	//removeDuplicatesTwoPointer(customersArray);
	    	
	    }
		@Test
	    public void Test4(){
	    	String str="eceeebaeceeeeee";//kew
	    	int k=2;
	    	//int max=longestSubString(str,k);
	    	//System.out.println("str " + str+ " is "+ max);
	    	longestSubString(str,k);
	    	//removeDuplicatesTwoPointer(customersArray);
	    	
	    }
		@Test
	    public void Test5(){
	    	String str="eceba";//kew
	    	int k=3;
	    	//int max=longestSubString(str,k);
	    	//System.out.println("str " + str+ " is "+ max);
	    	longestSubString(str,k);
	    	//removeDuplicatesTwoPointer(customersArray);
	    	
	    }
	  
	
	/* * abcabcbb - 
	 * 
	 * initialize an array with length 128, initialize left and right values to zero and max as 0
	 * Traverse the string and increment the counter value
	 * if ascii value of right is more than 1
	 * calculate the max  
	 * decrement the left until it reaches 1
	 * return max
	 * */
	 
	    private int longestSubString(String str, int k) {
	    	if (str.length()<=k) return str.length();
	    	int left=0,right=0,max=0;
	    	Map<Character, Integer> map =new HashMap<Character, Integer>();
	    	while (right<str.length()){
	    		map.put(str.charAt(right), right++);//e->0  right-->1 //c->1 right-->2//e->1 right-->3
	    		if (map.size()>k){
	    			int minIndex = Collections.min(map.values());
	    			//map.remove(0);
	    			map.remove(str.charAt(minIndex));
	    			left=minIndex+1;
	    		}
	    		max = Math.max(max,right-left);//max--> 1-0 //max-->2-0 --> 2//max-->
	    		//System.out.println(str.substring(left, right));
	    	}
	    	
	    	System.out.println(max);
	    	return max;			
		}
	    
	    private int longestSubStringUsingASCII(String str, int k) {
	    	if (str.length()<=k) return str.length();
	    	int left=0,right=0,max=0,uniqueCount=0;
	    	int[] ascii=new int[128];
	    	for (right  = 0; right < str.length(); right++) {				
	    		if (ascii[str.charAt(right)]++==0){
	    			uniqueCount++;	    			
	    		}
	    		if(uniqueCount>k){			
	    			while(--ascii[str.charAt(left)]>0){
	    				left++;
	    			}
	    			left++;
	    			uniqueCount--;
	    		}
	    		max = Math.max(max,right-left+1);
	    	}	//System.out.println(max);
	    	return max;			
		}
} 