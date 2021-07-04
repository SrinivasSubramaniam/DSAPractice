package personalPracticeProblems;

import java.util.ArrayList;
import java.util.List;

public class P39_SingleNumber {

	public static void main(String[] args) {
		// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
		int[] n={2,2,1};
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i : n) {
			if (!list1.contains(i))
			{
				list1.add(i);
				System.out.println(list1);
			}else
			{
				Integer value = new Integer(i);
				System.out.println("i is "+ i);
				System.out.println("Value is "+value);
				list1.remove(value);
			}
			
		}
		System.out.println(list1);

	}

}
