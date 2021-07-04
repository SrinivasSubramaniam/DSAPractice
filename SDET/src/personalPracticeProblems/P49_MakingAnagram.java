package personalPracticeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P49_MakingAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2="cde";
		List<Character> ar=new ArrayList<Character>();
		for (Character c : s1.toCharArray()) {
			ar.add(c);
		}
		for (Character c : s2.toCharArray()) {
			if (!ar.contains(c))
			{
				ar.add(c);
			}else
			{
				Character ch=new Character(c);
				ar.remove(c);
			}
			
		}
		System.out.println(ar);
		
		
		

	}

}
