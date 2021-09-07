package onspot;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class ContiguousDuplicateSum {
	
	
	@Test
	public void test1(){
		int[] nums={1,2,3,1};
		int k=2;
		Assert.assertEquals(false, findContiguousSum(nums,k));
	}
	@Test
	public void test2(){
		int[] nums={1,2,3,2};
		int k=3;
		Assert.assertEquals(true, findContiguousSum(nums,k));
	}
	/*
	 * Psuedo code
	 */

	private boolean findContiguousSum(int[] nums,int k) {
		Set<Integer> set=new HashSet<Integer>();
		for (int i=0;i<k;i++){
			if(!set.add(nums[i])) return false;
			
		}
		return true;
	}

}
