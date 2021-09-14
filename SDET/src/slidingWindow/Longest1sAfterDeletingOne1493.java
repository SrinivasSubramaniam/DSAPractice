package slidingWindow;

import org.junit.Assert;
import org.junit.Test;


public class Longest1sAfterDeletingOne1493 {
	@Test
	public void test1(){
		int[] nums={0,1,1,1,0,1,1,0,1};
		Assert.assertEquals(5, longestSubarray(nums));
	}
	@Test
	public void test2(){
		int[] nums={1,1,0,1};
		Assert.assertEquals(3, longestSubarray(nums));
	}
	

    /*
    Psuedo code
    1. Intialize count=0;
    2. Keep left and right pointers,
    3. Iterate till right less than length
    4. iterate the right and  if value is 0 then count++; 
    5. Calculate the max by doing right-left+1
    6. if count is 2 then move the left till the count is 1
    
    Time Complexity- 0(n*m)
    Space Complexity- O(1)
    
    Time 
    Pseudo code- 5 mins
    Code- 10 mins
    Debug and run - 5 mins
    
    
    Mistakes
    1.Movement is right pointer was wrong
    2. Lot of time to debug
    
    */
	public int longestSubarray(int[] nums) {
		int left = 0, right = 0, count = 0;
		int max = 0;
		while (right < nums.length) {
			if (nums[right] == 0)	count++;
			while (count == 2) {
				if (nums[left++] == 0)	count--;
			}
			right++;
			max = Math.max(max, right - left);
		}
		return max - 1;

	}

}
