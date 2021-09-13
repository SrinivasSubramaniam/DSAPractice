package prefixSuffix;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ContiSubarraySumMultiK523 {
	@Test
	public void test1() {
		int[] nums={23,2,4,6,7};
		int k=6;
		System.out.println(checkSubarraySum(nums,k));

	}
	@Test
	public void test2() {
		int[] nums={2,4};
		int k=6;
		System.out.println(checkSubarraySum(nums,k));

	}
	@Test
	public void test3() {
		int[] nums={1,0};
		int k=2;
		System.out.println(checkSubarraySum(nums,k));

	}
	
	public boolean checkSubarraySum(int[] nums, int k) {
    	int sum=0;
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	for (int i=0;i<nums.length;i++){
		sum+=nums[i];
		sum%=k;
		if (sum==0 & i>0) return true;
		if (map.containsKey(sum) && i-map.get(sum)>1)
			return true;
		if (!map.containsKey(sum)) map.put(sum, i);
	}
	
	return false;
    
}

}
