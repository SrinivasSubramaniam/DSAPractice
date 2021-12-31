package dataStructures.String;

import java.util.Arrays;

import org.junit.Test;

public class SortString {
	@Test
	public void test1(){
		String s="jdkoepacmbtr";
		sortStringAsciiSmall(s);
	}
	@Test
	public void test2(){
		String s="dcabb";
		sortStringAsciiSmall(s);
	}

	private void sortStringBrute(String s) {
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if (ch[i]>ch[j]){
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
		
	}
	private void sortStringAscii(String s) {
		int [] ascii=new int[128];
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			ascii[ch]++;
		}
		s="";
		for (int i=0;i<ascii.length;i++){
			while (ascii[i]-->0) s+=(char)i;
		}
		System.out.println(s);
		
	}
	private void sortStringAsciiSmall(String s) {
		int [] ascii=new int[26];
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			ascii[ch-'a']++;
		}
		s="";
		for (int i=0;i<ascii.length;i++){
			while (ascii[i]-->0) s+=(char)(i+97);
		}
		System.out.println(s);
		
	}

}
