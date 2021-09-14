package prefixSuffix;

import org.junit.Test;

public class NonOverLapping1031 {
	@Test
	public void test1(){
		int[] nums={3,8,1,3,2,1,8,9,0};
		int l=3;
		int m=2;
		System.out.println(maxSumTwoNoOverlap(nums, l, m));
	}
	
	/*Pseudo code
	 * 
	 * 
	 * Calculate the prefix sum and store it in the same array
	 * Create result, left max and right max
	 * Calculate the max sum of l elements before m elements 
	 * Calculate the max sum of m elements before l elements
	 * Calculate the max result between lmax+ current sum - m sum and right max+ cuurent sum - l sum
	 * 
	 * Time Complexity - O(n)
	 * Space Complexity - O(1)
	 * 
	 * Time 
	 * 	Referred Solution
	 * 	Psuedo code - 10 mins
	 * 	Coding - 20 mins
	 * 	Debug and run - 20 mins
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	  public int maxSumTwoNoOverlap(int[] A, int L, int M) {
	        for (int i = 1; i < A.length; ++i)
	            A[i] += A[i - 1];
	        int res = A[L + M - 1], Lmax = A[L - 1], Mmax = A[M - 1];
	        for (int i = L + M; i < A.length; ++i) {
	            Lmax = Math.max(Lmax, A[i - M] - A[i - L - M]);
	            Mmax = Math.max(Mmax, A[i - L] - A[i - L - M]);
	            res = Math.max(res, Math.max(Lmax + A[i] - A[i - M], Mmax + A[i] - A[i - L]));
	        }
	        return res;
	    }

}
