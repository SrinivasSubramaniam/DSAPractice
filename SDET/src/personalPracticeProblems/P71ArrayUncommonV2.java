package personalPracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P71ArrayUncommonV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1={1,2,4,6};
		int[] ar2={2,2,6,8,10};
		
		List<Integer> uniqueList=new ArrayList<>();
		
		for (Integer i : ar1) {
			uniqueList.add(i);
		}
		
		for (Integer i : ar2) {
			if (uniqueList.contains(i))
			{
				Integer n=new Integer(i);
				uniqueList.remove(n);
			}
			else
			{
				uniqueList.add(i);
			}
			
		}
		System.out.println("Unqiue List is ");
		for (Integer i : uniqueList) {
			System.out.print(i + " ");
			
		}
		
		

	}

}
