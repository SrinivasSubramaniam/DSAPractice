package dataStructures.slidingWindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P25_MaxAverageSubArray {
	
	    @Test
	    public void test1() {
	        int[] nums = {5,12,50,60,60,60};
	        int k = 3;
	        maxAverageSubArraySimplified(nums, k);
	    }
	   

    private double maxAverageSubArray(int[] nums, int k) {    	
    	double sum=0;
    	for (int i = 0; i < k; i++) {
			sum+=nums[i];
		}    	
    	for (int i = 1; i <= nums.length-k; i++) {
    		double tempSum= sum+ nums[i+k-1]-nums[i-1];
    		sum=Math.max(sum, tempSum);			
		}
    	System.out.println(sum/4);
    	return sum/4;
    }
    private double maxAverageSubArraySimplified(int[] nums, int k) {    	
    	double tempSum=0;
    	double sum=Integer.MIN_VALUE;
    	   	
    	for (int i = 0; i < nums.length; i++) {
    		tempSum+=nums[i];
    		if (i>=k-1){
    		sum=Math.max(tempSum, sum);
    		tempSum-=nums[i-(k-1)];
    		
    		}
		}
    	System.out.println(sum/3);
    	return sum/4;
    }
}
