package slidingWindow;

import org.junit.Test;

public class SquareRoot {
	@Test
	public void test1(){
		int x=5;
		System.out.println(mySqrt(x));
	}
	
	
	 public int mySqrt(int x) {
	        int outPut=0;
	        if (x==0) return 0;
	        if (x>=1 && x<=3) return 1;
	        for (int i=2;i<x;i++){
	            if(i*i==x) return i;
	            else if ((i*i)>x) return i-1;
	        }
	        return 0;
	        
	    }

}
