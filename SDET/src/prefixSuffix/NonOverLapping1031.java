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
