package slidingWindow;

import java.util.Arrays;

import org.junit.Test;

public class MaxiMumSubArrayTargetK {
	@Test
	public void test1(){
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		int target=7;
		findMax(nums,target);
	}
	@Test
	public void test2(){
		int[] nums={-2,4,-1,2,1,2};
		int target=7;
		findMax(nums,target);
	}

	private void findMax(int[] nums, int target) {
		 int sum=nums[0];
	        int max=sum;
	        int left=0,right = 0;
	        for (int i=0;i<nums.length;i++){
	            if (sum<0){
	            	sum=nums[i];
	            	left=i;
	            }
	            else sum+=nums[i];
	            if (sum>max && sum<target){
	                max=sum;
	                right=i;
	            }
	            
	        }
	        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, left, right+1)));
	        System.out.println(left+ " " +right);
	        
		
	}

}
