package dataStructures.Stack;

import java.util.Arrays;
import java.util.Stack;

import org.junit.*;


public class P72_Temperature {
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
        int[] nums ={73,74,75,71,69,72,76,73};
        int[] output={1,1,4,2,1,1,0,0};
        Assert.assertEquals(true,Arrays.equals(output,findXUsingTwoPointer(nums)));
        
    }
	
	/*Psuedo code
	 * 
	 * 
	 */
	private int[] findXUsingStack(int[] nums){
		Stack<Integer> stack=new Stack<Integer>();
        int[] outPut=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            while (!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                int j=stack.pop();
                outPut[j]= i-j;
                
            }
             stack.push(i);   
                
        }
        return outPut;
	}
	private int[] findX(int[] nums){
		int[] output=new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int counter=0;
			for (int j = i+1; j < nums.length; j++) {
				counter++;
				if (nums[j]>nums[i]) { 
					output[i]=counter;
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(output));
		return output;
	}
	private int[] findXUsingTwoPointer(int[] nums){
		int[] output=new int[nums.length];
		int i=0,j=1;
		while (i<nums.length-1||j<nums.length){
			if (nums[j]>nums[i]){
				output[i]=j-i;
				i++;
				j=i+1;
			} else j++;
	}
		System.out.println(Arrays.toString(output));
		return output;
	}
	
}
