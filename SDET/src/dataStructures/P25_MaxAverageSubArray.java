package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P25_MaxAverageSubArray {
	
	    @Test
	    public void test1() {
	        int[] nums = {1,12,-5,-6,50,3};
	        int k = 4;
	        maxAverageSubArray(nums, k);
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
}
