package prefixSuffix;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class SubArraySumEqualK560 {
	
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
	
	 public int subarraySum(int[] nums, int k) {
	        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        map.put(0,1);
	        int count=0,sum=0;
	        for (int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            if (map.containsKey(sum-k)) 
	                count+=map.get(sum-k);
	            map.put(sum,map.getOrDefault(sum,0)+1);
	        }
	        return count;
	        
	    }

}
