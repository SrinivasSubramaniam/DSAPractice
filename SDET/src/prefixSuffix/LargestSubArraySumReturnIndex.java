package prefixSuffix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class LargestSubArraySumReturnIndex {
	
	@Test
	public void test1(){
		int[] arr={1,11,-6,3,-2,14,0,5,-16,-11,-16,-2,14,-8,5,-12};
		int k=20;
		Assert.assertEquals(4,findLargest(arr,k));
	}
	
	

	private int findLargest(int[] nums , int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        map.put(0, -1);
 
        int sum = 0;
        int len = 0;
        int ending_index = -1;
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            map.putIfAbsent(sum, i);
            if (map.containsKey(sum - target) && len < i - map.get(sum - target))
            {
                len = i - map.get(sum - target);
                ending_index = i;
            }
        }
        
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, ending_index - len+1 , ending_index+1)));
        
        
         
        return maxLen;            
	}
}
