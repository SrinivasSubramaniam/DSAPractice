package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Anagrams {
	@Test
	public void test1(){
		String str="kishore";
		String matchStr="sh";
		findAnagram(str,matchStr);
		System.out.println();
	}
	@Test
	public void test2(){
		String str="abccba";
		String matchStr="bac";
		findAnagram(str,matchStr);
		System.out.println();
	}

	private void findAnagram(String str, String matchStr) {
		int[] kAscii=new int[26];
		int[] ascii=new int[26];
		List<Integer> list=new ArrayList<Integer>();
		for (int i=0;i<matchStr.length();i++){
			kAscii[matchStr.charAt(i)-'a']++;
			ascii[str.charAt(i)-'a']++;
		}
		if (Arrays.equals(ascii, kAscii)) list.add(0);
		int left=0,right=matchStr.length();
		while (right<str.length()){
			ascii[str.charAt(left++)-'a']--;
			ascii[str.charAt(right++)-'a']++;
			if (Arrays.equals(ascii, kAscii)) list.add(left);		
			
		}
		System.out.println(list);
		
	}
	
	


}
