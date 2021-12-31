package dataStructures.dequeue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

import org.junit.Test;


public class NearlyKSortedArray {
	
	@Test
	public void test1(){
		int[] arr={6, 5, 3, 2, 8, 10, 9};
		int k=3;
		int n=arr.length;
		kSort(arr,k,n);
	}

	private void kSort(int[] arr, int k,int n) {
		// min heap
        PriorityQueue<Integer> priorityQueue
            = new PriorityQueue<>();
 
        // add first k + 1 items to the min heap
        for (int i = 0; i < k + 1; i++) {
            priorityQueue.add(arr[i]);
        }
 
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = priorityQueue.poll();
           // priorityQueue.poll();
            priorityQueue.add(arr[i]);
        }
 
        Iterator<Integer> itr = priorityQueue.iterator();
 
        while (itr.hasNext()) {
            arr[index++] = priorityQueue.poll();
            //priorityQueue.poll();
        }
        System.out.println(Arrays.toString(arr));
		
	}

}
