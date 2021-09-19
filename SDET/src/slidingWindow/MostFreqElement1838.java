package slidingWindow;

import java.util.Arrays;

import org.junit.*;

public class MostFreqElement1838 {
	@Test
	public void test1(){
		int[] nums={1,2,4};
		int k=5;
		Assert.assertEquals(3,maxFrequency(nums, k));
	}
	@Test
	public void test2(){
		int[] nums={1,1,1,2,2,4};
		int k=2;
		Assert.assertEquals(4,maxFrequency(nums, k));
	}
	
	/*
	 * Psuedo code
	 * 
	 * Create a left,right and outputvariable
	 * create a long variable to hold the sum
	 * Sort the array
	 * iterate the array
	 * Add totalsum to value at index right
	 * Check if the value at right index multiply by window lenght is less than or equal to total sum + k values
	 * calculate the max values with windowlength
	 * else do a while loop
	 * decrease the value at left from total
	 * increment the left, this loop while continue until right value * window length is equal to totalsum + k
	 * 
	 *  
	 * Time complexity- O(n log n)
	 * 	Space complexity - O(1)
	 * 
	 * Time - Referred for logic
	 * Psuedo code- 10 mins
	 * Code - 10 mins
	 * Debug- 10 mins
	 * 
	 * 
	 */
	
	public int maxFrequency(int[] nums, int k) {
        int left=0,right=0,outPut=0;
        long totalSum=0;
        Arrays.sort(nums);
        while (right<nums.length){
            totalSum+=nums[right];
            while ((long)nums[right]*(right-left+1)>totalSum+k){
                totalSum-=nums[left];
                left++;
            }
            outPut=Math.max(outPut,right-left+1);
            right++;
        }
        return outPut;
        
    }

}
