package personalPracticeProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class P54_TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="world";
		
		Set<Character> set1=new LinkedHashSet<Character>();
		Set<Character> set2=new LinkedHashSet<Character>();
		for (Character c : s1.toCharArray()) {
			set1.add(c);
		}
		for (Character c : s2.toCharArray()) {
			set2.add(c);
		}
	
		for (Character c : set1) {
			if (set2.contains(c))
			{
				System.out.println(c);
			}
		}
		
		

	}

}
