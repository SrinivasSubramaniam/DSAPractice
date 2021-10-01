package assessment;
import java.util.Arrays;
import java.util.regex.Pattern;

import org.junit.*;

public class RGBCMYK {
	@Test
	public void test1(){
		String s="255,175,055";
		coloChng(s);
		//System.out.println(Arrays.toString(coloChng(s)));
		
	}
	@Test
	public void test2(){
		String s="075,255,175";
		coloChng(s);
		//System.out.println(Arrays.toString(coloChng(s)));
		
	}
	@Test
	public void test3(){
		String s="000,000,000";
		coloChng(s);
		
	}
	@Test
	public void test4(){
		String s="255,255,255";
		coloChng(s);
		//System.out.println(Arrays.toString(coloChng(s)));
		
	}
	
	private void coloChng(String line) {
		
		String[] value = line.split(",");
		int r = Integer.parseInt(value[0]);
		int g = Integer.parseInt(value[1]);
		int b = Integer.parseInt(value[2]);
		//System.out.println(" r g b is "+ r +" "+g+ " "+b);

		double rValue = r / 255.0;
		double gValue = g / 255.0;
		double bValue = b / 255.0;
		//System.out.println(" r g b double value "+ rValue +" "+gValue+ " "+bValue);
		double k = 1 - Math.max(Math.max(rValue, gValue), bValue);
		//System.out.println("k value is "+k);
		if (k == 1) {
			System.out.println("000"+","+"000"+","+"255");
		}

		int div = 1 - (int)k;
		int c = (int)((1 - rValue - k)) / div;
		int m = (int)((1 - gValue - k)) / div;
		int y = (int)((1 - bValue - k)) / div;
		System.out.println(c/255+","+m/255+","+y/255+","+(int)k/255); // the output was not as expected need to include the conversion from normal int to 8 bit int
	}

}
