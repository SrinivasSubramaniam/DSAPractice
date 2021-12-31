package onspot;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

public class KthLargestElement215 {
	
	@Test
	public void test1(){
		int[] nums={3,2,1,5,4};
		int k=2;
		findKthLargest(nums, k);
	}
	@Test
	public void test2(){
		int[] nums={3,2,3,1,2,4,5,5,6};
		int k=4;
		findKthLargest(nums, k);
		
	}
	
	public int findKthLargest(int[] nums, int k) {

	    Queue<Integer> pq = new PriorityQueue<>();
	    for(int val : nums) {
	        pq.offer(val);

	        if(pq.size() > k) {
	            pq.poll();
	        }
	    }
	    return pq.peek();
	}

}
