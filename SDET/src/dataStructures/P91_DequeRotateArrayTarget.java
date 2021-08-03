package dataStructures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

import org.junit.*;


public class P91_DequeRotateArrayTarget {
	/*
	 *
	 * 
	 * 
	 * 1)What is the input(s)? - 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
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
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?-
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
        int[] nums ={1,2,3,4,5,6};
        int k=3;
        Assert.assertEquals(Arrays.equals(findX(nums, k), new int[] {3,2,1,4,5,6}),true);
        //System.out.println(Arrays.toString(findX(nums, k)));
        
    }
	@Test
    public void test2(){
        int[] nums ={1,2,3,4,5,6};
        int k=6;
        Assert.assertEquals(Arrays.equals(findX(nums, k), new int[] {6,5,4,3,2,1}),true);
        //System.out.println(Arrays.toString(findX(nums, k)));
        
    }
	@Test
    public void test3(){
        int[] nums ={1,2,3,4,5,6};
        int k=1;
        Assert.assertEquals(Arrays.equals(findX(nums, k), new int[] {1,2,3,4,5,6}),true);
        //System.out.println(Arrays.toString(findX(nums, k)));
        
    }
	@Test (expected=RuntimeException.class)
    public void test4(){
        int[] nums ={};
        int k=1;
        Assert.assertEquals(Arrays.equals(findX(nums, k), new int[] {1,2,3,4,5,6}),true);
        //System.out.println(Arrays.toString(findX(nums, k)));
        
    }
	
	
	/*Psuedo code
	 * 
	 * 
	 */
	private int[] findX(int[] nums,int target){
		if (nums.length==0) throw new RuntimeException();
		Stack<Integer> stack=new Stack<Integer>();
		ArrayDeque<Integer> arraydequeue=new ArrayDeque<Integer>();
		for (int i = 0; i < target; i++) {
			stack.push(nums[i]);
		}
		for (int i = target; i <nums.length; i++) {
			arraydequeue.offer(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			if (i<target) {
				nums[i]=stack.pop();
			}else{
				nums[i]=arraydequeue.poll();
			}
		}
		
		return nums;
	}
}
