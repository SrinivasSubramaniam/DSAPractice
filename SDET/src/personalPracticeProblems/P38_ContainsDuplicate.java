package personalPracticeProblems;

import java.util.ArrayList;
import java.util.List;

public class P38_ContainsDuplicate {

	public static void main(String[] args) {
		// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		int[] n={1,2,3,1};
		boolean flag=true;
		List <Integer> list =new ArrayList<Integer>();
		/*for (int i = 0; i < n.length-1; i++) {
			if (n[i]==n[i+1])
			{
				flag=false;
			}
		}
		if (flag==true)
		{
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}*/
		
		for (Integer i : n) {
			if (list.contains(i))
			{
				System.out.println("Yes");
				break;
			}else
			{
				list.add(i);
			}
		}
		

	}

}
