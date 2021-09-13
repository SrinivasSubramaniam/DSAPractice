package slidingWindow;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;



public class ContainDuplicateII {
	@Test
	public void test1(){
		int[] nums={1,2,3,1};
		int k=3;
		Assert.assertTrue(containsNearbyDuplicate(nums, k));
	}
	/*
    Create a HashSet to store the values
    iterate the array 
    Add the valuse till k to the set if it contains then return true
    iterate for another array
    remove the previous element and add the new element if the set cant
    add return true
    
    finally return false
    */
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set=new HashSet<Integer>();
        int left=0;
        for (int i=0;i<nums.length;i++){
            if (i>k){
            set.remove(nums[left++]);
            }
            if (!set.add(nums[i])) return true;
        }
        return false;
        
    }
}
