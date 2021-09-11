package onspot;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class LargestSubArraySum {
	/*@Test
	public void test1(){
		int[] arr={10, 5, 2, 7, 1, 9};
		int k=15;
		Assert.assertEquals(4,findLargest(arr,k));
	}*/
	
	@Test
	public void test1(){
		int[] arr={1,11,-6,3,-2,14,0,5,-16,-11,-16,-2,14,-8,5,-12};
		int k=20;
		Assert.assertEquals(4,findLargest(arr,k));
	}
	
	

	private int findLargest(int[] A , int S) {
		HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
 
        // insert `(0, -1)` pair into the set to handle the case when a
        // subarray with sum `S` starts from index 0
        map.put(0, -1);
 
        int target = 0;
 
        // `len` stores the maximum length of subarray with sum `S`
        int len = 0;
 
        // stores ending index of the maximum length subarray having sum `S`
        int ending_index = -1;
 
        // traverse the given array
        for (int i = 0; i < A.length; i++)
        {
            // sum of elements so far
            target += A[i];
 
            // if the sum is seen for the first time, insert the sum with its
            // into the map
            map.putIfAbsent(target, i);
 
            // update length and ending index of the maximum length subarray
            // having sum `S`
            if (map.containsKey(target - S) && len < i - map.get(target - S))
            {
                len = i - map.get(target - S);
                ending_index = i;
            }
        }
        
        System.out.println(Arrays.toString(Arrays.copyOfRange(A, ending_index - len+1 , ending_index+1)));
 
        // print the subarray
       // System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
        
        
         
        return maxLen;            
	}
}
