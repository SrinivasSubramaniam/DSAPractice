package personalPracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P22_Anagrams {

	public static void main(String[] args) {
		String s1="anagram";
		String s2="margana";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean equals = c1.equals(c2);
		if (Arrays.equals(c1, c2))
		{
			System.out.println("Anagrams ");
		}

	}

}
