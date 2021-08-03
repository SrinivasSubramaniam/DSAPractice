package dataStructures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

import org.junit.*;


public class P93_QueueOddEvenAlternate {
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
        int[] nums ={1,3,5,7,2,4,6,8};
        Assert.assertEquals(Arrays.equals(findX(nums), new int[] {1,2,3,4,5,6,7,8}),true);
        
    }
	@Test
    public void test2(){
        int[] nums ={1,3,2,4};
        Assert.assertEquals(Arrays.equals(findX(nums), new int[] {1,2,3,4}),true);
        
    }
	
	
	/*Psuedo code
	 * 
	 * 
	 */
	private int[] findX(int[] nums){
		ArrayDeque<Integer> dequeue=new ArrayDeque<Integer>();
		int i=0,j=(nums.length/2);
		for (int  k= 0; k < nums.length/2; k++) {
			dequeue.offer(nums[i++]);
			dequeue.offer(nums[j++]);
		}
		
		System.out.println(dequeue.toString());
		i=0;
		/*for (Integer integer : dequeue) {
			nums[i++]=integer;
		}*/
		while (!dequeue.isEmpty()){
			nums[i++]=dequeue.poll();
		}
		return nums;
	}
}
