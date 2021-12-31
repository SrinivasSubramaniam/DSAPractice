package interview.practice;

import java.util.Arrays;

import org.junit.Test;

public class StringRev {
	@Test
	public void test1(){
		String s="How Many eggs are in a half dozen, 13?";
		findX(s);
	}
	@Test
	public void test2(){
		String s="he is a good prgrammer, he won 865 competeions, but sometimes he dont. what do you thin? All test-cases should pass. Done-done?";
		findX(s);
	}

	private void findX(String s) {
		//String[] split = s.split("[^A-Za-z-]");
		String[] split = s.split(" ");
		String string = split.toString();
		String replaceAll = string.replaceAll("[^A-Za-z-]","");
		//String[] split = replaceAll.split(" ");
		int length = split.length;
		//System.out.println(Arrays.toString(replaceAll));
		System.out.println(length-1);
	}

}
