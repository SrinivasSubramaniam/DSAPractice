package personalPracticeProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class P61_Panagram {

	public static void main(String[] args) {
		String s="anksvsdafaga";
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		if (set.size()==26)
		{
			System.out.println("Panagram");
		}else
		{
			System.out.println("Not a Panagram");
		}

	}

}
