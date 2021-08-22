package onspot;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P4_Kclosest {
	/*
	 * 
	 * 1) Input-
	 * Output -  
	 * Constraints- 
	 *
	 * 2) Test Data
	 *
	 * Positive data -
	 * Negative data
	 * Edge Case
	 * 
	 * 3) Methods to Solve-
	 * 
	 * 4) O Notations-
	 * 
	 * 5) Psuedo code
	 */

	/*
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		int[] nums={1,2,3,4,5,6,7,8,9};
		int k=4;
		int x=3;
		kclosest(nums,k,x);

	}
	
	/*
	 * 
	 * Pseudo code
	 * create left variable as 0 and right index length-k which is window
	 * Declare a mid variable
	 * do a while till left meets right
	 * calculate mid variable between left and right
	 * if mid  value is greater than mid+k value, then ignore the left bound values by making left to mid+1
	 * else ignore the right bound values by shifting right to mid
	 * 
	 */

	private void kclosest(int[] nums, int k, int x) {
		 int left=0,right=nums.length-k;
		 int mid;
		 while (left<right){
			 mid=(left+right)/2;
			 if (x-nums[mid]>nums[mid+k]-x){
				 left=mid+1;
			 }
			 else{
				 right=mid;
			 }
		 }
		 List<Integer> list=new ArrayList<Integer>();
		 for(int i=left;i<left+k;i++){
			 list.add(nums[i]);
		 }
		
	}


}
