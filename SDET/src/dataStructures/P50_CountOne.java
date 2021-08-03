package dataStructures;

import org.junit.*;


public class P50_CountOne {
	/*
	 * 
	 * 
	 * 
	 * 1)What is the input(s)? -   
	 * What is the expected output? 
	 *  Do I have constraints to solve the problem? -
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- 
	 * Negative data-
	 * Edge Case- 
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, 
	 * Is there any alternate solution?- 
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
	 *
	 *
	 *
	 * /
	 */
	@Test
    public void test1(){
        int[] nums={0,0,0,1,1,1};
        System.out.println(findCountOneBinarySearch(nums));
       Assert.assertEquals(findCountOneBinarySearch(nums),3);
        
    }
	@Test
    public void test2(){
        int[] nums={0,1,1,1,1,1};
        System.out.println(findCountOneBinarySearch(nums));
       Assert.assertEquals(findCountOneBinarySearch(nums),5);
        
    }
	@Test
    public void test3(){
        int[] nums={1,1,1,1,1,1};
        System.out.println(findCountOneBinarySearch(nums));
       Assert.assertEquals(findCountOneBinarySearch(nums),6);
        
    }
	@Test
    public void test4(){
        int[] nums={0,0,0,0};
        System.out.println(findCountOneBinarySearch(nums));
       Assert.assertEquals(findCountOneBinarySearch(nums),0);
        
    }
	@Test
    public void test5(){
        int[] nums={0,0,0,0,1,1};
        System.out.println(findCountOneBinarySearch(nums));
       Assert.assertEquals(findCountOneBinarySearch(nums),2);
        
    }
	/*
	 * Psuedo code
	 * Declare three variables left,right and mid
	 * Do while loop to check until until left is less than right
	 * calculate mid from left and right
	 * check if the mid is less than mid then shift left next to mid
	 * else move right to mid
	 * finally subtract array length and left and return as output
	 * 
	 * Time Complexity O(log n)
	 * Space complexity O(1)
	 * 
	 */
	private int findCountOneBinarySearch(int[] nums){
		int left=0,right=nums.length,mid;
		while (left<right){
			mid=(left+right)/2;
			if (nums[mid]<1) left=mid+1;
			else right=mid;
		}
		return nums.length-left;
	}
	
	
	private int findCountOneTwoPointer(int[] nums){
		int left=0,right=nums.length-1;
		while (left<right){
			if (nums[left]==1) return nums.length-left;
			if (nums[right]==0) return nums.length-1-right;
			left++;
			right--;
		}
		if (nums[left]==1) return nums.length-left;
		return 0;
	}
}
