package prefixSuffix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class LargestSubArraySumLessThank {
	
	/*@Test
	public void test1(){
		int[] arr={4,-5,5,5,2,1};
		int k=8;
		System.out.println(findLargest(arr, k));
	}*/
	@Test
	public void test2(){
		int[] arr={2,2,-1};
		int k=3;
		System.out.println(findLargest(arr, k));
	}
	@Test
	public void test3(){
		int[] arr={6,1,0,1,1,-1};
		int k=3;
		System.out.println(findLargest(arr, k));
	}
	

	private int findLargest(int[] a , int k) {

	    int max = Integer.MIN_VALUE;
	    int sumj = 0;
	    TreeSet<Integer> ts = new TreeSet();
	    ts.add(0);

	    for(int i=0;i<a.length;i++){
	        sumj += a[i];
	        Integer gap = ts.ceiling(sumj - k);
	        System.out.println("gap is "+ gap);
	        if(gap != null){
	        	max = Math.max(max, sumj - gap);
	        }
	        ts.add(sumj);
	    }
	    System.out.println(max);
	    return max;         
                    
	}
}
