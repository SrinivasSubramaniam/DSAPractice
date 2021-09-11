package prefixSuffix;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class SubArraySumDivK974 {
	
	@Test
	public void test1(){
		int[] nums={4,5,0,-2,-3,1};
		int k=5;
		Assert.assertEquals(7, findSubArray(nums,k));
	}
	@Test
	public void test2(){
		int[] nums={-3,-2,-5};
		int k=5;
		Assert.assertEquals(3, findSubArray(nums,k));
	}
	/*
	 * Pseudo code
	 * 
	 * Create a counter and sum variable
	 * Create a map
	 * default put map with 0 as key and 1 as value 
	 * iterate the array
	 *  add sum to current value
	 *  if the sum%k is less than 0 then assign r as sum mod K +K 
	 *  check if the reminder is already present in map
	 *  if yes get the count of rem and add to outPut
	 *  
	 *  put the reminder value to the map
	 * 
	 * 
	 */
	private int findSubArray(int[] nums, int k) {
		int count=0,sum=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(0, 1);
		for (int i=0;i<nums.length;i++){
			sum+=nums[i];
			int r=sum%k;
			if (r<0) r=(sum%k)+k;
			if (map.containsKey(r)){
				count+=map.get(r);
			}
			map.put(r, map.getOrDefault(r, 0)+1);
		}
		return count;
	}
	

}
