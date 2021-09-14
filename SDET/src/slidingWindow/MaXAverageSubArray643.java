package slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class MaXAverageSubArray643 {
	@Test
	public void test1(){
		int[] nums={1,12,-5,-6,50,3};
		int k=4;
		Assert.assertEquals(12.75000, findMaxAverage(nums, k),0.0);
	}
	@Test
	public void test2(){
		int[] nums={5};
		int k=1;
		Assert.assertEquals(5.00000, findMaxAverage(nums, k),0.0);
	}
	/*
    Declare and Initialize a max value and sum
    Iterate the loop till k, add it to the sum , find the max
    Slide the window by adding window+1, remove the old value
    Calculate the max  
    return max/4
    
    Time Complexity- O(n)
    Space Complexity- O(1)
    
	Time - 
	
	Psuedo code- 3 mins
	Code and Debug- 5 mins
    
    
    */
	 public double findMaxAverage(int[] nums, int k) {
	        double max=Integer.MIN_VALUE,sum=0;
	        for (int i=0;i<k;i++){
	            sum+=nums[i];
	        }
	        max=Math.max(max,sum);
	        for (int i=1;i<=nums.length-k;i++){
	            sum-=nums[i-1];
	            sum+=nums[i+k-1];
	            max=Math.max(max,sum);
	        }
	        return max/k;
	        
	    }

}
