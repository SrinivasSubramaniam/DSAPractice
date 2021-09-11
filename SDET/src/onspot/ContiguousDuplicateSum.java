package onspot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class ContiguousDuplicateSum {
	
	
	@Test
	public void test1(){
		int[] nums={1,2,3,1};
		int k=2;
		Assert.assertEquals(findContiguousSumMap(nums,k),true);
	}
	@Test
	public void test2(){
		int[] nums={1,2,3,2};
		int k=3;
		Assert.assertEquals(false, findContiguousSumMap(nums,k));
	}
	@Test
	public void test3(){
		int[] nums={2,5,6,7,5,2};
		int k=4;
		Assert.assertEquals(false, findContiguousSumMap(nums,k));
	}
	/*
	 * Psuedo code
	 */

	private boolean findContiguousSum(int[] nums,int k) {
		Set<Integer> set=new HashSet<Integer>();
		for (int i=0;i<k;i++){
			if(!set.add(nums[i])) return false;
		}
		for (int i=1;i<=nums.length-k;i++){
			set.remove(nums[i-1]);
			if (!set.add(nums[i+k-1])) return false;
			
		}
		return true;
	}
	
	private boolean findContiguousSumMap(int[] nums,int k){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();		
		for (int j=0;j<nums.length;j++){
			if (map.containsKey(nums[j]) && j-map.get(nums[j])+1<=k) return false;
			else map.put(nums[j], j);
		}
		return true;
	}

}
