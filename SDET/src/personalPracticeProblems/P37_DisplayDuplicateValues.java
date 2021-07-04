package personalPracticeProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class P37_DisplayDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={1,3,3,3,5,6,7};
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if (n[i]==n[j])
				{
					set.add(n[i]);
				}
			}
			
		}
		System.out.println(set);

	}

}
