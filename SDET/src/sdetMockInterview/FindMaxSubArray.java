package sdetMockInterview;

import java.util.Arrays;

import org.junit.Test;

public class FindMaxSubArray {
	
	@Test
	public void test1(){
		int[] nums={1,7,4,2,8,11,3};
		int target=16;
		System.out.println(Arrays.toString(findMaxSubArraySlidingWindow(nums,target)));
		
	}
	@Test
	public void test2(){
		int[] nums={1,7,4,2,7,11,3};
		int target=21;
		System.out.println(Arrays.toString(findMaxSubArraySlidingWindow(nums,target)));
		
	}
	@Test
	public void test3(){
		int[] nums={8,7,6,5,4,3,2,1};
		int target=15;
		System.out.println(Arrays.toString(findMaxSubArraySlidingWindow(nums,target)));
		
	}
	@Test
	public void test4(){
		int[] nums={25,8,7,6,5,4,-1,1,0,12};
		int target=15;
		System.out.println(Arrays.toString(findMaxSubArraySlidingWindow(nums,target)));
		
	}
	@Test
	public void test5(){
		int[] nums={1,7,4,2,12,-13,1};
		int target=15;
		System.out.println(Arrays.toString(findMaxSubArraySlidingWindow(nums,target)));
		
	}

	public int[] findMaxSubArray(int[] nums, int target){

		int left=0, right=0;
		int max=Integer.MIN_VALUE;
		for (int i=0;i<nums.length;i++){
			int currentSum=nums[i];
			for (int j=i+1;j<nums.length;j++){
				currentSum+=nums[j];
				if (currentSum<=target && max<=(j-i)){
					max=Math.max(max,(j-i));
					left=i;
					right=j+1;
				}
			}
		}

		return Arrays.copyOfRange(nums,left,right); 		      
	}
	private int[] findMaxSubArraySlidingWindow(int[] input, int k) {
		int max = 0, startIndex = 0, endIndex = 0;
		int currentSum = 0;
		for(int i = 0; i < input.length;i++) {
			currentSum += input[i];
			if(currentSum < k && max < (i+1)) {
				max = i+1;
				startIndex = 0;
				endIndex = i;
			}	
		}
		currentSum -= input[0]; 
		for(int i=1, j = input.length-1; i <input.length; i++) {
			currentSum -= input[i];
			if(currentSum < k && max < (i-j)+1) {
				startIndex = i;
				endIndex = j;
			}	
		}
		return Arrays.copyOfRange(input, startIndex, endIndex+1);
		
	}
	
	/*public int[] findMaxSubArraySlidingWindow(int[] nums,int target){
		
		int left=0,right=0;
		int currentSum=nums[0];
		int maxSum=currentSum;
		int max=1;
		int startIndex = 0;
		for (int i=0;i<nums.length;i++){
			if (currentSum<0) {
				currentSum=nums[i];
				left=i;
			}
			else currentSum+=nums[i];
			if (currentSum>maxSum && currentSum < target && (i-left)>max ){
				maxSum=currentSum;
				max=Math.max(max, (i-left));
			}
		}
		return Arrays.copyOfRange(nums,left,left+max); 
		
		
	}*/

}
