package onspot;
import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.*;
public class DuplicateZeroes1089 {
	/*
	 * Given a fixed-length integer array arr, duplicate each occurrence of
	 * zero, shifting the remaining elements to the right.
	 * 
	 * Note that elements beyond the length of the original array are not
	 * written. Do the above modifications to the input array in place and do
	 * not return anything.
	 * 
	 * 
	 * 
	 * 
	 */
	@Test 
	public void test1(){
		int[] arr={1,0,2,3,0,4,5,0};
		int[] outPut={1,0,0,2,3,0,0,4};
		Assert.assertArrayEquals(outPut, duplicateZeros(arr));
	}
	
	/*
	 * Pseudo code
	 * Count zeroes
	 * create a variable to hold the length with duplicate zeroes
	 * do a while loop till left meets righ
	 * if left value is not zero and right is less than array length swap left to right
	 * decrement left
	 * else 
	 * 		- right is less than array length swap left to right
	 * 		- decrement right
	 * 		-right is less than array length swap left to right
	 * 		- decrement right
	 * 		- decrement left
	 * 
	 * 
	 * Time Complexity- O(n)
	 * Space Complexity - O(1)
	 * 
	 * Time taken-
	 * Pseudo code- 10 Mins
	 * Code- 15 mins
	 * 
	 * 
	 * 
	 */
	
	public int[] duplicateZeros(int[] arr) {
		int countZeros=0;
		for (int i=0;i<arr.length;i++){
			if (arr[i]==0) countZeros++;
		}
		int left=arr.length-1,right=arr.length+countZeros-1;
		while (left!=right){
			if (arr[left]!=0){
				if (right<arr.length) arr[right]=arr[left];
				right--;
				left--;
			}else{
				if (right<arr.length) arr[right]=arr[left];
				right--;
				if (right<arr.length) arr[right]=arr[left];
				right--;
				left--;

			}
		}
		return arr;

	}
}
