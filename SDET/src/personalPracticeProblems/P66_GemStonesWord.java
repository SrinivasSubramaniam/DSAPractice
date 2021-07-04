package personalPracticeProblems;

import java.util.LinkedList;
import java.util.List;

public class P66_GemStonesWord {

	public static void main(String[] args) {
		// To check if the character occurs in every rock
		String s1="abcdde";
		String s2="baccd";
		String s3="eeabg";
		List<Character> list1 = new LinkedList<Character>();
		List<Character> list2 = new LinkedList<Character>();
		List<Character> list3 = new LinkedList<Character>();
		for (Character s : s1.toCharArray()) {
			list1.add(s);
		}
		for (Character s : s2.toCharArray()) {
			list2.add(s);
		}
		for (Character s : s3.toCharArray()) {
			list3.add(s);
		}
		for (Character c : list3) {
			if (list1.contains(c)&&list2.contains(c))
			{
				System.out.println(c);
			}
		}

	}

}
