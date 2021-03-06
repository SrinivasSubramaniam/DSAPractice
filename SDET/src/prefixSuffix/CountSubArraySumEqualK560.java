package prefixSuffix;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CountSubArraySumEqualK560 {
	
	@Test
	public void test1(){
		int[] nums={1,1,1};
		int k=2;
		Assert.assertEquals(2,subarraySum(nums, k));
	}
	@Test
	public void test2(){
		int[] nums={1,2,3};
		int k=3;
		Assert.assertEquals(2,subarraySum(nums, k));
	}
	
	@Test
	public void test3(){
		int[] nums={-1,-2,-3};
		int k=-3;
		Assert.assertEquals(2,subarraySum(nums, k));
	}

	/*
	 * Prefix Sum Put each each prefix sum in a map and it's count 
	 * if map contains sum-target get the occurence and increment to count
	 * 
	 * Time complexity- O (n)
	 * Space complexity - O(n)
	 * 
	 * Time 
	 * Pseudo code- 5 mins
	 * code- 10 mins
	 * Debug- 5 Mins
	 * 
	 */
	 public int subarraySum(int[] nums, int k) {
		 String s="";
		 String[] split = s.split(" ");
		 List<String> asList = Arrays.asList(split);
		 Collections.sort(asList);
	        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        map.put(0,1);
	        int count=0,sum=0;
	        for (int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            //count+=map.getOrDefault(sum-k, 0);
	            if (map.containsKey(sum-k)) 
	                count+=map.get(sum-k);
	            map.put(sum,map.getOrDefault(sum,0)+1);
	        }
	        return count;
	        
	    }

}
