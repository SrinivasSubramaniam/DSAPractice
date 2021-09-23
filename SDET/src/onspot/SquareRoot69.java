package onspot;

import org.junit.Test;
import org.junit.Assert;

public class SquareRoot69 {
	
	@Test
	public void test1(){
		int x=8;
		Assert.assertEquals(2, mySqrtBinary(x));
	}
	
	 public int mySqrt(int x) {
         long r = x;
        while (r*r > x){
        	System.out.println("before r is " + r);
             r = (r + x/r) / 2;
             System.out.println("after r is " + r);
        }
        return (int) r;
        
    }
	 /*Pseudo code
	  * Binary Search
	  * create left =1 and right as given input
	  * do a while for left less than right
	  * calculate mid
	  * if mid meets value/mid return mid
	  * els if mid less than value/mid shift left to mid +1
	  * else shift right to mid
	  * 
	  * Time complexity - O(n log n)
	  * Space Complexiyt - O(1)
	  * 
	  * Time
	  * Pseudo code - 5 Mins
	  * COde- 5 mins 
	  * Debug- 2 Mins
	  * 
	  * 
	  * 
	  * 
	  */	 
	 
	 public int mySqrtBinary(int x) {
		 int left = 1, right = x;
		 while (left < right) {
			 int mid = left + right/ 2;
			 if (mid == x / mid) {
				 return mid;
			 } else if (mid < x / mid) {
				 left = mid + 1;
			 } else {
				 right = mid;
			 }
		 }
		 return left-1;
	 }

}
