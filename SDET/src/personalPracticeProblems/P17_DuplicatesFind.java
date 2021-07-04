package personalPracticeProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class P17_DuplicatesFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] n ={1,1,3,5,5,7,9};
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i : n) {
			if (set.contains(i))
			{
				System.out.println(i);
			}else
			{
				set.add(i);
			}
		}

	}

}
