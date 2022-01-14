package dataStructures.dequeue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class RotateArray {
	@Test
	public void test1(){
		int[] nums={1,2,3,4,5,6,7}; // 7,6,5,4,3,2,1  // 6 = 6-3
		int k=3;
		rotateArray(nums, k);
	}
	
	
	public void rotate(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	    System.out.println(Arrays.toString(nums));
	}

	public void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}
	
	public int[] rotateArray(int[] nums, int k) {
        k = k % nums.length; 
        if(nums.length == 1 || k==0){
            return nums;
        }
        Queue <Integer> queue = new ArrayDeque<Integer>();
        for(int i = nums.length - k; i < nums.length; i++){
            queue.offer(nums[i]);
        }
        for(int i = nums.length - 1; i >= k; i--){
            nums[i] = nums[i - k];
        }
        for(int i = 0; i < k; i++){
            nums[i] = queue.poll() ;
        }
        return nums;
    }

}
