package onspot;

import org.junit.Test;
import org.junit.Assert;

public class SquareRoot {
	
	@Test
	public void test1(){
		int x=8;
		Assert.assertEquals(2, mySqrtBinary(x));
	}
	
	/* public int mySqrt(int x) {
         long r = x;
        while (r*r > x){
        	System.out.println("before r is " + r);
             r = (r + x/r) / 2;
             System.out.println("after r is " + r);
        }
        return (int) r;
        
    }*/
	 
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
