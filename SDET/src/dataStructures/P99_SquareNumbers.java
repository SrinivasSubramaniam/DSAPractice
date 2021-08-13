package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P99_SquareNumbers {

	/*
	 * 
	 *1) Input-
	 *	 Output -
	 *	 Constraints-
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * 	Negative data- 
	 * 	Edge Case-
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * 1. Simplest possible case- 0
	 * 2. Test data - 5 ,4 
	 * 3. Edge case- 
	 * 4. Pattern- (n-1)
	 * 
	 * 
	 * 
	 */
	
	@Test
    public void test1(){
        int[] nums={4,5,6};
        //System.out.println(squareOutput(nums));
        Assert.assertTrue(Arrays.equals(squareOutputOptimised(nums), new int[]{16,25,36}));
    }
	@Test
    public void test2(){
        int[] nums={-2,0,4};
        //System.out.println(squareOutput(nums));
        Assert.assertTrue(Arrays.equals(squareOutputOptimised(nums), new int[]{0,4,16}));
    }
	@Test
    public void test3(){
        int[] nums={-5,0,4};
        //System.out.println(squareOutput(nums));
        Assert.assertTrue(Arrays.equals(squareOutputOptimised(nums), new int[]{0,16,25}));
    }

	private int[] squareOutput(int[] nums) {
		int left=0,right=nums.length-1;
		int[] output=new int[nums.length]; 
		for (int i = nums.length-1 ; i >=0; i--) {
			if (Math.abs(nums[left])>Math.abs(nums[right])){
				output[i]=nums[left]*nums[left++];
		}
			else {
				output[i]=nums[right]*nums[right--];
			}
	}
		System.out.println(Arrays.toString(output));
		return output;

	}
	private int[] squareOutputOptimised(int[] nums){
		int left=0,right=nums.length-1;
		while(left<right){
			if (Math.abs(nums[left])>Math.abs(nums[right])){
				int temp=nums[left];
				nums[left]=nums[right];
				nums[right--]=temp;
			}
			else right--;
		}
		left=0;
		right=nums.length-1;
		while (left<=right){			
			nums[left]=nums[left]*nums[left++];
			if (left<right)nums[right]=nums[right]*nums[right--];
			
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
	
	
	
}
