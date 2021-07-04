package personalPracticeProblems;

import java.util.SortedSet;
import java.util.TreeSet;

public class P26_SubStringLexical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="ava";
		System.out.println(s2.substring(0,3));
		String s="welcome to java";
		String word = s.replace(" ", "");
		System.out.println(word.length());
		SortedSet<String> set=new TreeSet<String>();
		for (int i = 0; i <= word.length()-3; i++) {
			set.add(word.substring(i,i+3));
			System.out.println(i);
		}
		System.out.println(set.first());
		System.out.println(set.last());
		/*
		String s="welcome to java";
		String word = s.replace(" ", "");
		String smallest=word.substring(0,3);
		String largest=word.substring(0,3);
		for (int i = 0; i <= word.length()-3; i++) {
			if (word.substring(i,i+3).compareTo(smallest)<0)
			{
				smallest=word.substring(i,i+3);
			}
			if (word.substring(i,i+3).compareTo(largest)>0)
			{
				largest=word.substring(i,i+3);
			}
		}
		System.out.println("Smallest is "+smallest);
		System.out.println("Largest is "+largest);*/
	
		

	}

}
