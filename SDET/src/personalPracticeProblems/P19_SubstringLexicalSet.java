package personalPracticeProblems;

import java.util.SortedSet;
import java.util.TreeSet;

public class P19_SubstringLexicalSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to java";
		String word = s.replace(" ", "");
		SortedSet<String> set=new TreeSet<String>();
		for (int i = 0; i <= word.length()-3; i++) {
			set.add(word.substring(i,i+3));
			System.out.println(i);
		}
		System.out.println(set);

	}

}
