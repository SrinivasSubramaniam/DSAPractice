package onspot;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P5_SubArraySumMultipleByk {
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
		int[] nums={23,2,4,6,7};
		int k=6;
		System.out.println(subArraySumMultiple(nums,k));

	}
	@Test
	public void test2() {
		int[] nums={23,2,6,4,7};
		int k=6;
		System.out.println(subArraySumMultiple(nums,k));

	}

	private boolean subArraySumMultiple(int[] nums, int k) {
		int sum=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i=0;i<nums.length;i++){
			sum+=nums[i];
			sum%=k;
			if (sum==0 & i>0) return true;
			if (map.containsKey(sum) /*&& i-map.get(sum)>1*/)
				return true;
			if (!map.containsKey(sum)) map.put(sum, i);
			
		}
		
		return true;
		
	}


}
