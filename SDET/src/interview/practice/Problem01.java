package interview.practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;

public class Problem01 {
	
	/*
		 * Integer array []
		 * 1) Input- [5,3,6,7,1,9,3,2] k=3 ,
		 * Output -  [3,5,6,1,7,9,2,3]
		 * Constraints- 
		 *
		 * 2) Test Data
		 *
		 * Positive data -
		 * Negative data
		 * Edge Case
		 * 
		 * 3) Methods to Solve-
		 * 
		 * 4) O Notations-
		 * 
		 * 5) Psuedo code
		 */

	/*
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * 
	 * 1. Iterate the array 
	 * 2. till k put it in a list and then sort it after it crosse k, 
	 * 3. Sort the list and the add it back to the array index
	 * 4. Repeat this untill it reaches the end of the array
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	//@Test
	public void test1() {
		int[] nums={5,3,6,7,1,9,3,2};
		int k=3;
		Assert.assertEquals(Arrays.equals(sortArray(nums,k), new int[] {3,5,6,1,7,9,2,3}),true);

	}

	private int[] sortArray(int[] nums, int k) {
		int temp=0;
		while (temp<nums.length){
			if (temp+k>nums.length) break;
			Arrays.sort(nums,temp,temp+k);
			temp+=k;
		}
		if (temp!=nums.length) Arrays.sort(nums,temp,nums.length);
		System.out.println(Arrays.toString(nums));
		return nums;
	}

	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(5);
		queue.add(10);
		queue.add(20);
		queue.add(15);
		System.out.println("queue is "+queue);
		System.out.println("queue  poll value is "+queue.poll());
		
		Queue<Integer> nqueue=new ArrayDeque<>();
		nqueue.add(10);
		nqueue.add(20);
		nqueue.add(15);
		System.out.println("nqueue is "+nqueue);
		System.out.println("nqueue  poll value is "+nqueue.poll());
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		 
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
 
        System.out.println(pq);
	}
	
	


	
}
