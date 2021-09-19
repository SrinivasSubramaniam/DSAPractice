package SDETMockInterview;

import org.junit.Test;

import org.junit.Assert;

public class Delete5s {
	@Test
	public void test1(){
		int n=15958;
		Assert.assertEquals(1958, delete5(n));
	}
	@Test
	public void test2(){
		int n=-5859;
		Assert.assertEquals(-589, delete5(n));
	}
	@Test
	public void test4(){
		int n=-12535;
		Assert.assertEquals(-1235, delete5(n));
	}
	@Test
	public void test3(){
		int n=-50000;
		Assert.assertEquals(0, delete5(n));
	}

	private int delete5(int n) {
		 String s = Integer.toString(n);
		 int max=Integer.MIN_VALUE;
		 for (int i=0;i<s.length();i++){
			 if(s.charAt(i)=='5') {
				String temp= s.substring(0,i)+s.substring(i+1);
				int tempInt = Integer.parseInt(temp);
				max=Math.max(tempInt, max);
			 }
			 }
		 return max;
		
	}
}
