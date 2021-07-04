package personalPracticeProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class P63_WeightedSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbcccdddd";
		int currentweight=0;
		Character previousletter=' ';
		Set<Integer> weights = new LinkedHashSet<Integer>();
		for (Character letter : s.toCharArray()) {
			if (letter!=previousletter)
			{
				currentweight=letter-'a'+1;
			}
			else
			{
				currentweight+=letter-'a'+1;
			}
			weights.add(currentweight);
			previousletter=letter;
		}
		for (Integer value : weights) {
			System.out.println(value);
		}
		int n=3;
		if (weights.contains(n))
		{
			System.out.println("Yes");
		}
	}

}
