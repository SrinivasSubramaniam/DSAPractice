package dataStructures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.junit.*;

public class P99_SlidingWindowMaximumInArray {

	/*
	 * 
	 * 1) Input- Output - Constraints-
	 *
	 * 2) Test Data
	 *
	 * Positive data- Negative data- Edge Case-
	 * 
	 * 3)Methods to Solve-
	 * 
	 * 4)O Notations-
	 * 
	 * 5)Psuedo code
	 */

	/*
	 * 1. Simplest possible case- 0 2. Test data - 5 ,4 3. Edge case- 4.
	 * Pattern- (n-1)
	 * 
	 * 
	 * 
	 */

	@Test
	public void tes1() {
		int[] nums={1,3,-1,-3,5,3,6,7};
		int k=3;
	
		findMinSumDeque(nums,k);
	}

	private int[] findMinSum(int[] nums,int k){
		   
        int max=Integer.MIN_VALUE;
        int[] outPut=new int[nums.length-(k-1)];
        int l=0;
        for (int i=0; i<= nums.length-k;i++){
            for (int j=i;j<i+k;j++){
                max=Math.max(nums[j],max);
            }
            outPut[l++]=max;
            max=Integer.MIN_VALUE;
        }
        return outPut;
	}
	private int[] findMinSumOptimised(int[] nums,int k){
		Map<Integer, Integer> map =new HashMap<Integer, Integer>();
		//int[] outPut=new int[nums.length-(k-1)];
		int l=0;
		int max=Integer.MIN_VALUE;
		for (int i=0;i<k;i++){
			map.put(i,nums[i]);
			max=Math.max(nums[i], max);
		}
		nums[l++]=max;
		for (int i = 1; i <= nums.length-k; i++) {
			map.remove(i-1);
			map.put(i+(k-1), nums[i+(k-1)]);
			max=Collections.max(map.values());
			nums[l++]=max;
		}
		
		//System.out.println(Arrays.toString(outPut));
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, l)));
		  return Arrays.copyOfRange(nums, 0, l); 
        
	}
	private int[] findMinSumDeque(int[] nums,int k){
		if (nums == null || k <= 0) {
			return new int[0];
		}
		int n = nums.length;
		int[] r = new int[n-k+1];
		int index = 0;
		// store index
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 0; i < nums.length; i++) {
			// remove numbers out of range k
			while (!deque.isEmpty() && deque.peek() < i - k + 1) {
				deque.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
				deque.pollLast();
			}
			// q contains index... r contains content
			deque.offer(i);
			if (i >= k - 1) {
				r[index++] = nums[deque.peek()];
			}
		}
		return r;
        
	}
	
	
}
