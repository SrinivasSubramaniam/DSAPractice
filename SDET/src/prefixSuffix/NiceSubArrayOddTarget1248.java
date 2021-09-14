package prefixSuffix;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.Assert;

public class NiceSubArrayOddTarget1248 {
	@Test
	public void test1(){
		int[] nums={1,1,2,1,1};
		int k=3;
		Assert.assertEquals(2, findNice(nums,k));
	}
	@Test
	public void test3(){
		int[] nums={1,1,2,1,1};
		int k=2;
		Assert.assertEquals(5, findNice(nums,k));
	}
	@Test
	public void test2(){
		int[] nums={2,2,2,1,2,2,1,2,2,2};
		int k=2;
		Assert.assertEquals(16, findNice(nums,k));
	}
	/*
	 * Psuedo Code
	 * 
	 * Convert even to 0 and add it to the sum 
	 * if the sum already exists do +1
	 * if map contains sum-target then get the occurene value and add to the result
	 * put sum value and its occurence
	 * return result
	 * 
	 * 
	 * Time complexity - O(n)
	 * Space Complexity - O(n)
	 * 
	 * Time to solve
	 * 
	 * Pseudo code - 10 mins
	 * Coding - 10 mins
	 * Debug- 5 mins
	 * 
	 * 
	 * 
	 */
	
	private int findNice(int[] nums, int k) {
		int cur = 0, ans =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] %2==1) cur+=1;
        	if (map.containsKey(cur-k)){
        		ans += map.get(cur - k);
        	}
        	map.put(cur, map.getOrDefault(cur, 0) + 1);
            
        }
        return ans;
	}

}
