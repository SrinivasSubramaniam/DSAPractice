package personalPracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P40_ArraysIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1={1,2,2,1};
		int[] n2={2,2};
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		for (Integer i : n1) {
			list1.add(i);
		}
		for (Integer i : n2) {
			list2.add(i);
		}
		list1.retainAll(list2);
		System.out.println(list1);
		
		
	}

}
