package onspot;

import java.util.Arrays;

import org.junit.*;

public class CountLargestGroup1399 {
	@Test
	public void test1(){
		int n=13;
		Assert.assertEquals(4,findlargestCount(n));
	}
	@Test
	public void test2(){
		int n=24;
		Assert.assertEquals(5,findlargestCount(n));
	}
	@Test
	public void test3(){
		int n=15;
		Assert.assertEquals(6,findlargestCount(n));
	}
	
	/*
	 * Psuedo code
	 * Create an integer array of length n+1
	 * create a max variable to hold the max value
	 * iterate the loop from 1 till n 
	 * assign i to temp variable
	 * till less than 10 add the occurrence to array
	 * after that create a tempSum 
	 * do a while loop till length is not equal to 0
	 * take a mod of tempSum and add it to temp
	 * make temp as temp div 10
	 * increment the temp Sum value in array also calculate and assign max
	 * Do a another loop for the array and count the occurences of max
	 * 
	 * Time complexity- O(n)
	 * Space Complexity - O(n)
	 * 
	 * Time taken
	 * Psuedo code- 10 mins
	 * Code - 10 mins
	 * Debug- 10 mins
	 * 
	 * 
	 */

	private int findlargestCount(int n) {
		int[] arr = new int[n + 1];
		int max = 0;
		for (int i = 1; i <= n; i++) {
			int temp = i;
			if (i < 10) {
				arr[i]++;
				max = Math.max(max, arr[i]);
			} else {
				int tempSum = 0;
				while (temp != 0) {
					tempSum += temp % 10;
					temp = temp / 10;
				}
				arr[tempSum]++;
				max = Math.max(max, arr[tempSum]);
			}

		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max)
				count++;
		}
		return count;
	}

}
